package appbooklandia.controller;

import appbooklandia.model.Chamados;
import appbooklandia.view.FrmAbrirChamado;

public class ControllerAbrChamado {

    private FrmAbrirChamado view;

    public ControllerAbrChamado(FrmAbrirChamado view) {
        this.view = view;
    }

    public void abrirChamado() {
        Chamados chamados = new Chamados();
        chamados.setTxtCodPedido(view.getTxtCodPedido().getText());
        chamados.setTxtDescricao(view.getTxtDescricao().getText());
        chamados.setTxtNomeCliente(view.getTxtNomeCliente().getText());
        chamados.setTxtNomeFuncionario(view.getTxtNomeFuncionario().getText());
    }

    public void limpaTela() {
        view.getTxtCodPedido().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtNomeCliente().setText("");
        view.getTxtNomeFuncionario().setText("");
    }

}
