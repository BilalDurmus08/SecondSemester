package U_16InputOutput.H_ObjeleriSerilestirmek;

import java.io.*;

public class ObjeyiYaz {

    public static void main(String[] args) {
        String FilePath;
        FilePath = "Ogrenci.byte";
        try (FileOutputStream fos = new FileOutputStream(FilePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            Ogrenci_Obje_Icin Ogrenci1 = new Ogrenci_Obje_Icin("Bilal", 1234, "Computer Programming");
            Ogrenci_Obje_Icin Ogrenci2 = new Ogrenci_Obje_Icin("Suleyman", 1125, "Industrial Engineering");

            oos.writeObject(Ogrenci1);
            oos.writeObject(Ogrenci2);

            System.out.println("Thw writing process done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
