package estudantes.entidades;

/**
 * Classe que representa produtos de papelaria, estendendo funcionalidades de Produto.
 */
public class Papelaria extends Produto {
    /**
     * Construtor da classe Papelaria.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     */
    public Papelaria(int codigo, String nome, String fabricante, int peso) {
        super(codigo, nome, fabricante, peso);
    }
}
