// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.app;
import java.util.Scanner;

//class principal

class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

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

  projeto1.setNomeProjeto("Projeto vida");
  projeto1.setDscProjeto("Quero um site para contar a história de vida das pessoas");
  projeto1.setTecnologiaProjeto("Javascript");
  
  
  System.out.println(projeto1.getNomeProjeto());
  System.out.println(projeto1.getDscProjeto());
  System.out.println(projeto1.getTecnologiaProjeto());
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
