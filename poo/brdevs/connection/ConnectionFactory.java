//DENISON LUCAS E TAINA MIRANDA

package poo.brdevs.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
  private static final String USERNAME = "root";
  private static final String PASSWORD = "poo2022";
  private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/br_devs_db";

  //Conexão com o banco de dados
  public static Connection createConnectionToMySQL() throws Exception {
    Class.forName("com.mysql.jdbc.Driver"); //carrega a classe pela JVM
    Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);  //cria a conexão com o banco
    return connection;
  }
  
  public static void main(String[] args) throws Exception {
    Connection con = createConnectionToMySQL();

    if(con!=null) {
      System.out.println("Conexão feita com sucesso!");
      con.close();
    }
  }
  
}
