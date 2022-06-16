// DENISON LUCAS E TAINA MIRANDA
//classe principal

package poo.brdevs.app;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import poo.brdevs.dao.*;


class Main {
  public static void main(String[] args) {
    // TESTE DE VISUALIZAÇÃO DOS REGISTROS
    // for(Projeto p : SelectsDAO.getProjetos()) {
      // System.out.println("Projeto: " + p.getId() + " " + p.getNomeProjeto() + " " + p.getDscProjeto() + " " + p.getTecnologiaProjeto() + " " + p.getCreateTime());
    // }

    // TESTE DE REGISTROS NO BANCO
    // InsertsDAO teste = new InsertsDAO();

    // Programador prog  = new Programador("João Victor", "jvit@hotmail.com", "victorj", "senha123", "HTML, CSS, NodeJS");
    
    // InsertsDAO.cadastroProg(prog);
    
    // TESTE DE EXCLUSAO NO BANCO
    // DeletesDAO.deleteClienteById(2);

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

//fim do menu*/
  }
}
