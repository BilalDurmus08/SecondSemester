package U_9InheritanceCalisanProjesi;

import U_9Inheritance.Yonetici;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Projeye hoş geldiniz. Lütfen yapmak istediğiniz işlemi seçiniz.");
        String islemler = "1-) Yazılımcı işlemleri\n"+
                            "2-) Yönetici İşlemleri\n"+
                                "Çıkmak için q'ya bas: ";
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println(islemler);
            String secilen_islem_Bas = scan.nextLine();
            if (secilen_islem_Bas.equals("q")){
                System.out.println("Sistemden çıkılıyor bye");
                break;
            } else if (secilen_islem_Bas.equals("1")) {
                String bilgi = "1-) Format at\n"+
                        "2-) Bilgileri getir\n"+
                        "Çıkmak için q'ya bas: ";

                Yazilimci yazilimcii = new Yazilimci("Bilal", "It bestard", 2000, "Only JAVA");

                while (true){
                    System.out.println(bilgi);
                    String secilen_islem_yazilim = scan.nextLine();
                    if (secilen_islem_yazilim.equals("q")){
                        System.out.println("Yazılımcı işleminden çıkılıyor.");
                        break;
                    } else if (secilen_islem_yazilim.equals("1")) {
                        System.out.println("Lütfen formatlamak istediğiniz altyağıyı giriniz.");
                        String formatinki = scan.nextLine();
                        yazilimcii.formAt(formatinki);
                    } else if (secilen_islem_yazilim.equals("2")) {
                        yazilimcii.bilgileriGetir();
                    }
                    else {
                        System.out.println("Yanlış girdi sağladınız");
                    }
                }
            } else if (secilen_islem_Bas.equals("2")) {
                Yonetici yoneticii =new Yonetici("Beyza", "manangment", 4000,4);
                String bilgii = "1-) Zam yap\n"+
                                "2-) Bilgileri getir\n"+
                                 "Çıkkış için q'ya bas: ";
                while (true){
                    System.out.println(bilgii);
                    String secilen = scan.nextLine();
                    if (secilen.equals("q")){
                        System.out.println("Yoneticiden çıkılıyor knk");
                        break;
                    } else if (secilen.equals("1")) {
                        System.out.println("Lütfen zam miktarını giriniz: ");
                        int zamMiktari = scan.nextInt();
                        yoneticii.zamYap(zamMiktari);
                    } else if (secilen.equals("2")) {
                        yoneticii.bilgileriGetir();
                    }
                        else {
                        System.out.println("Yanlış girdi sağladınız.");
                    }
                }
            }
           else {
                System.out.println("Yanlış girdi sağladınızzzzzzzzzz.");
            }
        }
        System.out.println("Program sonlandı");


    }
}
