package U_8_OOP_Constructorlar_Inheritance.U_8OOPAtm;

import java.util.Scanner;

public class Atm {
    public void atmCalis() {
        Scanner scan = new Scanner(System.in);
        hesap hesap1 = new hesap("Bilal", "123", 200);
        int girisHakki = 3;
        login login1 = new login();

        while (true) {
            if (girisHakki == 0) {
                System.out.println("Giriş hakkı bitti.");
                return;//Burada atm Calıs methodundan çıktık.
            }
            if (login1.giris(hesap1)) {
                System.out.println("Atm'ye yönlendiriliyorsunuz.");
                break; // While döngüsünden çıktık hala methoddayız.
            } else if (!login1.giris(hesap1)) {
                girisHakki -= girisHakki;
                System.out.println("Yanlış girdiniz. Kalan hak: " + girisHakki);
            }
        }
        String islemler =
                "Lütfen sadece sayı seçiniz !\n" +
                        "1-) Para Çek\n" +
                        "2-) Para Yatır\n" +
                        "3-) Bakiye Öğren \n" +
                        "4-) Çıkış Yap";

        while (true) {
            System.out.println(islemler);
            String secilen = scan.nextLine();
            switch (secilen) {
                case "1": {
                    hesap1.paraCek();
                    break;
                }
                case "2": {
                    hesap1.paraYatir();
                    break;
                }
                case "3": {
                    System.out.println(hesap1.getBakiye());
                    break;
                }
                case "4": {
                    System.out.println("Atm'den çıkılıyor. Bye bye");
                    return;
                }
                default: {
                    System.out.println("Hatalı giriş sağladınız. Tekrar giriniz.\n" +
                            islemler);
                }
            }
        }
    }
}
