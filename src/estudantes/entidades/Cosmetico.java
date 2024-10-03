package estudantes.entidades;

/**
 * A classe Cosmeticos representa produtos cosméticos que herdam características da classe CuidadosPessoais,
 * adicionando um atributo específico para o tipo de pele.
 */
public class Cosmetico extends CuidadosPessoais {
    private char tipoDePele;

    /**
     * Construtor da classe Cosmeticos.
     *
     * @param codigo      Código único do cosmético.
     * @param nome        Nome do cosmético.
     * @param fabricante  Fabricante do cosmético.
     * @param peso        Peso do cosmético em gramas.
     * @param validade    Data de validade do cosmético.
     * @param fragrancia  Fragrância do cosmético.
     * @param tipoDePele  Tipo de pele para o qual o cosmético é indicado.
     */
    public Cosmetico(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia, char tipoDePele) {
        super(codigo, nome, fabricante, peso, validade, fragrancia);
        this.tipoDePele = tipoDePele;
    }

    /**
     * Retorna o tipo de pele para o qual o cosmético é indicado.
     *
     * @param tipoDePele Tipo de pele informado.
     * @return O tipo de pele armazenado no objeto.
     */
    public char getTipoDePele(char tipoDePele) {
        return this.tipoDePele;
    }
}
