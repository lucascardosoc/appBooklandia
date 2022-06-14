package appbooklandia.model;

public class Chamados {

    private int ticket;
    private boolean status;
    private int codigoDoFuncionario;
    private String codigoDoCliente;
    private int codigoDoPedido;
    private String descricao;

    public Chamados(int ticket, boolean status, int codigoDoFuncionario, String codigoDoCliente, int codigoDoPedido, String descricao) {
        this.ticket = ticket;
        this.status = status;
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.codigoDoCliente = codigoDoCliente;
        this.codigoDoPedido = codigoDoPedido;
        this.descricao = descricao;
    }

    public Chamados() {
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(int codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public String getCodigoDoCliente() {
        return codigoDoCliente;
    }

    public void setCodigoDoCliente(String codigoDoCliente) {
        this.codigoDoCliente = codigoDoCliente;
    }

    public int getCodigoDoPedido() {
        return codigoDoPedido;
    }

    public void setCodigoDoPedido(int codigoDoPedido) {
        this.codigoDoPedido = codigoDoPedido;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
