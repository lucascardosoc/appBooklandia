package appbooklandia.model;

import java.time.LocalDate;

public class Funcionario {

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dataDeAdmissao
     */
    public LocalDate getDataDeAdmissao() {
        return dataDeAdmissao;
    }

    /**
     * @param dataDeAdmissao the dataDeAdmissao to set
     */
    public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
        this.dataDeAdmissao = dataDeAdmissao;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    private int matricula;
    private String nome;
    private LocalDate dataDeAdmissao;
    private String cargo;
    private double salario;

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
