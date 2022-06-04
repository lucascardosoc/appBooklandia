package appbooklandia.controller;

import appbooklandia.model.Produto;
import appbooklandia.view.FrmCadProdutos;

public class ControllerCadProdutos {
    
    private FrmCadProdutos view;
    
    public ControllerCadProdutos(FrmCadProdutos view){
        this.view = view;
    }
    
    public void cadastraProduto() {
        Produto p = new Produto();
        p.setTxtCategoria(view.getTxtCategoria().getText());
        p.setTxtCodigo(view.getTxtCodigo().getText());
        p.setTxtDescricao(view.getTxtDescricao().getText());
        p.setTxtNome(view.getTxtNome().getText());
        p.setTxtPreco(view.getTxtPreco().getText());
        
    }
    
    public void limpaTela() {
        view.getTxtCategoria().setText("");
        view.getTxtCodigo().setText("");
        view.getTxtDescricao().setText("");
        view.getTxtNome().setText("");
        view.getTxtPreco().setText("");
    }
    
}
