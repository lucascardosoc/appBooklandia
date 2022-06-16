package appbooklandia.controller;

import appbooklandia.dal.ChamadoDAO;
import appbooklandia.dal.ClienteDAO;
import appbooklandia.model.Chamados;
import appbooklandia.model.Cliente;
import appbooklandia.view.FrmAbrirChamado;
import java.sql.SQLException;
import java.time.LocalDate;

public class ControllerAbrChamado {

    private FrmAbrirChamado view;

    public ControllerAbrChamado(FrmAbrirChamado view) {
        this.view = view;
    }

    public void consultaChamado() throws SQLException {
        String ticket = view.getTxtCodTicket().getText();

        ChamadoDAO chamadoDao = new ChamadoDAO();
        Chamados chamados = chamadoDao.recupera(ticket);

        if (chamados != null) {
            view.getTxtCodCliente().setText(chamados.getCodigoDoCliente());
            view.getTxtCodFuncionario().setText(String.valueOf(chamados.getCodigoDoFuncionario()));
            view.getTxtCodPedido().setText(String.valueOf(chamados.getCodigoDoPedido()));
            view.getTxtDescricao().setText(chamados.getDescricao());
        }
    }

    public void cadastraChamado() throws SQLException {
        Chamados chm = new Chamados();
        chm.setTicket(Integer.parseInt(view.getTxtCodTicket().getText()));
        chm.setCodigoDoCliente(view.getTxtCodCliente().getText());
        chm.setCodigoDoFuncionario(Integer.parseInt(view.getTxtCodFuncionario().getText()));
        chm.setCodigoDoPedido(Integer.parseInt(view.getTxtCodPedido().getText()));
        chm.setDescricao(view.getTxtDescricao().getText());

        ChamadoDAO chamadoDao = new ChamadoDAO();
        chamadoDao.adiciona(chm);
    }
    
    public void atualizaChamado() throws SQLException {
        Chamados chm = new Chamados();
        chm.setTicket(Integer.parseInt(view.getTxtCodTicket().getText()));
        chm.setCodigoDoCliente(view.getTxtCodCliente().getText());
        chm.setCodigoDoFuncionario(Integer.parseInt(view.getTxtCodFuncionario().getText()));
        chm.setCodigoDoPedido(Integer.parseInt(view.getTxtCodPedido().getText()));
        chm.setDescricao(view.getTxtDescricao().getText());

        ChamadoDAO chamadoDao = new ChamadoDAO();
        chamadoDao.altera(chm);
    }
    
    public void apagaChamado() throws SQLException {
        Chamados chm = new Chamados();
        chm.setTicket(Integer.parseInt(view.getTxtCodTicket().getText()));
        chm.setCodigoDoCliente(view.getTxtCodCliente().getText());
        chm.setCodigoDoFuncionario(Integer.parseInt(view.getTxtCodFuncionario().getText()));
        chm.setCodigoDoPedido(Integer.parseInt(view.getTxtCodPedido().getText()));
        chm.setDescricao(view.getTxtDescricao().getText());

        ChamadoDAO chamadoDao = new ChamadoDAO();
        chamadoDao.exclui(chm);
    }

    public void limpaTela() {
        view.getTxtCodCliente().setText("");
        view.getTxtCodFuncionario().setText("");
        view.getTxtCodPedido().setText("");
        view.getTxtCodTicket().setText("");
        view.getTxtDescricao().setText("");
    }

}
