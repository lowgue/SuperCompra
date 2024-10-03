package estudantes.entidades;

/**
 * A classe Refrigerados representa produtos perecíveis que necessitam de refrigeração.
 * Ela ainda herda atrbitos e métodos da classe Perecivel.
 */
public class Refrigerado extends Perecivel{
    private int temperaturaIdeal;

    /**
     *
     * @return Retorna a temperatura ideal de armazenamento do produto
     */
    public int getTemperaturaIdeal(){
        return this.temperaturaIdeal;
    }

    /**
     * Construtor da classe Refrigerado.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     * @param validade Data de validade do produto em formato long.
     * @param temperaturaIdeal Temperatura ideal de armazenamento em graus Celsius.
     */
    public Refrigerado(int codigo, String nome, String fabricante, int peso, long validade, int temperaturaIdeal) {
        super(codigo, nome, fabricante, peso, validade);
        this.temperaturaIdeal = temperaturaIdeal;
    }

}
