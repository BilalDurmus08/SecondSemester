package U_16InputOutput.C_mp3Kopyalama;

import java.io.*;
import java.util.ArrayList;

public class main {
    static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void doyaOku(){
        try {
            FileInputStream fis = new FileInputStream("sarki.mp3");

            int deger;
            while((deger = fis.read()) != -1){
               arrayList.add(deger);

            }


        } catch (FileNotFoundException e) {
            System.out.println("Şarkı açılırken sorunla karşılaşıldı.");
        } catch (IOException e) {
            System.out.println("Okunamadı değer");
        }
    }

    public static void kopyala(String dosyaAdi){
        try {
            FileOutputStream outputStream = new FileOutputStream(dosyaAdi);
            for (int a : arrayList){
                outputStream.write(a);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Doya bulumamamış");
        } catch (IOException e) {
            System.out.println("Yazmada hata çıktı");
        }

    }

    public static void main(String[] args) {
        long baslangic;
        long bitis;
        baslangic = System.currentTimeMillis();
        doyaOku();
        kopyala("sarkiKopya2.mp3");
        bitis = System.currentTimeMillis();
        System.out.println("Kopyalama süresi: " + (bitis - baslangic)/1000);
    }
}
