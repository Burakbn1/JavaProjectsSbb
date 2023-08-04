import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KayitliKullaniciVerisiOkuma {
    DBConnect dbConnect = new DBConnect();
    Statement stmt;
    public int idBilgilerDeger;

    public int idBilgilerSiraDegerFunc()
    {
        try {
            stmt = dbConnect.connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM kullaniciverileri.bilgiler");
            while (rs.next()) {
                //int sonSayiDeg=rs.getInt("idbilgiler");
                idBilgilerDeger = rs.getInt("idbilgiler") + 1;
                System.out.println(idBilgilerDeger);
            }

            /*ResultSet resultSet= stmt.executeQuery("SELECT * FROM kullaniciverileri.bilgiler");

            while (resultSet.next()){
                System.out.print(resultSet.getString("Ad"));
                System.out.print(" ");
                System.out.println(resultSet.getString("Soyad"));

            }*/


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return idBilgilerDeger;
    }


}
