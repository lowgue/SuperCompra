package estudantes.entidades;

/**
 * A classe NaoPerecivel representa alimentos não perecíveis, estendendo a classe  Alimenticio.
 * Adiciona um atributo específico para o tipo de armazenamento do alimento.
 *
 */
public class NaoPerecivel extends Alimenticio{
    private String tipoDeArmazenamento;

    /**
     * Retorna o tipo de armazenamento do alimento
     *
     * @param tipoDeArmazenamento O tipo de armazenamento a ser verificado ou utilizado.
     * @return Retorna o tipo de armazenamento do alimento não perecível.
     */
    public String getTipoDeArmazenamento(String tipoDeArmazenamento){
        return this.tipoDeArmazenamento;
    }

    /**
     * Construtor da classe NaoPerecivel.
     *
     * @param codigo Código único do produto.
     * @param nome Nome do produto.
     * @param fabricante Fabricante do produto.
     * @param peso Peso do produto em gramas.
     * @param validade Data de validade do produto em formato long.
     */
    public NaoPerecivel(int codigo, String nome, String fabricante, int peso,long validade, String tipoDeArmazenamento) {
        super(codigo, nome, fabricante, peso, validade);
        this.tipoDeArmazenamento = tipoDeArmazenamento;
    }

}
