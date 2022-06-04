package appbooklandia.model;


public class CategoriaDoProduto {
    private String codigo;
    private String nome;
    private String descricao;

    public CategoriaDoProduto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public CategoriaDoProduto(String codigo, String nome, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    /*
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /*
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /*
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /*
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
