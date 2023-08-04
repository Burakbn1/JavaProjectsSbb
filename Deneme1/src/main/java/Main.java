import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    /*public String gelenKullaniciAdi;
    public JPasswordField gelenKullaniciSifre;

    public Main(JTextField txtKullaniciAdi, JPasswordField txtKullaniciSifre) {
        this.gelenKullaniciAdi= String.valueOf(txtKullaniciAdi);
        this.gelenKullaniciSifre= txtKullaniciSifre;

    }*/

    public static void main(String[] args) throws Exception {
        /*KayitliKullaniciVerisiOkuma kayitliKullaniciVerisiOkuma = new KayitliKullaniciVerisiOkuma();
        kayitliKullaniciVerisiOkuma.idBilgilerSiraDegerFunc();*/
        String mailGidecekAdres="sahinburakbenli@gmail.com";
        JavaMailGonderme javaMailGonderme= new JavaMailGonderme();

        //DBConnect dbConnect = new DBConnect();
        //DBKullaniciEkleme dbKullaniciEkleme=new DBKullaniciEkleme();

        //resultSet= stmnt.executeQuery("INSERT INTO kullaniciverileri.bilgiler VALUES (gelenKullaniciAdi)");

        //dbConnect.dbConnection();

    }


}
