// DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import poo.brdevs.app.DevCliente;
import poo.brdevs.app.Programador;
import poo.brdevs.app.Projeto;
import poo.brdevs.connection.ConnectionFactory;

//(READ) SELECT NAS TABELAS
public class SelectsDAO {
    public static List<Projeto> getProjetos() {
        String sql = "SELECT * FROM  projeto";

        List<Projeto> lista_projetos = new ArrayList<Projeto>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null; //Recupera os dados do banco

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Projeto proj = new Projeto(sql, sql, sql, sql);
                proj.setId(rset.getInt("id"));
                proj.setNomeProjeto(rset.getString("nome"));
                proj.setCriadorProjeto(rset.getString("criador"));
                proj.setTecnologiaProjeto(rset.getString("tecnologia"));
                proj.setDscProjeto(rset.getString("descricao"));
                proj.setCreateTime(rset.getDate("create_time"));
                lista_projetos.add(proj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(rset!=null) {
                    rset.close();
                }
                if(pstm!=null) {
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
            return lista_projetos;
    }
//===========================================
    public static List<DevCliente> getClientes() {
        String sql = "SELECT * FROM  devcliente";

        List<DevCliente> lista_clientes = new ArrayList<DevCliente>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null; //Recupera os dados do banco

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                DevCliente cli = new DevCliente(sql, sql, sql, sql, sql);
                cli.setId(rset.getInt("id"));
                cli.setNome(rset.getString("nome"));
                cli.setEmail(rset.getString("email"));
                cli.setLogin(rset.getString("login"));
                cli.setSenha(rset.getString("senha"));
                cli.setQtdProjetos(rset.getInt("quantidade de projetos"));
                lista_clientes.add(cli);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(rset!=null) {
                    rset.close();
                }
                if(pstm!=null) {
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
            return lista_clientes;
    }
//===========================================
    public List<Programador> getProgramadores() {
        String sql = "SELECT * FROM  programador";

        List<Programador> lista_programadores = new ArrayList<Programador>();

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null; //Recupera os dados do banco

        try {
            conn = ConnectionFactory.createConnectionToMySQL();
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rset = pstm.executeQuery();
            
            while (rset.next()) {
                Programador prog = new Programador(sql, sql, sql, sql, sql);
                prog.setId(rset.getInt("id"));
                prog.setNome(rset.getString("nome"));
                prog.setEmail(rset.getString("email"));
                prog.setLogin(rset.getString("login"));
                prog.setSenha(rset.getString("senha"));
                prog.setEspecialidade(rset.getString("especialidade"));
                lista_programadores.add(prog);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(rset!=null) {
                    rset.close();
                }
                if(pstm!=null) {
                    pstm.close();
                }
                if(conn!=null) {
                    conn.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
            return lista_programadores;
    }

}
