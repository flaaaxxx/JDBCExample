package pl.flaaaxxx;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
//        DBConnector.connect();
//        ResultSet resultSet = QueryExecutor.executeQuery("select * from user");
//        resultSet.next();
//        System.out.println(resultSet.getString("username"));

        List<String> queries = new ArrayList<>();
        queries.add("UPDATE user set password = \"1\" WHERE username LIKE \"nnnn\";");
        queries.add("UPDATE user set password = \"4\" WHERE username LIKE \"aaaa\";");
        QueryExecutor.executeQueriesInOneTransaction(queries);

    }
}
