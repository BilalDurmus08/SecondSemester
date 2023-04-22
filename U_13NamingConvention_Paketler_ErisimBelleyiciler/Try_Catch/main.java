package U_13NamingConvention_Paketler_ErisimBelleyiciler.Try_Catch;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int i;
        ArrayList<Integer> listim = new ArrayList<>();
        listim.add(11);
        listim.add(88);
        listim.add(64);
        try {            //Hata oluşturabilecek kısımları buraya yazarız.
             i = 15/0;
        }catch (ArithmeticException e){      //Buraya ise hatanın türünü yazarız. Ayrıntıya girmek istemezsek U_13NamingConvention_Paketler_ErisimBelleyiciler.Exception yazarız.
            System.out.println("Sıfır ile bölünemez");
           // e.printStackTrace();   bu method ise hatamızın ne olduğunu bizlere söyler. Catch'nin içine yazılır
        }

        try {
            listim.get(5);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Arrayin boyu aşıldı");
        }finally {  //Birden fazla catch yazılabilir ama biri çalışır.
            System.out.println("Çalıştı Finally"); //Lakin catch blokları çalışsa da çalışmasa da finally bloğu çalışır.
        }                                         //Catch bloğu hatayı yakalayamasa da, hata alsak da finally çalışır.




    }
}
