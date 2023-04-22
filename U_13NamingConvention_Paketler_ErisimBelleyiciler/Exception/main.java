package U_13NamingConvention_Paketler_ErisimBelleyiciler.Exception;

import java.util.Scanner;

public class main {

    public static void yasKontrol(int yas) {
        if (yas < 18) {
            throw new InvalidAgeException("Innvalid Age");
        } else
            System.out.println("Hg mekana");


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yaş gir: ");
        int yas1 = scanner.nextInt();

        try {
            yasKontrol(yas1);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        }

    }

}
