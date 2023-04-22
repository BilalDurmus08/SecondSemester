package U_13NamingConvention_Paketler_ErisimBelleyiciler.Throw;

import java.util.Scanner;

public class main {

    public static void  yasKontrol(int yas) throws ArithmeticException { //Sondaki throws kısmı isteğe bağlı.
        if (yas < 18){                                                  //Check exceptionslarda zorunludur.
            throw new ArithmeticException();
        }else
            System.out.println("Alkol alabilir.");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        //yasKontrol(yas);   Eğerkim böyle bırakırsak hata alırız. Kırmızı olur console ve işlemlerimiz sonlanır

        try {
            yasKontrol(yas);
        }catch (ArithmeticException E){
            System.out.println("Bu eleman mekana giremez. Çünkü velet.");
        }


    }
}
