// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.print.attribute.standard.Finishings;

import com.mysql.cj.PreparedQuery;

import poo.brdevs.connection.ConnectionFactory;

public class DeletesDAO {
//EXCLUIR UM PROJETO PELO NOME    
    public static void deleteProjByName(String nome) {
        String sql = "DELETE FROM projeto WHERE nome = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn!=null) {
                    conn.close();
                }
                if(pstm!=null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//EXCLUIR UM CLIENTE PELO NOME
    public static void deleteClienteByName(String nome) {
        String sql = "DELETE FROM devcliente WHERE nome = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn!=null) {
                    conn.close();
                }
                if(pstm!=null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
//EXCLUIR UM PROGRAMADOR PELO NOME
    public static void deleteProgByName(String nome) {
        String sql = "DELETE FROM programador WHERE nome = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(conn!=null) {
                    conn.close();
                }
                if(pstm!=null) {
                    pstm.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
