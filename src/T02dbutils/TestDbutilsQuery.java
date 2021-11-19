package T02dbutils;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class TestDbutilsQuery {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        QueryRunner runner = new QueryRunner(dataSource);
        List<User> list = runner.query("select * from  user", new BeanListHandler<>(User.class));
        for (User user : list) {
            System.out.println("user = " + user);
        }
        /*User user = runner.query("select * from user where id=?", new BeanHandler<>(User.class), 7);
        System.out.println("user = " + user);*/
    }
}
