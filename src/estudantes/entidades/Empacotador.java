package estudantes.entidades;

import professor.entidades.*;

/**
 * Classe que traz a lógica do algoritmo de "ensacolamento" dos produtos.
 * <br><br>
 * Você pode incluir novos atributos e métodos nessa classe para criar
 * lógicas mais complexas para o gerenciamento empacotamento de produtos,
 * mas esses <strong>atributos e métodos devem ser todos privados</strong>.
 * O único método público deve ser "agir".
 *
 * @authors Luan Rodrigues Martins, Ismael Hister Oliveira
 * @version 1.0
 */
public class Empacotador {

    public int proximoCaixa = 1; //usada para saber para onde o empacotador deve ir


    /**
     * Executa a lógica de empacotamento e troca de caixa.
     * Esse método é o único método de controle invocado durante a simulação
     * do supermercado.
     * <br><br>
     * Aqui podem ser feitas todas as verificações sobre os produtos no monte e
     * nas sacolas do caixa em que o empacotador está. A partir dessas informações,
     * você pode colocar produtos do monte daquele caixa em sacolas e despachar
     * sacolas para o fiscal.
     * <br><br>
     * O atributo "proximoCaixa" é usado pelo simulador para mover o empacotador
     * para outro caixa (ou permanecer no mesmo se ele quiser), ou seja, o
     * empacotador sempre vai para o caixa do número indicado nesse atributo
     * após um ciclo de simulação.
     * <br><br>
     * <strong>O empacotador não pode levar produtos com ele</strong> de um
     * caixa para outro, ou seja, você não deve criar atributos com vetores,
     * matrizes ou coleções (ArrayList, HashSet etc.) de produtos.
     * @param caixa o caixa onde está o empacotador
     * @param fiscal fiscal que pode ser consultado sobre as sacolas despachadas
     */
    public void agir(Caixa caixa, Fiscal fiscal) {
// Se o monte do caixa estiver vazio, ir para o próximo caixa
        if (caixa.contarProdutosNoMonte() == 0) {
            proximoCaixa++;
            if (proximoCaixa == 6) {
                proximoCaixa = 1;
            }
            return;
        }

// Usar um loop para percorrer as cinco sacolas
        for (int i = 1; i <= 5; i++) {
            Sacola sacola = caixa.getSacola(i);
            int peso = 0;

            // Somar os pesos dos produtos já na sacola
            Produto[] produtosSacola = sacola.getArrayDaSacola();
            for (Produto p : produtosSacola) {
                peso += p.getPeso();
            }

            // Verificar se ainda há produtos no monte
            Produto[] arrayDoMonte = caixa.getArrayDoMonte();
            if (arrayDoMonte.length > 0) {
                Produto produtoAdquirido = caixa.pegarProdutoDoMonte(arrayDoMonte[0]);

                // Verificar se há conflitos entre Cuidados Pessoais e Alimentícios
                boolean conflito = false;
                for (Produto produtoExistente : produtosSacola) {
                    if ((produtoAdquirido instanceof CuidadosPessoais && produtoExistente instanceof Alimenticio) ||
                            (produtoAdquirido instanceof Alimenticio && produtoExistente instanceof CuidadosPessoais)) {
                        conflito = true;
                        break; // Sair do loop se encontrar um conflito
                    }
                }

                // Verificar se há conflitos entre Limpeza e Alimentícios, Eletroeletrônicos, Cuidados Pessoais
                for (Produto produtoExistente : produtosSacola) {
                    if ((produtoAdquirido instanceof Limpeza &&
                            (produtoExistente instanceof Alimenticio || produtoExistente instanceof Eletroeletronico || produtoExistente instanceof CuidadosPessoais)) ||
                            (produtoExistente instanceof Limpeza &&
                                    (produtoAdquirido instanceof Alimenticio || produtoAdquirido instanceof Eletroeletronico || produtoAdquirido instanceof CuidadosPessoais))) {
                        conflito = true;
                        break;
                    }
                }

                // Verificar se há conflitos entre Refrigerados e outros tipos de produtos
                for (Produto produtoExistente : produtosSacola) {
                    if ((produtoAdquirido instanceof Refrigerado && !(produtoExistente instanceof Refrigerado)) ||
                            (!(produtoAdquirido instanceof Refrigerado) && produtoExistente instanceof Refrigerado)) {
                        conflito = true;
                        break;
                    }

                    // Verificar diferença de temperatura entre produtos refrigerados
                    if (produtoAdquirido instanceof Refrigerado && produtoExistente instanceof Refrigerado) {
                        Refrigerado produtoRefrigeradoAdquirido = (Refrigerado) produtoAdquirido;
                        Refrigerado produtoRefrigeradoExistente = (Refrigerado) produtoExistente;
                        int diferencaTemperatura = Math.abs(produtoRefrigeradoAdquirido.getTemperaturaIdeal() - produtoRefrigeradoExistente.getTemperaturaIdeal());
                        if (diferencaTemperatura > 15) {
                            conflito = true;
                            break;
                        }
                    }
                }

                // Só adicionar o produto se não houver conflito
                if (!conflito) {
                    // Verificar se o produto pode ser adicionado sem ultrapassar o limite de peso
                    if (peso + produtoAdquirido.getPeso() > 5000) {
                        // Verificar se a sacola tem mais de 1000 gramas (1 kg) antes de despachar
                        if (peso >= 1000) {
                            // Despachar a sacola e continuar com a próxima
                            caixa.despacharSacola(i);
                            sacola = caixa.getSacola(i); // Após despacho, pega automaticamente a próxima sacola
                            peso = 0; // Resetar o peso após o despacho
                        }
                    } else {
                        // Colocar o produto na sacola nova ou existente se não ultrapassou o peso
                        sacola.colocarProdutoNaSacola(produtoAdquirido);
                        peso += produtoAdquirido.getPeso(); // Atualizar o peso da sacola após adicionar o produto
                    }
                }
            }
    
            // Se não há mais produtos no monte, sair do loop
            if (caixa.contarProdutosNoMonte() == 0) {
                break;
            }
        }

// Incrementar proximoCaixa se for menor que 6
        proximoCaixa++;
        if (proximoCaixa == 6) {
            proximoCaixa = 1;
        }


    }
}