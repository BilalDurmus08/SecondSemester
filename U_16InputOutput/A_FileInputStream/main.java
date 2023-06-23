package U_16InputOutput.A_FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        FileInputStream fos = null;

        try {
            fos = new FileInputStream("dosya.txt");
             int deger;

             String s = "";
            deger = fos.read();
             while ( deger != -1){

                 s += (char)deger;
                 deger = fos.read();

             }
            System.out.println("Tüm dosya İçeriği: " + s);




            /*System.out.println("Okunan değer: "+ (char)(fos.read())); //soldan başlar değerleri okuyarak ilerler.
            System.out.println("Okunan değer: "+ (char)(fos.read())); // Tek bir byte okur. Okuyacak değer kalmadığında -1 döndürür.
            fos.skip(4); // Burda okunan ilk iki değerden sonra imleci sağa doğru kaç kez oynattığımızı belirledik.
            System.out.println("Okunan değer: "+ (char)(fos.read()));*/

        } catch (FileNotFoundException e) {
            System.out.println("File bulunamadı");
        } catch (IOException e) {
            System.out.println("Dosya okunurken sorunla karşılaşıldı.");
        } finally {
            try {
                if (fos != null){
                fos.close();
                }
            } catch (IOException e) {
                System.out.println("Dosya Kapanırken sorun oldu");
            }
        }



    }

}
