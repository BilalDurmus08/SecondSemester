package U_16InputOutput.C_mp3KopyalamaDeneme;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class main {
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void okuma(){
        String name = "sarki.mp3";
        int deger;
        try {
            FileInputStream fileInputStream = new FileInputStream(name);
            deger = fileInputStream.read();
            while (deger != -1){
                arrayList.add(deger);
                deger = fileInputStream.read();
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException e) {
            System.out.println("Read işleminde sorun çıktı");
        }
    }

    public static void kopyala (String name) {
        try {
            FileOutputStream outputStream = new FileOutputStream(name);

            for (int a : arrayList) {
                outputStream.write(a);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Output Stream olusturulamadı");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }




    public static void main(String[] args) {
        long baslangic;
        long bitis;

        baslangic = System.currentTimeMillis();
        okuma();
        kopyala("yeniYapilan.mp3");

        bitis = System.currentTimeMillis();
        System.out.println("Kopyalamada geçen süre: " + (bitis - baslangic)/1000);
    }
}
