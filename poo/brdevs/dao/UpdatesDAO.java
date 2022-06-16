// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import poo.brdevs.app.DevCliente;
import poo.brdevs.app.Programador;
import poo.brdevs.app.Projeto;
import poo.brdevs.connection.ConnectionFactory;

public class UpdatesDAO {
//Update na tabela Projeto
    public void updateProj(Projeto projeto) {
        String sql = "UPDATE projeto SET nome = ?, descricao = ?, tecnologia = ?" + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL(); //cria conexão com o banco
            pstm = conn.prepareStatement(sql); //classe para executar a query
            //Insere valores para atualizar
            pstm.setString(1, projeto.getNomeProjeto());
            pstm.setString(2, projeto.getDscProjeto());
            pstm.setString(3, projeto.getTecnologiaProjeto());
            pstm.setInt(4, projeto.getId());

            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
//Update na tabela DevCliente
    public static void updateDevCliente(DevCliente cliente) {
        String sql = "UPDATE devcliente SET nome = ?, email = ?, logon = ?, senha = ?, qtdProjetos = ?" + " WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL(); //cria conexão com o banco
            pstm = conn.prepareStatement(sql); //classe para executar a query
            //Insere valores para atualizar
            pstm.setString(1, DevCliente.getNome());
            pstm.setString(2, DevCliente.getEmail());
            pstm.setString(3, DevCliente.getLogin());
            pstm.setString(4, DevCliente.getSenha());
            pstm.setInt(5, DevCliente.getQtdProjetos());
            pstm.setInt(6, DevCliente.getId());
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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
//Update na tabela Programador   
    public void updateProg(Programador programador) {
        String sql = "UPDATE programador SET nome = ?, email = ?, login = ?, senha = ?, especialidade = ?" + "WHERE id = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL(); //cria conexão com o banco
            pstm = conn.prepareStatement(sql); //classe para executar a query
            //Insere valores para atualizar
            pstm.setString(1, Programador.getNome());
            pstm.setString(2, Programador.getEmail());
            pstm.setString(3, Programador.getLogin());
            pstm.setString(4, Programador.getSenha());
            pstm.setString(5, Programador.getEspecialidade());
            pstm.setInt(6, Programador.getId());
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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