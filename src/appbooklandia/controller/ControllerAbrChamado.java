package appbooklandia.controller;

import appbooklandia.dal.ChamadoDAO;
import appbooklandia.model.Chamados;
import appbooklandia.view.FrmAbrirChamado;
import java.sql.SQLException;

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
//            view.getTxtCodFuncionario().setText(chamados.getCodigoDoFuncionario());
//            view.getTxtCodPedido().setText(chamados.getCodigoDoPedido());
//            view.getTxtCodTicket().setText(chamados.getTicket());
            view.getTxtDescricao().setText(chamados.getDescricao());
        }
    }

    public void limpaTela() {
        view.getTxtCodCliente().setText("");
        view.getTxtCodFuncionario().setText("");
        view.getTxtCodPedido().setText("");
        view.getTxtCodTicket().setText("");
        view.getTxtDescricao().setText("");
    }

}
