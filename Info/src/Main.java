import java.sql.DriverManager;
import java.sql.*;
import java.util.Scanner;
import java.sql.SQLClientInfoException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner input = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("\t\t\t\t\t !!! WELCOME TO DATABASE !!!");
        System.out.println("YOU ARE ACCESSING DATABASE WITH THE HELP OF JAVA");
        System.out.println("*************************************************");
        System.out.print("Enter the username : ");
        String userName = input.nextLine();
        System.out.print("Enter the password : ");
        String password = input.nextLine();

        String url = "jdbc:mysql://localhost/college_info";
        System.out.println("The url is already given :: jdbc:mysql://localhost/college_info");
        Connection conn = DriverManager.getConnection(url,userName,password);
        System.out.println("*******************************************");
        System.out.println("\t\t\t\t\t !!! Connection is established !!!");
        Statement stm = conn.createStatement();
        System.out.println("PRESS 1 for SELECT QUERY");
        System.out.println("PRESS 2 for INPUT QUERY");
        System.out.println("PRESS 3 for UPDATE QUERY");
        System.out.println("PRESS 4 for Delete QUERY");
        System.out.print("\nEnter your choice : ");
        int choose = input.nextInt();
        switch(choose)
        {
            case 1 :
                //select query
                ResultSet rs1 = stm.executeQuery("SELECT * from info_table");
                while(rs1.next()){
                    String name = rs1.getString("name");
                    System.out.println(name);
                }
                break;

            case 2 :
                //Input Query
                int id;
                String name2, address2, collegename2, faculty2;
                System.out.print("Enter the name :");
                name2 = input.nextLine();
                input.nextLine();
                System.out.print("Enter the address :");
                address2 = input.nextLine();
                input.nextLine();
                System.out.print("Enter the College Name :");
                collegename2 = input.nextLine();
                input.nextLine();
                System.out.print("Enter the faculty :");
                faculty2 = input.nextLine();
                input.nextLine();
                int rows_affected = stm.executeUpdate("INSERT INTO info_table(id,name,address,collegename,faculty) VALUES (id,name2,address2,collegename2,faculty2)");
                System.out.println("The number of rows affected are : " + rows_affected);
                ResultSet rs2 = stm.executeQuery("SELECT * from info_table");
                while(rs2.next())
                {
                    int id1;
                    String name1, address1, collegename1, faculty1;
                    id1 = rs2.getInt("id");
                    name1 = rs2.getString("name");
                    address1 = rs2.getString("address");
                    collegename1 = rs2.getString("collegename");
                    faculty1 = rs2.getString("faculty");

                    System.out.println(id1 + "\t" + name1 + "\t" + address1 + "\t" + collegename1 + "\t" + faculty1);


                }
                break;
        }


    }
}