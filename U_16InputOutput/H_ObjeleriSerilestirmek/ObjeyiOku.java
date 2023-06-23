package U_16InputOutput.H_ObjeleriSerilestirmek;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjeyiOku {
    public static void main(String[] args) {
        String FilePath;
        FilePath = "Ogrenci.byte";
       try (FileInputStream fis = new FileInputStream(FilePath);
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Ogrenci_Obje_Icin ogrenciObjeIcin1 = (Ogrenci_Obje_Icin) ois.readObject();
            Ogrenci_Obje_Icin ogrenciObjeIcin2 = (Ogrenci_Obje_Icin) ois.readObject();

           System.out.println("***************");
           System.out.println(ogrenciObjeIcin1);
           System.out.println("***************");
           System.out.println(ogrenciObjeIcin2);

       }
       catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }

    }//main finished




}//finish
