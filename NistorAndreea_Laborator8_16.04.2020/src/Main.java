import java.net.ConnectException;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","STUDENT");
            Statement statement = con.createStatement();
            String sql = "select * from studenti";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){

                System.out.println(rs.getInt(1) + " " + rs.getString(2) );
            }
            con.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}