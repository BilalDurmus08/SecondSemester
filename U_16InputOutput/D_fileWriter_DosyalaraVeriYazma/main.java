package U_16InputOutput.D_fileWriter_DosyalaraVeriYazma;

import java.io.FileWriter;
import java.io.IOException;

public class main {

    public static void main(String[] args) {
        FileWriter writerr = null; //Hemen yanına da tanımlayabilirdik ama böyle yapdık.
                                   //Çünkü finally blogunun çalışmasını istiyoruz.
        try {
            writerr = new FileWriter("FileWriterinki.txt", true);
            writerr.write("FileWriter ile yazdığım dosya\n");
            String s = "Bişeler bişelerr";
            byte[] byteArray = s.getBytes();
            for (byte a : byteArray){
                writerr.write(a);
            }

        } catch (IOException e) {
            System.out.println("Dosya oluşturulurken hatayla karşılaşıldı.");
        }
        finally {
            if (writerr != null) {
                try {
                    writerr.close();
                } catch (IOException e) {
                    System.out.println("Dosya Kapatılamadı.");
                }


            }
        }


    }



}
