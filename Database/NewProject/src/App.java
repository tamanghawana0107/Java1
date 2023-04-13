
import java.sql.*;
public class App {
    public static void main(String[] args) throws ClassNotFoundException , SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String userName = "root";
        String password = "0815";
        String url = "jdbc:mysql://localhost/test-bit";
        Connection conn = DriverManager.getConnection(url,userName,password);
        System.out.println("Connection is success");

        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery("SELECT * FROM new_table" );
        while (rs.next()) {
            String name = rs.getString("name");
            System.out.println(name);
        }
    }
}
