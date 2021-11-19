package T01Jdbc1;

import java.sql.*;

public class TestJdbcQuary {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.得到连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=GMT%2B8", "root", "123456");
        //3.创建Statement对象
        Statement statement = connection.createStatement();
        //4.statement.executeQuery(sql)返回ResultSet
        ResultSet rs = statement.executeQuery("select * from user");
        //5.循环遍历结果集
        while (rs.next()) {
            //6.getXXX得到每一列的值
            /*int id = rs.getInt(1);
            String name = rs.getString(2);
            int age = rs.getInt(3);*/
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            System.out.println(id + "," + name + "," + age);
        }
        //7.关闭资源
        rs.close();
        statement.close();
        connection.close();

    }
}
