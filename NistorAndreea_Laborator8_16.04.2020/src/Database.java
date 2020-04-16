import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

class Singleton
{
    private static Singleton single_instance = null;
    public String s;
    private Singleton(){}

    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}
public class Database {

        private Connection connect = null;
        private Statement statement = null;
        private PreparedStatement preparedStatement = null;
        private ResultSet resultSet = null;

        public void readDataBase() throws Exception {
            try {
                // This will load the MySQL driver, each DB has its own driver
                Class.forName("oracle.jdbc.driver.OracleDriver");
                // Setup the connection with the DB
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","student","STUDENT");

                // Statements allow to issue SQL queries to the database
                statement = connect.createStatement();
                // Result set get the result of the SQL query
                resultSet = statement
                        .executeQuery("select * from studenti");
                writeResultSet(resultSet);

                // PreparedStatements
                preparedStatement = connect
                        .prepareStatement("insert into studenti.artists values (default, ?, ?, ?)");

                preparedStatement.setInt(1, 1);
                preparedStatement.setString(2, "Michael Jackson");
                preparedStatement.setString(3, "America");
                preparedStatement.executeUpdate();

                preparedStatement = connect
                        .prepareStatement("SELECT id, name, country from studenti.artists");
                resultSet = preparedStatement.executeQuery();
                writeResultSet(resultSet);

                // Remove again the insert comment
                preparedStatement = connect
                        .prepareStatement("delete from studenti.artists where id= ? ; ");
                preparedStatement.executeUpdate();

                resultSet = statement
                        .executeQuery("select * from studenti.artists");
                writeMetaData(resultSet);

            } catch (Exception e) {
                throw e;
            } finally {
                close();
            }
        }

        private void writeMetaData(ResultSet resultSet) throws SQLException {
            //  Now get some metadata from the database
            // Result set get the result of the SQL query

            System.out.println("The columns in the table are: ");

            System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
            for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
                System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
            }
        }


        private void writeResultSet(ResultSet resultSet) throws SQLException {
            // ResultSet is initially before the first data set
            while (resultSet.next()) {
                // It is possible to get the columns via name
                // also possible to get the columns via the column number
                // which starts at 1
                // e.g. resultSet.getSTring(2);
                String user = resultSet.getString("myuser");
                String website = resultSet.getString("webpage");
                String summary = resultSet.getString("summary");
                Date date = resultSet.getDate("datum");
                String comment = resultSet.getString("comments");
                System.out.println("User: " + user);
                System.out.println("Website: " + website);
                System.out.println("summary: " + summary);
                System.out.println("Date: " + date);
                System.out.println("Comment: " + comment);
            }
        }


        private void close() {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (connect != null) {
                    connect.close();
                }
            } catch (Exception e) {

            }
        }

    }

