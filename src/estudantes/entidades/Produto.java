package estudantes.entidades;

import java.util.Objects;

/**
 * A classe Produto representa um produto genérico com atributos como código, nome, fabricante e peso.
 */
public class Produto {
    private int codigo;
    private String nome;
    private String fabricante;
    private int peso;

    /**
     * Recebe o código do produto.
     *
     * @return retorna o código do produto.
     */
    // Getters sem parâmetros
    public int getCodigo() {
        return this.codigo;
    }

    /**
     * Recebe o nome do produto.
     *
     * @return retorna o nome do produto.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Recebe o nome do fabricante do produto.
     *
     * @return retorna o nome do fabricante do produto.
     */
    public String getFabricante() {
        return this.fabricante;
    }

    /**
     * Recebe o peso do produto.
     *
     * @return Retorna o peso do produto em gramas.
     */
    public int getPeso() {
        return this.peso;
    }

    /**
     * Construtor da classe Produto.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     */
    // Construtor para inicializar os atributos
    public Produto(int codigo, String nome, String fabricante, int peso) {
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.peso = peso;
    }

    /**
     * Compara este produto com outros objetos para verificar se são iguais.
     *
     * @param outro O outro objeto a ser comparado.
     * @return Retorna true se os produtos forem iguais e false caso contrário
     */
    @Override
    public boolean equals(Object outro) {
        //qualquer coisa é diferente de NULL
        if (outro == null) {
            return false;
        }
        //propriedade REFLEXIVA
        if (this == outro) {
            return true;
        }
        //objetos de classes diferentes nunca são iguais
        if (this.getClass() != outro.getClass()) {
            return false;
        }
        Produto outroProduto = (Produto) outro;
        //verifica se todos os atributos são iguais
        if (this.codigo == outroProduto.codigo && this.nome.equals(outroProduto.nome) && this.fabricante.equals(outroProduto.fabricante) && this.peso == outroProduto.peso) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna um código hash para este produto.
     *
     * @return Retorna o código hash calculado para o produto.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = hash * 31;
        return Objects.hash(nome, codigo, peso, fabricante);
    }

    /**
     * Retorna uma representação em string do produto.
     *
     * @return Retorna uma string contendo os detalhes do produto.
     */
    @Override
    public String toString() {
        return STR."Nome, \{this.nome} Código = \{this.codigo} Peso \{this.peso} Fabricante \{this.fabricante}";
    }
}


