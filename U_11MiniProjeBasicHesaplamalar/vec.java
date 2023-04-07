package U_11MiniProjeBasicHesaplamalar;

import java.util.Scanner;

public class vec {
    private String name;
    private int i;
    private int j;
    private int k;

    public vec(String name) {
        this.name = name;

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter i value: ");
        i = scan.nextInt();
        System.out.print("Please enter j value: ");
        j = scan.nextInt();
        System.out.print("Please enter k value: ");
        k = scan.nextInt();
    }


    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public int getK() {
        return k;
    }

    public String getName() {
        return name;
    }
}
