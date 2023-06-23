package U_16InputOutput.B_FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class main {

    public static void main(String[] args) {

        FileOutputStream fos = null;


        {
            try {
                fos = new FileOutputStream("dosyaaaaaa.txt" ,true); //İkinci truenin anlamı. Yazdığımız dosyadaki verilerin
                                                                     //Otomatik silinmesini engellemek.
                byte[] array = {14,1,6,3};
                fos.write(array);

                String s = "   Yalnızlığa çare";
                byte[] stringim = s.getBytes();
                fos.write(stringim);

            } catch (FileNotFoundException e) {
                System.out.println("File couldn't find");
            } catch (IOException e) {
                System.out.println("Dosyaya yazılırken bir hatayla karşılaşıldı. ");
            } finally {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("Dosya Kapatılamadı.");
                }
            }

        }




    }

}
