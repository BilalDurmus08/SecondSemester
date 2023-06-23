package U_16InputOutput.E_tryWithResource;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
            //Bu konunun amacı çok fazla sayıda try catch bloğu yazmadan
            //Ayrıca Dosyayı kapama zorunda kalmadan otomatik kapamasını sağlayan yoldur.
    public static void main(String[] args) {
        try(FileWriter fileWriter1 = new FileWriter("tryWithFileWriter1.txt" ) //;  //Birden fazla açmak istersek
           // FileWriter fileWriter2 = new FileWriter("tryWithFileWriter2.txt")   //Noktalı virgül iş görür
        ) {
            fileWriter1.write("Bişeler");
            String message;
            while(true){
                System.out.print("İl Giriniz: ");
                Scanner scanner = new Scanner(System.in);
                message = scanner.nextLine();

                if (message.equals("-1"))
                    break;
                fileWriter1.write(message + "\n");

            }


        } catch (IOException e) {
            System.out.println("Dosya açılamadı");
        }


    }
}
