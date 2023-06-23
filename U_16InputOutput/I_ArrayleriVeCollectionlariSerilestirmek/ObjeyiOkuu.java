package U_16InputOutput.I_ArrayleriVeCollectionlariSerilestirmek;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
//Not: Eğerki bir methodun veya değişkenin başına static koyarsak, serileştirme işlemi onun için geçerli olmaz.
//Not2: Ogrenci_I classında bir değişkenin başına transient koyarsak o da serileştirmeye katılmaz.
//Example: private transient String name ----- burada name değişkeni serileştirilmez.

public class ObjeyiOkuu {

    public static void main(String[] args) {
        String filePath = "ogrenciler.byte";

        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)){

            Ogrenci_I[] arrayim = (Ogrenci_I[]) ois.readObject();
            ArrayList<Ogrenci_I> arrayList = (ArrayList<Ogrenci_I>) ois.readObject();
            System.out.println("******************");
            for(Ogrenci_I a : arrayim){
                System.out.println(a);
                System.out.println("///////");
            }
            System.out.println("*********************");
            for(Ogrenci_I a : arrayList){
                System.out.println(a);
                System.out.println("//////");
            }
            System.out.println("**************");


        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }

}
