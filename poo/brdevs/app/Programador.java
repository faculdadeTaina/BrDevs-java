package poo.brdevs.app;
//aqui é a class Programador 
//aceitar ou recusar projeto

public class Programador extends Usuario{
  private String especialidade; //linguagem(s) em que o programador é mais capacitado
//CONSTRUTOR
  public Programador(String nome, String email, String login, String senha, String especialidade) {
    super(nome, email, login, senha);
    this.especialidade = especialidade;
  }
//MÉTODOS
  @Override
  public void fazerLogin() {
   
    
  }
  @Override
  public void redefinirSenha() {
   
    
  }
  @Override
  public void fazerCadastro() {
   
    
  }


//GETTERS AND SETTERS
  public String getEspecialidade() {
    return especialidade;
  }

  
  public void setEspecialidade(String especialidade) {
    if(especialidade == ""){
      this.especialidade = especialidade;
    }else{
      System.out.println("Algo deu errado");
    }
    
  }

}