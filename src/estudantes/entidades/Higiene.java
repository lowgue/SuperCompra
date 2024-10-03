package estudantes.entidades;

/**
 * A classe Higiene representa produtos de higiene pessoal, estendendo as funcionalidades da classe CuidadosPessoais.
 */
public class Higiene extends CuidadosPessoais{

    /**
     * Construtor da classe Higiene.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     * @param validade Data de validade do produto em formato long.
     * @param fragrancia Fragrância do produto.
     */

    public Higiene(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);
    }
}
