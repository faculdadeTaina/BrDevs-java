//class principal

class Main {
  public static void main(String[] args) {
//crirando objeto da calls
//menu 

String menu="Projeto";

switch (menu){
  case "Projeto":
  Projeto projeto1=new Projeto("teste", "teste1", null, null);


  projeto1.setNome("Projeto vida");
  projeto1.setDescrição("História de vida");
  projeto1.setTecnologia("Javascript");
  
  
  System.out.println(projeto1.getNome());
  System.out.println(projeto1.getDescrição());
  System.out.println(projeto1.getTecnologia());
  break;

  case "Login":

  break;
  
  case "Cadastro":

  break;

  case "Erro":

  default:
        System.out.println("Algo deu errado");


}




  }
}