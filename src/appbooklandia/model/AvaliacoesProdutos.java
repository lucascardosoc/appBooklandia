package appbooklandia.model;

public class AvaliacoesProdutos {

    private int codigoDoProduto;
    private String codigoDoCliente;
    private int nota;
    private String descricao;

    public AvaliacoesProdutos(int codigoDoProduto, String codigoDoCliente, int nota, String descricao) {
        this.codigoDoProduto = codigoDoProduto;
        this.codigoDoCliente = codigoDoCliente;
        this.nota = nota;
        this.descricao = descricao;
    }

    public AvaliacoesProdutos() {
    }

    public int getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(int codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public String getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTxtCodCliente(String text) {
    }

    public void setTxtDescricao(String text) {
    }

    public void setTxtNota(String text) {
    }

}
