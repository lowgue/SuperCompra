package estudantes.entidades;

/**
 * A classe Limpeza representa produtos de limpeza, estendendo funcionalidades de Produto.
 */
public class Limpeza extends Produto{

    /**
     * Construtor da classe Papelaria.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     */
    public Limpeza(int codigo, String nome, String fabricante, int peso) {
        super(codigo, nome, fabricante, peso);
    }
}
