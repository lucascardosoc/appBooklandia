package appbooklandia.controller;

import appbooklandia.model.AvaliacoesProdutos;
import appbooklandia.view.FrmAvaliarProduto;

public class ControllerAvalProduto {

    private FrmAvaliarProduto view;

    public ControllerAvalProduto(FrmAvaliarProduto view) {
        this.view = view;
    }

    public void avaliaProduto() {
        AvaliacoesProdutos avaliacao = new AvaliacoesProdutos();
        avaliacao.setTxtCodCliente(view.getTxtCodCliente().getText());
        avaliacao.setTxtDescricao(view.getTxtDescricao().getText());
        avaliacao.setTxtNota(view.getTxtNota().getText());
    }

    public void limpaTela() {
        view.getTxtCodCliente().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtNota().setText("");
    }
}
