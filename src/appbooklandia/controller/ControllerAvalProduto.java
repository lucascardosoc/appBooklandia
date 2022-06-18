package appbooklandia.controller;

import appbooklandia.dal.AvaliarDAO;
import appbooklandia.dal.ChamadoDAO;
import appbooklandia.model.AvaliacoesProdutos;
import appbooklandia.model.Chamados;
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

    public void cadastraAvaliacao() throws SQLException {
        AvaliacoesProdutos avaliacoes_produtos = new AvaliacoesProdutos();
        avaliacoes_produtos.setCodigoDoProduto(Integer.parseInt(view.getTxtCodProduto().getText()));
        avaliacoes_produtos.setCodigoDoCliente(view.getTxtCodCliente().getText());
        avaliacoes_produtos.setNota(Integer.parseInt(view.getTxtNota().getText()));
        avaliacoes_produtos.setDescricao(view.getTxtDescricao().getText());

        AvaliarDAO avaliarDao = new AvaliarDAO();
        avaliarDao.adiciona(avaliacoes_produtos);
    }

    public void atualizaAvaliacao() throws SQLException {
        AvaliacoesProdutos avaliacoes_produtos = new AvaliacoesProdutos();
        avaliacoes_produtos.setCodigoDoProduto(Integer.parseInt(view.getTxtCodProduto().getText()));
        avaliacoes_produtos.setCodigoDoCliente(view.getTxtCodCliente().getText());
        avaliacoes_produtos.setNota(Integer.parseInt(view.getTxtNota().getText()));
        avaliacoes_produtos.setDescricao(view.getTxtDescricao().getText());

        AvaliarDAO avaliarDao = new AvaliarDAO();
        avaliarDao.altera(avaliacoes_produtos);
    }

    public void apagaAvaliacao() throws SQLException {
        AvaliacoesProdutos avaliacoes_produtos = new AvaliacoesProdutos();
        avaliacoes_produtos.setCodigoDoProduto(Integer.parseInt(view.getTxtCodProduto().getText()));
        avaliacoes_produtos.setCodigoDoCliente(view.getTxtCodCliente().getText());
        avaliacoes_produtos.setNota(Integer.parseInt(view.getTxtNota().getText()));
        avaliacoes_produtos.setDescricao(view.getTxtDescricao().getText());

        AvaliarDAO avaliarDao = new AvaliarDAO();
        avaliarDao.exclui(avaliacoes_produtos);
    }

    public void limpaTela() {
        view.getTxtCodCliente().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtNota().setText("");
    }
}
