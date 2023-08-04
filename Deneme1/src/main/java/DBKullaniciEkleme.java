import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBKullaniciEkleme extends DBConnect {
    public String kullaniciAdi;
    public String kullaniciSoyadi;
    public String kullaniciKullaniciAdi;
    public String kullaniciSifre;
    public String kullaniciMail;
    public int kullanicinumara = 1;
    public Long kullaniciKimlikNo;
    public int kullaniciDogumY;
    public boolean mernisBoolDonenDeg;

    public void degerAtamaFunc(String funckullaniciAdi, String funckullaniciSoyadi, String funckullaniciKullaniciAdi, String funckullaniciSifre, String funckullaniciMail, Long funckullaniciKimlikNo, int funckullaniciDogumY) {
        kullaniciAdi = funckullaniciAdi;
        kullaniciSoyadi = funckullaniciSoyadi;
        kullaniciKullaniciAdi = funckullaniciKullaniciAdi;
        kullaniciSifre = funckullaniciSifre;
        kullaniciMail = funckullaniciMail;
        kullaniciKimlikNo = funckullaniciKimlikNo;
        kullaniciDogumY = funckullaniciDogumY;

        mernisBoolDonenDeg = mernisKontrolFunc();
        if(mernisBoolDonenDeg){
            kullaniciVerisiKaydetme(kullaniciAdi,kullaniciSoyadi,kullaniciMail,kullaniciKullaniciAdi,kullaniciSifre);
        }else
            System.out.println("hata");



    }

    public boolean mernisKontrolFunc() {
        MernisKullaniciSorgulama mernisKullaniciSorgulama = new MernisKullaniciSorgulama(kullaniciKimlikNo, kullaniciAdi, kullaniciSoyadi, kullaniciDogumY);
        return mernisKullaniciSorgulama.getClient();
    }


    public boolean kullaniciVerisiKaydetme(String kullaniciAdifunc, String kullaniciSoyadifunc, String kullaniciMailfunc, String kullaniciKullaniciAdifunc, String kullaniciSifrefunc) {
        KayitliKullaniciVerisiOkuma kayitliKullaniciVerisiOkuma=new KayitliKullaniciVerisiOkuma();
        int donenSiraNo;

        boolean funcDonenDeger = false;

        {
            try {

                System.out.println("con success 1");


                PreparedStatement stmt = connection.prepareStatement("insert into bilgiler(idbilgiler, Ad, Soyad, Email, KullaniciAdi, KullaniciSifre) values(?,?,?,?,?,?)");
                donenSiraNo= kayitliKullaniciVerisiOkuma.idBilgilerSiraDegerFunc();
                stmt.setInt(1, donenSiraNo);
                stmt.setString(2, kullaniciAdifunc);
                stmt.setString(3, kullaniciSoyadifunc);
                stmt.setString(4, kullaniciMailfunc);
                stmt.setString(5, kullaniciKullaniciAdifunc);
                stmt.setString(6, kullaniciSifrefunc);

                System.out.println("con success 2");
                boolean rowsInserted = stmt.execute();
                if (rowsInserted == true) {
                    System.out.println("Değer veritabanına başarıyla eklendi.");
                    funcDonenDeger = true;
                }
                //DBConnect dbConnect=new DBConnect();

                // Kaynakları serbest bırakma
                stmt.close();
                connection.close();

                System.out.println("con success 3");

            } catch (SQLException e) {
                //System.out.println("connection unsuccesfull");
                e.printStackTrace();
            }
        }
        return true;
    }


}
