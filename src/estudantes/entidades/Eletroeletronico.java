package estudantes.entidades;

/**
 * A classe Eletroeletronico representa produtos eletroeletrônicos, estendendo as funcionalidades da classe Produto,
 * além de adicionar um atributo específico para a tensão elétrica.
 *
 */
public class Eletroeletronico extends Produto{
    private short tensao;

    /**
     * Retorna a tensão do produto
     *
     * @param tensao O valor da tensão a ser verificado ou utilizado.
     * @return Retorna a tensão elétrica do produto.
     */

    public int getTensao(short tensao){
        return this.tensao;
    }

    /**
     * Construtor da classe Papelaria.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     * @param tensao Tensão elétrica do produto.
     */
    public Eletroeletronico(int codigo, String nome, String fabricante, int peso, short tensao) {
        super(codigo, nome, fabricante, peso);
        this.tensao = tensao;
    }

}
