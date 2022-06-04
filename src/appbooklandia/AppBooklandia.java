package appbooklandia;

import appbooklandia.model.Atendente;
import appbooklandia.view.FrmPrincipal;


/*
Model = Classes
View = Front ~ (INTERFACE GRÁFICA QUE AGE COM O CONTROLLER)
Controller = (RESGISTRA OS EVENTOS DO USUÁRIO - COMUNICA COM O BANCO DE DADOS)
*/



public class AppBooklandia {

    public static void main(String[] args) {
        FrmPrincipal frm = new FrmPrincipal();
        frm.setVisible(true);
    }
}
