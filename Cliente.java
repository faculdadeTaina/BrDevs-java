//aqui é a class cliente
//publicar um projeto

public class Cliente{
 private String descProjeto;
private String nomeProjeto;
     /*  String apagar;
    String criar;
    String atualizar;
    String salvar;
*/
  public Cliente(String descProjeto, String nomeProjeto ){
    setDescP(descProjeto);
    setDescN(nomeProjeto);
  }
//sets
public void setDescP(String descProjeto){
  this.descProjeto=descProjeto;
}

public void setDescN(String nomeProjeto){
  this.nomeProjeto=nomeProjeto;
}
  //gets
  public String getDes(){
    return descProjeto;
  }
  public String getNome(){
    return nomeProjeto;
  }
  
}