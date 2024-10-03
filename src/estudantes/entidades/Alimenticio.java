package estudantes.entidades;

/**
 * A classe  Alimenticio representa produtos alimentícios, estendendo funcionalidades da classe Produto.
 * Essa classe guarda apenas um atributo, sendo o atributo de validade.
 *
 */
public class Alimenticio extends Produto{
    private long validade;

    /**
     * Retorna a validade do produto
     *
     * @param validade Recebe como parametro a validade do produto.
     * @return retorna a validade do alimento.
     *
     */

    public long getValidade(long validade){
        return  this.validade;
    }

    /**
     * Construtor da classe Alimenticio
     * @param codigo pega o codigo do produto
     * @param nome pega o nome do produto
     * @param fabricante pega o fabricante do produto
     * @param peso pega o peso do produto
     * @param validade pega a validade do produto
     */

    public Alimenticio(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso);
        this.validade = validade;
    }

    
}
