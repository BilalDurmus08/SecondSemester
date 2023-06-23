package U_16InputOutput.I_ArrayleriVeCollectionlariSerilestirmek;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ObjeyiYazz {

    public static void main(String[] args) {
        String filePath = "ogrenciler.byte";
        Ogrenci_I ogrenci1 = new Ogrenci_I("Bilal", 56, "Mühendis" );
        Ogrenci_I ogrenci2 = new Ogrenci_I("Berk", 599, "Memur" );
        Ogrenci_I ogrenci3 = new Ogrenci_I("Çağla", 4518, "Bulaşıkçı" );

        Ogrenci_I[] array =  {ogrenci1, ogrenci2, ogrenci3};
        ArrayList<Ogrenci_I> ArrayList = new ArrayList<>(Arrays.asList(array));


        try(FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(array);
            oos.writeObject(ArrayList);


        }catch (IOException e){
            e.printStackTrace();
        }


    }



}
