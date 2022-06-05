//aqui é a class Programador 
//aceitar ou recusar projeto
//import java.util.Scanner;
public class Programador extends Usuario{
  private String especialidade; //linguagem(s) em que o programador é mais capacitado
//CONSTRUTOR
  public Programador(String nome, String email, String login, String senha, String especialidade) {
    super(nome, email, login, senha);
    this.especialidade = especialidade;
  }

//GETTERS AND SETTERS
  
  public void setEspecialidade(String especialidade) {
    /*if(especialidade == ""){
      this.especialidade = especialidade;
    }else{
      System.out.println("Algo deu errado");
    }*/
    System.out.println( this.especialidade);
    this.especialidade = especialidade;
      
  }
  public String getEspecialidade() {
    return this.especialidade;
  }


}