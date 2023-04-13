
import javax.xml.transform.Result;
import java.sql.*;
public class App {
    public static void main(String[] args) throws ClassNotFoundException , SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String userName = "root";
        String password = "0815";
        String url = "jdbc:mysql://localhost/test-bit";
        Connection conn = DriverManager.getConnection(url,userName,password);
        System.out.println("Connection is success");

        //select query
        /*Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM new_table" );
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }*/

        //update query
        /*Statement stm2 = conn.createStatement();
        int rs = stm2.executeUpdate(" Update new_table SET name = 'Sanna' where id =2");
        System.out.println("Number of rows affected " + rs);
        ResultSet rs2 = stm2.executeQuery("SELECT * from new_table");
        while(rs2.next()){
            int id = rs2.getInt("id");
            String name = rs2.getString("name");
            System.out.println(id + "\t" + name);
        }*/

        //delete query
        /*Statement stm3 = conn.createStatement();
        ResultSet rs3 = stm3.executeQuery("DELETE from new_table where id = 2");
        while(rs3.next()){
            int id = rs3.getInt("id");
            String name = rs3.getString("name");
            System.out.println(id + "\t" + name);
        }*/

        //insert query
        Statement stm4 = conn.createStatement();
        int rowsinserted = stm4.executeUpdate("INSERT INTO new_table(id,name,address) VALUES(4,'Riti','Baneshwor')");
        System.out.println("Number of rows inserted " + rowsinserted);
        ResultSet rs4 = stm4.executeQuery("SELECT * from new_table");
        while(rs4.next()){
            int id = rs4.getInt("id");
            String name = rs4.getString("name");
            System.out.println(id + "\t" + name);
        }

    }
}
