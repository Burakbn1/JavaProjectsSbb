import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBKullaniciVerisiSorgulama {
    DBConnect dbConnect = new DBConnect();
    public String kontrolAdDeger;
    public String kontrolSifreDeger;

    //SELECT FROM bilgiler WHERE idbilgiler=2;


    public DBKullaniciVerisiSorgulama(String kontrolAdDeger, String kontrolSifreDeger) {
        this.kontrolAdDeger = kontrolAdDeger;
        this.kontrolSifreDeger = kontrolSifreDeger;
        degerSorgulamaMeth();

    }


    Statement stmt;

    public void degerSorgulamaMeth() {
        try {

            stmt = dbConnect.connection.createStatement();
            PreparedStatement ps = dbConnect.connection.prepareStatement("SELECT * FROM bilgiler WHERE KullaniciAdi=?");
            ps.setString(1, kontrolAdDeger);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String bulunanKullaniciAdlari = rs.getString("KullaniciAdi");
                String bulunanSifreler = rs.getString("KullaniciSifre");
                if (kontrolSifreDeger.equals(bulunanSifreler)) {

                    JOptionPane.showMessageDialog(null, "Giriş Başarılı, arayüze yönlendiriliyorsunuz.");
                } else {
                    JOptionPane.showMessageDialog(null, "Giriş Başarısız, lütfen bir daha deneyin.");
                }
                System.out.println(bulunanKullaniciAdlari);
                System.out.println(bulunanSifreler);
                System.out.println(kontrolSifreDeger);
            }

        } catch (SQLException e) {
            System.out.println("<degerSorgulamaMeth Hata>");
        }

    }


    public boolean kullaniciVarmiMeth(String gelenKontrolDeg) {
        boolean aBoolean = true;

        try {
            stmt = dbConnect.connection.createStatement();
            PreparedStatement ps = dbConnect.connection.prepareStatement("SELECT * FROM bilgiler WHERE KullaniciAdi=?");
            ps.setString(1, kontrolAdDeger);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bu kullanıcı adı alınmış, lütfen başka bir adla tekrar deneyin.");
                aBoolean = false;
            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Kayıt başarılı.");
            aBoolean = true;
        }
        return aBoolean;

    }


}
