package U_16InputOutput.G_MP_DosyadanOkuyarakNotHesaplama;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static String harflendir (String isim, int vize1, int vize2, int finalNot){
        double totalNot = (vize1*0.3 + vize2*0.3 + finalNot*0.4);
        String returnlanacak = "";
        if (totalNot >= 85){
            returnlanacak = isim + " adlı öğrenci AA aldı.";
        } else if (totalNot >= 75) {
            returnlanacak = isim + " adlı öğrenci BB aldı.";
        }
        else if (totalNot >= 65) {
            returnlanacak = isim + " adlı öğrenci CC aldı.";
        }
        else if (totalNot >= 55) {
            returnlanacak = isim + " adlı öğrenci DD aldı.";
        }
        else {
            returnlanacak = isim + " adlı öğrenci FF aldı.";
        }
        return returnlanacak;
    }

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("dosya123.txt") );
            FileWriter fileWriter = new FileWriter("harflendirilmisNotlu.txt", true)){
            //try bloğunun içine birden fazla işlem yapmak istersek ; ile ayırmalıyız
            String value;
            int vize1;
            int vize2;
            int finalNott;
            fileWriter.write("bişelerrr");
            while (scanner.hasNext()){
                value = scanner.nextLine();
                String[] array = value.split(",");
                vize1 = Integer.parseInt(array[1]);
                vize2 = Integer.parseInt(array[2]);
                finalNott = Integer.parseInt(array[3]);
             String yazdir = harflendir(array[0], vize1, vize2, finalNott);
                fileWriter.write(yazdir + "\n");
            }


        } catch (FileNotFoundException e) {
            System.out.println("File couldn't find");
        } catch (IOException e) {
            System.out.println("File açılamadı");
        }


    }


}
