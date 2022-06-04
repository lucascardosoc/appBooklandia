package appbooklandia.model;

import java.time.LocalDate;

public class Funcionario {

    protected int matricula;
    protected String nome;
    protected LocalDate dataDeAdmissao;
    protected String cargo;
    protected double salario;

    protected Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setTxtCargo(String text) {
    }

    public void setTxtDataAdmissao(String text) {
    }

    public void setTxtMatricula(String text) {
    }

    public void setTxtNome(String text) {
    }

    public void setTxtSalario(String text) {
    }

}
