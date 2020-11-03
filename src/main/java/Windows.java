import java.sql.*;

/**
 * @author zhulinzhong
 * @version 1.0 CreateTime:2020-05-11 14:53
 * @description
 */
public class Windows {

    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user?useSSL=false", "root", "123456");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
            //System.out.println("sql执行成功");

            System.out.println();

            System.out.println("数据库连接成功[{"+connection+"}]");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("连接关闭失败!");
                e.printStackTrace();
            }
        }
    }
}
