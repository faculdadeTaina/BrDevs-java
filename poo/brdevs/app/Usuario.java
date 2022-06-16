// DENISON LUCAS E TAINA MIRANDA
// Classe Usuario, serve como super classe de devcliente e programador.

package poo.brdevs.app;

public abstract class Usuario{
    protected static int id;
    protected static String nome;
    protected static String email;
    protected static String login;
    protected static String senha;
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
    public static int getId() {
        return id;
    }

    public void setId(int id) {
        Usuario.id = id;
    }

    public static String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Usuario.nome = nome;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Usuario.email = email;
    }

    public static String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        Usuario.login = login;
    }

    public static String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Usuario.senha = senha;
    }

}