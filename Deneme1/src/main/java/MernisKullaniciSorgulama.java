import MernisPackage.NVNKPSPublicSoap;

public class MernisKullaniciSorgulama {
    public Long kullaniciKimlikNo;
    public String kullaniciAd;
    public String kullaniciSoyad;
    public int kullaniciDogumY;




    NVNKPSPublicSoap client=new NVNKPSPublicSoap();

    public MernisKullaniciSorgulama(Long kullaniciKimlikNo, String kullaniciAd, String kullaniciSoyad, int kullaniciDogumY) {
        this.kullaniciKimlikNo = kullaniciKimlikNo;
        this.kullaniciAd = kullaniciAd;
        this.kullaniciSoyad = kullaniciSoyad;
        this.kullaniciDogumY = kullaniciDogumY;
    }

    public boolean getClient() {
        boolean aBoolean;
        try {

            aBoolean = client.TCKimlikNoDogrula(kullaniciKimlikNo, kullaniciAd, kullaniciSoyad, kullaniciDogumY);
        } catch (Exception e) {
            System.out.println("alınan hatalar=");
            throw new RuntimeException(e);
        }
        System.out.println(client);
        return aBoolean;
    }
    //if()
}
