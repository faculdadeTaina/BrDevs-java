// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.app;

import java.sql.Date;
import java.util.Scanner;

public class Projeto {
    protected int id;
    protected Date createTime;
    protected String nome;
    protected String descrição;
    protected String tecnologia;
    protected String criador;
//CONSTRUTOR    
    public Projeto(String nome, String descrição, String tecnologia, String criador) {
        this.nome = nome;
        this.descrição = descrição;
        this.tecnologia = tecnologia;
        this.criador = criador;
    }
//MÉTODOS
    public void enviarProjeto(){
        
        Scanner entradaNome = new Scanner(System.in);
        Scanner entradaDsc= new Scanner(System.in);
        Scanner entradaTec = new Scanner(System.in);
        Scanner entradaCriador = new Scanner(System.in);
        
        System.out.println("DADOS DO PROJETO");
        System.out.println("----------------");
        
        System.out.print("Nome do projeto: ");
            setNomeProjeto(entradaNome.nextLine());
        System.out.print("Descrição: ");
            setDscProjeto(entradaDsc.nextLine());
        System.out.print("Tecnologias: ");
            setTecnologiaProjeto(entradaTec.nextLine());
        System.out.print("Nome do criador da ideia: ");
            setCriadorProjeto(entradaCriador.nextLine());
            
    }
    
    public void atualizarprojeto(){
        System.out.println("ATUALIZAR PROJETO");
        System.out.println("----------------");


        
    }

    public void excluirProjeto(){
        Scanner entradaExcluir = new Scanner(System.in);
        
        System.out.println("EXCLUIR PROJETO");
        System.out.println("----------------");

        System.out.print("Nome do projeto que deseja excluir: ");
        System.out.print("Tem certeza que deseja excluir o projeto? [y/n] ");
        entradaExcluir.nextLine();
        
        if (entradaExcluir.nextLine() == "y"){
            
        }
        else if (entradaExcluir.nextLine() == "n"){
            System.out.println("Exclusão cancelada");
        }

    }

//GETTERS AND SETTERS
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date create_time) {
        this.createTime = create_time;
    }

    public String getNomeProjeto() {
        return nome;
    }
    
    public void setNomeProjeto(String nome) {
        this.nome = nome;
    }

    public String getDscProjeto() {
        return descrição;
    }
    
    public void setDscProjeto(String descricao) {
        this.descrição = descricao;
    }

    public String getTecnologiaProjeto() {
        return tecnologia;
    }
    
    public void setTecnologiaProjeto(String tecnologia) {
        this.tecnologia = tecnologia;
    }
    
    public String getCriadorProjeto() {
        return criador;
    }
    
    public void setCriadorProjeto(String criador) {
        this.criador = criador;
    }
    
}