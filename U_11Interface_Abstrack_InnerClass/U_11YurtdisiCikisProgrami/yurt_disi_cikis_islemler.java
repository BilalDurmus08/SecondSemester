package U_11Interface_Abstrack_InnerClass.U_11YurtdisiCikisProgrami;

import java.util.Scanner;

public class yurt_disi_cikis_islemler implements I_Kurallar{
    private static int harc;
    private static boolean vize;
    private static String  alinan;
    Scanner scan = new Scanner(System.in);
    Scanner scann = new Scanner(System.in);
   public yurt_disi_cikis_islemler(){

        System.out.print("Harç Miktarını giriniz: ");
        harc = scan.nextInt();
        System.out.print("Vizeniz varsa evet, yoksa hayır yazınız: ");
        alinan = scann.nextLine();
        if (alinan.equals("evet"))
            vize = true;
        else if (alinan.equals("hayır")) {
            vize = false;
        }
        else
            System.out.println("Yanlış girdiniz.");
    }








    @Override
    public boolean harcKontrol() {
    if (harc < 15) {
        System.out.println("Harç işlemi tamam değil paran yok");
        return false;
    }else{
        System.out.println("Vizeye paran yetti okay.");
            return true;
        }
    }

    @Override
    public boolean vizeKontrol() {
        System.out.println("Vize işlemiş " + vize);
        return vize;
    }



}
