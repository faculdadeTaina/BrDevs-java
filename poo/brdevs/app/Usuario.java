// DENISON LUCAS E TAINA MIRANDA
// Classe Usuario, serve como super classe de devcliente e programador.

package poo.brdevs.app;

public abstract class Usuario implements Autenticacao {
    protected String nome;
    protected String email;
    protected String login;
    protected String senha;
//CONSTRUTOR    
    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
//MÉTODOS
    public abstract void fazerLogin();

    public abstract void redefinirSenha();

    public abstract void fazerCadastro();

//GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", email = " + email + ", login = " + login;
    }

    
}