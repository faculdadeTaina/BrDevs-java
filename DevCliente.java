//aqui é a classe DevCliente
//publica um projeto no sistema

public class DevCliente extends Usuario{
  private int qtdProjetos;
//CONSTRUTOR
  public DevCliente(String nome, String email, String login, String senha) {
    super(nome, email, login, senha);
    int qtdProjetos = 0;
  }
//MÉTODOS
  public void enviarProjeto() {
    this.qtdProjetos += 1;
  }

  public void excluirProjeto() {
    this.qtdProjetos -= 1;
  }

  public void atualizarProjeto() {

  }
//GETTERS AND SETTERS
  public int getQtdProjetos() {
    return qtdProjetos;
  }

}