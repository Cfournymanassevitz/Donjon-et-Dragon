import java.sql.*;
public class Database {
    String DBurl = "jdbc:mysql://localhost:3306/mydb?verifyServerCertificate=false&useSSL=true";
    Connection con = DriverManager.getConnection(DBurl, "root", "root");

    public Database() throws SQLException {

    }
}
