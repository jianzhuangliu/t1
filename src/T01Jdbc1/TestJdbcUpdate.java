package T01Jdbc1;

import java.sql.*;

public class TestJdbcUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.得到连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=GMT%2B8", "root", "123456");
        //3.创建Statement对象
        Statement statement = connection.createStatement();
        //4.添加 statement.executeUpdate  返回的是受影响的行数
        //int rows = statement.executeUpdate("insert into user (name,age) values ('张三丰','88')");
        //int rowss = statement.executeUpdate("insert into user (name,age) values ('张四丰','88')");
        //改
        //int rows = statement.executeUpdate("update user set name = '张四丰' where id = 5");
        //删除
        int rows = statement.executeUpdate("delete from user where id = 6");
        System.out.println("rows = " + rows);
        //7.关闭资源
        statement.close();
        connection.close();

    }
}
