package appbooklandia.controller;

import appbooklandia.model.Funcionario;
import appbooklandia.view.FrmCadFuncionarios;

public class ControllerCadFuncionarios {
    
    private FrmCadFuncionarios view;
    
    public ControllerCadFuncionarios(FrmCadFuncionarios view){
        this.view = view;
    }
    
    public void cadastraFuncionario(){
        Funcionario f = new Funcionario();
        f.setTxtCargo(view.getTxtCargo().getText());
        f.setTxtDataAdmissao(view.getTxtDataAdmissao().getText());
        f.setTxtMatricula(view.getTxtMatricula().getText());
        f.setTxtNome(view.getTxtNome().getText());
        f.setTxtSalario(view.getTxtSalario().getText());
    }
    
    public void limpaTela() {
        view.getTxtCargo().setText("");
        view.getTxtDataAdmissao().setText("");
        view.getTxtMatricula().setText("");
        view.getTxtNome().setText("");
        view.getTxtSalario().setText("");
    }
    
}
