import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KullaniciArayuz extends JFrame {
    private JButton girisButon;
    private JTextField txt_KullaniciAdi;
    private JPasswordField txt_KullaniciSifre;
    public JPanel firstScreen;
    private JButton yeniKullanıcıKayıtButton;



    public KullaniciArayuz() {
    girisButon.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //Main main= new Main(txt_KullaniciAdi, txt_KullaniciSifre);
            //JOptionPane.showMessageDialog(null, "Hello world");

            DBKullaniciVerisiSorgulama kullaniciVerisiSorgulama=new DBKullaniciVerisiSorgulama(txt_KullaniciAdi.getText(), txt_KullaniciSifre.getText());


        }
    });
        yeniKullanıcıKayıtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KullaniciKayit kullaniciKayit= new KullaniciKayit();
                KullaniciArayuz kullaniciArayuz= new KullaniciArayuz();
                dispose();// Önceden açık olan ekranları kapatır.
                kullaniciKayit.setContentPane(kullaniciKayit.kullaniciKayitEkrani);
                kullaniciKayit.setTitle("Kayıt Ekranı");
                kullaniciKayit.setSize(300,400);
                kullaniciKayit.setVisible(true);


            }
        });
    }

    public static void main(String[] args) {
        KullaniciArayuz kullaniciArayuz= new KullaniciArayuz();
        KullaniciKayit kullaniciKayit= new KullaniciKayit();
        kullaniciArayuz.setContentPane(kullaniciArayuz.firstScreen);// Burası çalışacak olan ilk formu çağırır.
        kullaniciArayuz.setTitle("Giriş Ekranı");
        kullaniciArayuz.setSize(300,400);
        kullaniciArayuz.setVisible(true);
        kullaniciArayuz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
