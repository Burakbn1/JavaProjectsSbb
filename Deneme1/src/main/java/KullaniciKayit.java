import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class KullaniciKayit extends JFrame {
    private JTextField kullaniciKimlikNo;

    private JTextField kullaniciAd;
    public JPanel kullaniciKayitEkrani;
    private JTextField kullaniciEmail;
    private JButton kaydolButon;
    private JTextField kullaniciSoyad;
    private JButton vazgecButon;
    private JTextField kullaniciSifre;
    private JTextField kullaniciKullaniciAdi;
    private JTextField kullaniciDogumYili;

    JTextField textField = new JTextField();
    String text = textField.getText();
    DBKullaniciEkleme dbKullaniciEkleme=new DBKullaniciEkleme();

    public KullaniciKayit() {
        kaydolButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                KullaniciArayuz kullaniciArayuz=new KullaniciArayuz();
                System.out.println(Long.valueOf(kullaniciKimlikNo.getText()));
                System.out.println(Integer.parseInt(kullaniciDogumYili.getText()));
                dbKullaniciEkleme.degerAtamaFunc(kullaniciAd.getText(), kullaniciSoyad.getText(),kullaniciKullaniciAdi.getText(), kullaniciSifre.getText(), kullaniciEmail.getText(),Long.valueOf(kullaniciKimlikNo.getText()),Integer.parseInt(kullaniciDogumYili.getText()));
                //Long.valueOf(kullaniciKimlikNo.getText()),kullaniciAd.getText(), kullaniciSoyad.getText(),Integer.parseInt(kullaniciDogumYili.getText())
                //kullaniciAd.getText(), kullaniciSoyad.getText(),kullaniciKullaniciAdi.getText(), kullaniciSifre.getText(), kullaniciEmail.getText(),kullaniciKimlikNo.getText(),kullaniciDogumYili.getText()
                dispose();
                JOptionPane.showMessageDialog(null, "Kayıt Başarıyla Oluşturuldu");
                /*try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }*/
                dispose();
                KullaniciKayit kullaniciKayit= new KullaniciKayit();
                kullaniciArayuz.setContentPane(kullaniciArayuz.firstScreen);
                kullaniciArayuz.setTitle("Giriş Ekranı");
                kullaniciArayuz.setSize(300,400);
                kullaniciArayuz.setVisible(true);
                kullaniciArayuz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
        vazgecButon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }



}
