package poo.brdevs.app;
import java.util.Scanner;

//class principal

class Main {
  public static void main(String[] args) {
    Scanner leitor =new Scanner(System.in);

//menu 
System.out.println("Bem-vindo ao sistema!.");

int menu=0;
System.out.print("Digite 1 para ver projetos:\n Digite 2 para ver para ver a aba programador(a) no systema:\n Digite 3 para ver a aba cliente:\n Qual sua escolha?" );

menu=leitor.nextInt();
System.out.printf("A sua escolha foi %s:",menu);

switch (menu){
  case 1:
Projeto projeto1=new Projeto("teste", "teste1", null, null);
System.out.println("Voce escolheu a opção Projeto no seu menu!.");

  projeto1.setNome("Projeto vida");
  projeto1.setDescrição("Quero um site para contar a história de vida das pessoas");
  projeto1.setTecnologia("Javascript");
  
  
  System.out.println(projeto1.getNome());
  System.out.println(projeto1.getDescrição());
  System.out.println(projeto1.getTecnologia());
  break;

  case 2:
  System.out.println("Chegou na pate do programador");
  Programador especialidade= new Programador("marcos", "marcos@gmail.com", "lo", "123", "");
  
 
  break;
  case 3:
  System.out.println("Chegou na parte dos clientes");

  break;

  case 0:
  default:
        System.out.println("Algo deu errado");

}

//fim do menu
  }
}