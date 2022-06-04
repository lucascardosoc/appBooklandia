package appbooklandia.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int numeroDoPedido;
    private FormaDePagamento formaDePagamento;
    private Cliente cliente;
    private boolean status;
    private LocalDate data;
    private String cupom;
    private double valorTotal;
    private ArrayList<ProdutoPedido> produtos;

    public Pedido() {
        this.produtos = new ArrayList<ProdutoPedido>();
    }

    public Pedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
        this.produtos = new ArrayList<ProdutoPedido>();
    }

     public void adicionaProduto( Produto p, int quantidade){
         ProdutoPedido produtoPedido = new ProdutoPedido(p, quantidade);
         this.produtos.add(produtoPedido);
     }
    
    public double calculaValorTotal(){
        double valorTotal = 0.0;
        for (ProdutoPedido pp: this.produtos){
            Produto p = pp.getProduto();
            int quantidade = pp.getQuantidade();
            valorTotal = valorTotal + (p.getPreco() + quantidade);
        }
        return valorTotal;
    }
     
     
    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public boolean isStatus() {
        return status;
    }

    public LocalDate getData() {
        return data;
    }

    public String getCupom() {
        return cupom;
    }

    
}
