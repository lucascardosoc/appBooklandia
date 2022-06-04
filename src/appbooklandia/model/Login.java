package appbooklandia.model;


public class Login {
    private String email;
    private String senha;
    private NivelDeAcesso nivelDeAcesso;
    private boolean status;

    public Login(String email, String senha, NivelDeAcesso nivelDeAcesso, boolean status) {
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso;
        this.status = status;
    }

    public Login() {
    }
    

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public NivelDeAcesso getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public boolean isStatus() {
        return status;
    }
    
    
}
