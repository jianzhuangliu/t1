package T01Jdbc1;

import java.sql.*;

public class TestJdbcUpdate2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2.得到连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1?serverTimezone=GMT%2B8", "root", "123456");
        //3.创建prepareStatement对象
        /*PreparedStatement ps = connection.prepareStatement("insert into user (name,age) values (?,?)");
        ps.setString(1,"张6丰");
        ps.setInt(2,36);
        int rows = ps.executeUpdate();
        System.out.println("rows = " + rows);*/
        //修改
        PreparedStatement ps = connection.prepareStatement("update user set name = ?,age = ? where id = ?");
        ps.setString(1,"哈哈哈");
        ps.setInt(2,98);
        ps.setInt(3,7);
        int rows = ps.executeUpdate();
        System.out.println("rows = " + rows);
        //删除
        /*PreparedStatement ps = connection.prepareStatement("delete from user where id = ?");
        ps.setInt(1,5);
        int rows = ps.executeUpdate();
        System.out.println("rows = " + rows);*/
        //关闭资源
        ps.close();
        connection.close();
    }
}
