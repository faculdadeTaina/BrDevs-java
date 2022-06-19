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
  int pro1=0;
  System.out.println("Chegou na parte de projetos:\n Digite 1 para fazer enviar: \n Digite para fazer excluir: \n Digite 3 para atualizar");
pro1=leitor.nextInt();

Projeto projeto1=new Projeto("teste", "teste1", null, null);
InsertsDAO inserirProj = new InsertsDAO();
DeletesDAO deleteProj= new DeletesDAO();
UpdatesDAO updateProj = new UpdatesDAO();


System.out.println("Voce escolheu a opção Projeto no seu menu!.");
if(pro1 ==1){
  projeto1.enviarProjeto();
  inserirProj.cadastroProj(projeto1);

}else if(pro1 ==2){
  projeto1.excluirProjeto();
  //contém um erro que é de só apagar com id
  deleteProj.deleteProjById(2);

}else if(pro1 == 3){
projeto1.atualizarprojeto();

updateProj.updateProj(projeto1);

}else{
  System.out.println("Algo deu errado com o sistema");

}

  break;

  case 2:
  int p1=0;
  System.out.println("Chegou na parte do programador(a):\n Digite 1 para fazer cadastro: \n Digite para fazer login: \n Digite 3 para redefinir senha");
p1=leitor.nextInt();
System.out.printf("A sua escolha foi %s:",p1);

  Programador programador1= new Programador("marcos", "marcos@gmail.com", "lo", "123", "");
  InsertsDAO inserirProG = new InsertsDAO();
DeletesDAO deleteProG= new DeletesDAO();
UpdatesDAO updateProG = new UpdatesDAO();

if(p1 == 1){
  programador1.fazerCadastro();
  inserirProG.cadastroProg(programador1);

}else if(p1 == 2){
  programador1.fazerLogin();
  updateProG.updateProg(programador1);

}else if(p1 ==3){
  programador1.redefinirSenha();
  deleteProG.deleteProgById(1);
  //contém erro
}else{
  System.out.println("Algo deu errado com o sistema");
}

  break;
  case 3:

int cli=0;
System.out.println("Chegou na parte dos clientes:\n Digite 1 para fazer cadastro: \n Digite para fazer login: \n Digite 3 para redefinir senha: \n Digite 4 para atualizar cadastro");

cli=leitor.nextInt();
DevCliente cliente1= new DevCliente("Leo", "leo@gmail.com", "Leo", "123", "3");
//System.out.printf("A sua escolha foi %s:",cli);
InsertsDAO inserirCliente = new InsertsDAO();
DeletesDAO deleteCliente= new DeletesDAO();
UpdatesDAO updateCliente = new UpdatesDAO();
if(cli ==1){
  cliente1.fazerCadastro();
  inserirCliente.cadastroCliente(cliente1);

}else if(cli ==2){
  cliente1.fazerLogin();

}else if(cli==3){
  cliente1.redefinirSenha();
  deleteCliente.deleteClienteById(5);
  //contém erros
}else if(cli ==4){
updateCliente.updateDevCliente(cliente1);
}else{
  System.out.println("Algo deu errado com o sistema");
}
break;

  case 0:
  default:
        System.out.println("Algo deu errado no sistema ou a sessão expirou!");

}

//fim do menu*/
  }
}
