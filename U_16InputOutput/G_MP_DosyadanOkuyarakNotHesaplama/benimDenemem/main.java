package U_16InputOutput.G_MP_DosyadanOkuyarakNotHesaplama.benimDenemem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class main {
    public static void tumIslemler(){
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("dosya123.txt")))) {
            String deger;
            while (scanner.hasNext()){
                deger = scanner.nextLine();
                String[] array;
                array = deger.split(",");
                int value1 =Integer.parseInt(array[1]);
                int value2 =Integer.parseInt(array[2]);
                int value3 =Integer.parseInt(array[3]);
                double notu = ((value1 + value2)/2 + value3)/2;
                System.out.println("Adı: " + array[0] + " Notu: " + notu );
            }


        } catch (FileNotFoundException e) {
            System.out.println("File couldn't find");
        }


    }


    public static void main(String[] args) {
        tumIslemler();
    }

}
