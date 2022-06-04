package appbooklandia.model;

public class ProdutoPedido {
    private Produto produto;
    private int quantidade;

    public ProdutoPedido() {
    }


    public ProdutoPedido( Produto produto) {
        this.produto = produto;
    }

    public ProdutoPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }


    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
