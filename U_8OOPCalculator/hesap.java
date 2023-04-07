package U_8OOPCalculator;

import java.util.Scanner;

public class hesap {
    Scanner scan = new Scanner(System.in);
    private String kullaniciAdi;
    private String parola;
    private int bakiye;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public hesap(String kullaniciAdi, String parola, int bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void paraYatir() {
        int yatirilacakTutar;
        System.out.println("Yatırmak istediğiniz tutarı giriniz.");
        yatirilacakTutar = scan.nextInt();
        bakiye = bakiye + yatirilacakTutar;
    }


    public void paraCek() {
        int cekilecekTutar;
        System.out.println("Çekmek istediğiniz Tutarı giriniz.");
        cekilecekTutar = scan.nextInt();
        if (bakiye < cekilecekTutar) {
            System.out.println("O kadar paran yok knk");
        } else {
            System.out.println("Paranızı çektini " + cekilecekTutar);
            bakiye = bakiye - cekilecekTutar;
        }

    }


}
