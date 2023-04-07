package U_8OOPCalculator;

import java.util.Scanner;

public class login {
    public boolean giris(hesap hesap2) {
        Scanner scan = new Scanner(System.in);

        String kullaniciAdi;
        String PArola;
        System.out.print("Kullanici Adı Gir:");
        kullaniciAdi = scan.nextLine();
        System.out.print("Şifre Gir:");
        PArola = scan.nextLine();

        if (hesap2.getKullaniciAdi().equals(kullaniciAdi) && hesap2.getParola().equals(PArola)) {
            return true;
        } else {
            System.out.println("Hatalı Giriş");
            return false;
        }
    }

}
