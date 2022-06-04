package appbooklandia.model;

public enum FormaDePagamento {
    Boleto("boleto"),
    Pix("pix"),
    CartaoDeCredito("Cartão de Crédito");

    public final String descricao;
    
    FormaDePagamento(String descricao){
        this.descricao = descricao;
    }
    
    public String descricao(){
        return descricao;
    }
}

