package estudantes.entidades;

/**
 * A classe CuidadosPessoais representa produtos relacionados aos cuidados pessoais estendendo a classe Produto.
 * Adiciona atributos como validade e fragância específicos para esses produtos.
 */
public class CuidadosPessoais extends Produto{
    private long validade;
    private String fragrancia;

    /**
     * Retorna a validade do produto.
     *
     * @param validade A data da validade que pode ser utilizada ou verificada.
     * @return Retorna a data de validade do produto em formato long.
     */
    public long getValidade(long validade){
        return this.validade;
    }

    /**
     * Retorna a fragancia do produto
     *
     * @param fragrancia
     * @return
     */
    public String getFragrancia(String fragrancia){
        return this.fragrancia;
    }
    /**
     * Construtor da classe Papelaria.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     * @param validade Data de validade do produto em formato long.
     * @param fragrancia Nome do cheiro dado ao produto em String.
     */
    public CuidadosPessoais(int codigo, String nome, String fabricante, int peso, long validade, String fragrancia) {
        super(codigo, nome, fabricante, peso);
        this.validade = validade;
        this.fragrancia = fragrancia;
    }




}
