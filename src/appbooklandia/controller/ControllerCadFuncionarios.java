package appbooklandia.controller;

import appbooklandia.dal.FuncionarioDAO;
import appbooklandia.model.Funcionario;
import appbooklandia.view.FrmCadFuncionarios;
import java.sql.SQLException;
import java.time.LocalDate;

public class ControllerCadFuncionarios {

    private FrmCadFuncionarios view;

    public ControllerCadFuncionarios(FrmCadFuncionarios view) {
        this.view = view;
    }

    public void consultaFuncionario() throws SQLException {
        String matricula = view.getTxtMatricula().getText();

        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        Funcionario funcionario = funcionarioDao.recupera(matricula);

        if (funcionario != null) {
            view.getTxtNome().setText(funcionario.getNome());
            view.getTxtDataAdmissao().setText(String.valueOf(funcionario.getDataDeAdmissao()));
            view.getTxtCargo().setText(funcionario.getCargo());
            view.getTxtSalario().setText(String.valueOf(funcionario.getSalario()));
        }
    }

    public void cadastraFuncionario() throws SQLException {
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(Integer.parseInt(view.getTxtMatricula().getText()));
        funcionario.setNome(view.getTxtNome().getText());
        funcionario.setDataDeAdmissao(LocalDate.now());
        funcionario.setCargo(view.getTxtCargo().getText());
        funcionario.setSalario(Double.parseDouble(view.getTxtSalario().getText()));

        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        funcionarioDao.adiciona(funcionario);
    }

    public void atualizaFuncionario() throws SQLException {
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(Integer.parseInt(view.getTxtMatricula().getText()));
        funcionario.setNome(view.getTxtNome().getText());
        funcionario.setDataDeAdmissao(LocalDate.now());
        funcionario.setCargo(view.getTxtCargo().getText());
        funcionario.setSalario(Double.parseDouble(view.getTxtSalario().getText()));

        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        funcionarioDao.altera(funcionario);
    }

    public void apagaFuncionario() throws SQLException {
        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(Integer.parseInt(view.getTxtMatricula().getText()));
        funcionario.setNome(view.getTxtNome().getText());
        funcionario.setDataDeAdmissao(LocalDate.now());
        funcionario.setCargo(view.getTxtCargo().getText());
        funcionario.setSalario(Double.parseDouble(view.getTxtSalario().getText()));

        FuncionarioDAO funcionarioDao = new FuncionarioDAO();
        funcionarioDao.exclui(funcionario);
    }

    public void limpaTela() {
        view.getTxtCargo().setText("");
        view.getTxtDataAdmissao().setText("");
        view.getTxtMatricula().setText("");
        view.getTxtNome().setText("");
        view.getTxtSalario().setText("");
    }

}
