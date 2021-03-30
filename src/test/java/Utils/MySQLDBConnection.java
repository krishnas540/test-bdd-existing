package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLDBConnection {
   public Connection connection = null;
    public ResultSet mySqldbconnection(String query) throws Exception {
        String mySqlClassName = "com.mysql.jdbc.Driver";
        String mySqlUrl = "jdbc:mysql://127.0.0.1:3306/krishna";
        String mySqlUserName = "root";
        String mySqlPassword = "root";
        java.lang.Class.forName(mySqlClassName).newInstance();
       /* Class.forName(mySqlClassName);*/
        connection = DriverManager.getConnection(mySqlUrl, mySqlUserName, mySqlPassword);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;

    }
}
