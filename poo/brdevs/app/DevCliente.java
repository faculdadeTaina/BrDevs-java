// DENISON LUCAS E TAINA MIRANDA
//classe DevCliente publica um projeto

package poo.brdevs.app;

import java.util.Scanner;

public class DevCliente extends Usuario{
    private static int qtdProjetos;
  //CONSTRUTOR
    public DevCliente(String nome, String email, String login, String senha, String qtdProjetos) {
      super(nome, email, login, senha);
      // int qtdProjetos = 0;
    }
  //MÉTODOS
    @Override 
    public void fazerLogin() {
      Scanner entradaLogin = new Scanner(System.in);
      System.out.print("Insira seu login: ");
      String l = entradaLogin.nextLine();
      if (l.equals(getLogin())) {  //se o login estiver correto, pede a senha
          Scanner entradaSenha = new Scanner(System.in);
          System.out.print("Insira sua Senha: ");
          String s = entradaSenha.nextLine();
          if(s.equals(getSenha())) {
              System.out.println("Login feito com sucesso!");
          }
      } else {
          System.out.println("Login ou senha incorretos!");
          fazerLogin();
      }
    }

    @Override
    public void redefinirSenha() {
      Scanner entradaSenhaAtual = new Scanner(System.in);
      Scanner entradaNovaSenha = new Scanner(System.in);

      System.out.println("REDEFINIÇÃO DE SENHA");
      System.out.println("--------------------");

      System.out.print("Insira a senha atual: ");
          String atual = entradaSenhaAtual.nextLine();
          if (!atual.equals(getSenha())) {
              System.out.println("Senha incorreta");
              redefinirSenha();
          } else {
              System.out.print("Nova senha: (mínimo 8 caracteres) ");
              String nova = entradaNovaSenha.nextLine();
              if (nova.length() >= 8) {
                  setSenha(nova);
              } else {
                  System.out.println("A senha deve conter no mínimo 8 caracteres.");
                  redefinirSenha();
              }
          }
      }

    @Override 
    public void fazerCadastro() {
      Scanner entradaNome = new Scanner(System.in);
      Scanner entradaLogin = new Scanner(System.in);
      Scanner entradaSenha = new Scanner(System.in);
      Scanner entradaEmail = new Scanner(System.in);
      Scanner confirmaSenha = new Scanner(System.in);

      System.out.println("INSIRA SEUS DADOS PARA CADASTRO");
      System.out.println("-------------------------------");

      System.out.print("Nome: ");
          setNome(entradaNome.nextLine());
      System.out.print("Login: ");
          setLogin(entradaLogin.nextLine());
      System.out.print("Email: ");
          setEmail(entradaEmail.nextLine());
      System.out.print("Senha(mínimo 8 caracteres): ");
          setSenha(entradaSenha.nextLine());
          if (entradaSenha.nextLine().length() >= 8) {
              System.out.print("Confirme a senha: ");
                  setSenha(confirmaSenha.nextLine());
                  while (!confirmaSenha.equals(entradaSenha)) {  //enquanto a confirmação for diferente da primeira senha, pede pra reinserir 
                      System.out.println("Senhas não conferem.");
                      System.out.println("Confirme a senha: ");
                      setSenha(confirmaSenha.nextLine());
                  }
                  System.out.println("Senha confirmada.");
                  System.out.println("Cadastro realizado com sucesso.");
          }
      }
    
  //GETTERS AND SETTERS
    public static int getQtdProjetos() {
      return qtdProjetos;
    }

    public void setQtdProjetos(int i){
        
    }
  
    
    
  }