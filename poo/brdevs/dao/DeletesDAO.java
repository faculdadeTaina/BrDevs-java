// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.print.attribute.standard.Finishings;

import com.mysql.cj.PreparedQuery;

import poo.brdevs.connection.ConnectionFactory;

public class DeletesDAO {
//EXCLUIR UM PROJETO PELO NOME    
    public void deleteProjByName(String nome) {
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
//EXCLUIR UM PROJETO PELO ID
    public static void deleteProjById(int id) {
        String sql = "DELETE FROM projeto WHERE id = ?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, id);
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
//EXCLUIR UM CLIENTE PELO ID
public static void deleteClienteById(int id) {
    String sql = "DELETE FROM devcliente WHERE id = ?";
    Connection conn = null;
    PreparedStatement pstm = null;

    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        pstm.setInt(1, id);
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
//EXCLUIR UM PROGRAMADOR PELO ID
public static void deleteProgById(int id) {
    String sql = "DELETE FROM programador WHERE id = ?";
    Connection conn = null;
    PreparedStatement pstm = null;

    try {
        conn = ConnectionFactory.createConnectionToMySQL();
        pstm = (PreparedStatement) conn.prepareStatement(sql);
        pstm.setInt(1, id);
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
