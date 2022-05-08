//aqui é a classe Programador
//responsável por avaliar e aceitar ou recusar os projetos novos que entram na plataforma

public class Programador extends Usuario{
  private String especialidade; //linguagem(s) em que o programador é mais capacitado
//CONSTRUTOR
  public Programador(String nome, String email, String login, String senha, String especialidade) {
    super(nome, email, login, senha);
    this.especialidade = especialidade;
  }
//GETTERS AND SETTERS
  public String getEspecialidade() {
    return especialidade;
  }
  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

}
