import java.sql.*;

public class DBConnect {

    Connection connection;

        {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kullaniciverileri", "root", "password");
                System.out.println("Connection succesfull");
            } catch (SQLException e) {
                System.out.println("Connection unsuccesfull");
                e.printStackTrace();
            }
        }
    }






//stmt.executeUpdate("insert into kullaniciverileri.bilgiler values(4,'Burak','BENLI', 'bubenli','burak123', 1423)");
            /*ResultSet resultSet= stmt.executeQuery("SELECT * FROM kullaniciverileri.bilgiler");

            while (resultSet.next()){
                System.out.print(resultSet.getString("Ad"));
                System.out.print(" ");
                System.out.println(resultSet.getString("Soyad"));

            }*/
