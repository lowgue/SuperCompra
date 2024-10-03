package estudantes.entidades;

/**
 * A classe Perecivel representa alimentos perecíveis, estendendo funcionalidades da classe Alimenticio.
 */
public class Perecivel extends Alimenticio{
    /**
     * Construtor da classe Papelaria.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     * @param validade Data de validade do produto em formato long.
     */
    public Perecivel(int codigo, String nome, String fabricante, int peso, long validade) {
        super(codigo, nome, fabricante, peso, validade);
    }
}
