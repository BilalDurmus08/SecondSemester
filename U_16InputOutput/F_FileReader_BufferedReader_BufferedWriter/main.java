package U_16InputOutput.F_FileReader_BufferedReader_BufferedWriter;

import java.io.*;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        String deger;               //V,BufferedReader isteğe bağlıdır. Programı hızlandırır.
        try (Scanner scanner = new Scanner(new BufferedReader (new FileReader("dosya.txt")))){
 //BuffredReader kullanmamızın amacı, komple satırı okuyup bize getirir. Ama sadece FileReader kullansaydık
 //Sadece tek bir byte okuyacak gelecek işlicek sonra 2. byteı okuyacak işlicekti. Tekrar tekrar git gel işleminden
 //Kurtarmış olarak performans kazancı sağlamış olmaktayız.

                while (scanner.hasNext()){
                deger = scanner.nextLine();
                System.out.println("Okunan satırdaki değer: " + deger);//scanner.nextLine bir alt satıra geçirir.
                String[] array = deger.split(",");

                if (array[1].equals(" Bilgisayar Mühendisliği")){
                    System.out.println(array[1]);
                }

            }


        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı!!");
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dosya.txt", true))){
            bufferedWriter.write("\nAli Ozan, Elektrik");
        } catch (IOException e) {
            System.out.println("Dosya bulunamadı.");
        }

    }

}
