package T02dbutils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;

public class TestDbutils {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        QueryRunner runner = new QueryRunner(dataSource);
        int rows = runner.update("insert into user (name,age) values (?,?)", "冯凯伦", 20);
        System.out.println("rows = " + rows);

    }
}
