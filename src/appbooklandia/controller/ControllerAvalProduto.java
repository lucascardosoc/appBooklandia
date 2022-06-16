package appbooklandia.controller;

import appbooklandia.dal.AvaliarDAO;
import appbooklandia.model.AvaliacoesProdutos;
import appbooklandia.view.FrmAvaliarProduto;
import java.sql.SQLException;

public class ControllerAvalProduto {

    private FrmAvaliarProduto view;

    public ControllerAvalProduto(FrmAvaliarProduto view) {
        this.view = view;
    }

    public void consultaAvaliacao() throws SQLException {
        String codigoDoProduto = view.getTxtCodProduto().getText();

        AvaliarDAO avaliarDao = new AvaliarDAO();
        AvaliacoesProdutos avaliacoes_produtos = avaliarDao.recupera(codigoDoProduto);

        if (avaliacoes_produtos != null) {
            view.getTxtCodCliente().setText(String.valueOf(avaliacoes_produtos.getCodigoDoCliente()));
            view.getTxtNota().setText(String.valueOf(avaliacoes_produtos.getNota()));
            view.getTxtDescricao().setText(avaliacoes_produtos.getDescricao());
        }
    }

    public void limpaTela() {
        view.getTxtCodCliente().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtNota().setText("");
    }
}
