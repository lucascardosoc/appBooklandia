package appbooklandia.model;

import java.time.LocalDate;

public class Cliente {

    //ATRIBUTOS
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate dataDeCadastro;

    /* CONSTRUTOR*/
    public Cliente() {
        this.setDataDeCadastro(LocalDate.now());
    }

    public Cliente(String cpf) {
        this.setDataDeCadastro(LocalDate.now());
        this.setCpf(cpf);
    }

    public Cliente(String cpf, String nome) {
        this.setDataDeCadastro(LocalDate.now());
        this.setCpf(cpf);
        this.nome = nome;
    }

    /*ENCAPSULAMENTO-[GET/SET] (oculta informações)
    * Metodo GET: Recupera / Devolve informação
    * Metodo SET: Definte / Atribui a informação
     */
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataDeCadastro() {
        return this.dataDeCadastro;
    }

    /**
     *
     * @param dataDeCadastro
     */
    public void setDataDeCadastro(LocalDate dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
