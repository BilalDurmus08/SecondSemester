package U_10HarfBulmaProject;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    private static Kart[][] kartlar = new Kart[4][4];

    public static void main(String[] args) {
        kartlar[0][0] = new Kart('E');
        kartlar[0][1] = new Kart('A');
        kartlar[0][2] = new Kart('B');
        kartlar[0][3] = new Kart('F');
        kartlar[1][0] = new Kart('G');
        kartlar[1][1] = new Kart('A');
        kartlar[1][2] = new Kart('D');
        kartlar[1][3] = new Kart('H');
        kartlar[2][0] = new Kart('F');
        kartlar[2][1] = new Kart('C');
        kartlar[2][2] = new Kart('D');
        kartlar[2][3] = new Kart('H');
        kartlar[3][0] = new Kart('E');
        kartlar[3][1] = new Kart('G');
        kartlar[3][2] = new Kart('B');
        kartlar[3][3] = new Kart('C');

while(true){
        oyunTablosu();
        oyunSirasi();



}

    }
        public static void oyunSirasi(){
            Scanner scan = new Scanner(System.in);
            int i1;
            int i2;
            int j1;
            int j2;
            System.out.print("İlk seçimin i'si: ");
            i1 = scan.nextInt();
            System.out.print("İlk seçimin j'si: ");
            j1 = scan.nextInt();
            System.out.print("İkinci seçimin i'si: ");
            i2 = scan.nextInt();
            System.out.print("İkinci seçimin j'si: ");
            j2 = scan.nextInt();
            if (i1>3 || i2>3 || j1>3 || j2>3){
                System.out.println(" girilen değerler 3 den büyük olamaz. \nLütfen 0 ile 3 arasında değer giriniz.");
            }
            else {
                char deger1;
                char deger2;
                deger1 = kartlar[i1][j1].getDeger();
                deger2 = kartlar[i2][j2].getDeger();

                System.out.println("Yazılan Değer 1.nin: " + kartlar[i1][j1].getDeger());
                System.out.println("Yazılan Değer 2.nin: " + kartlar[i2][j2].getDeger());

                if (Character.toString(deger1).equals(Character.toString(deger2))) {
                    kartlar[i1][j1].setBildiMi(true);
                    kartlar[i2][j2].setBildiMi(true);
                } else
                    System.out.println("Seçtiğiniz değerler uyuşmuyor. Tekrar dene");
            }

    }





    public static void oyunTablosu (){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (kartlar[i][j].isBildiMi())
                    System.out.print("|"+kartlar[i][j].getDeger()+"|  ");
                else
                    System.out.print("| |  ");
            }
            System.out.println("");
        }

    }



}
