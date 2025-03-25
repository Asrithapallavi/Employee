
import java.sql.*;

public class employee {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/employee";
        String user="root";
        String password="Pallavi@853";
        try(Connection conn=DriverManager.getConnection(url,user,password);
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * FROM employee")){
            while(rs.next()){
                System.out.println("Name:"+rs.getString("name"));}
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
       
    }

