// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import poo.brdevs.app.DevCliente;
import poo.brdevs.app.Programador;
import poo.brdevs.app.Projeto;
import poo.brdevs.connection.ConnectionFactory;

//(CREATE) INSERT NA TABELA PROJETO
public class InsertsDAO {
    public static void cadastroProj(Projeto projeto) {
        String sql = "INSERT INTO projeto (nome, descricao, tecnologia, criador) VALUES  (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL(); //criar uma conexão com o banco de dados
            pstm = (PreparedStatement) conn.prepareStatement(sql); //executar uma query
            pstm.setString(1, projeto.getNomeProjeto());
            pstm.setString(2, projeto.getDscProjeto());
            pstm.setString(3, projeto.getTecnologiaProjeto());
            pstm.setString(4, projeto.getCriadorProjeto());
            pstm.execute();
            System.out.println("Projeto enviado com sucesso!");


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm!=null) {
                    pstm.close();
                }
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
//INSERT NA TABELA DEVCLIENTE
    public static void cadastroCliente(DevCliente cliente) {
        String sql = "INSERT INTO devcliente (nome, email, logon, senha, qtdProjetos) VALUES  (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL(); //criar uma conexão com o banco de dados
            pstm = (PreparedStatement) conn.prepareStatement(sql); //executar uma query
            pstm.setString(1, DevCliente.getNome());
            pstm.setString(2, DevCliente.getEmail());
            pstm.setString(3, DevCliente.getLogin());
            pstm.setString(4, DevCliente.getSenha());
            pstm.setInt(5, DevCliente.getQtdProjetos());
            pstm.execute();
            System.out.println("Cadastrado com sucesso!");


        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm!=null) {
                    pstm.close();
                }
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
//INSERT NA TABELA PROGRAMADOR
    public static void cadastroProg(Programador programador ) {
        String sql = "INSERT INTO programador (nome, email, logon, senha, especialidade) VALUES  (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL(); //criar uma conexão com o banco de dados
            pstm = (PreparedStatement) conn.prepareStatement(sql); //executar uma query
            pstm.setString(1, Programador.getNome());
            pstm.setString(2, Programador.getEmail());
            pstm.setString(3, Programador.getLogin());
            pstm.setString(4, Programador.getSenha());
            pstm.setString(5, Programador.getEspecialidade());
            pstm.execute();
            System.out.println("Cadastrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if (pstm!=null) {
                    pstm.close();
                }
                if (conn!=null) {
                    conn.close();
                }
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
