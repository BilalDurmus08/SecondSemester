package U_12Genericler.Generic_Class;

public class main {
    public static void main(String[] args) {
        Ogrenci[] ogrenci = {new Ogrenci("Bilal"), new Ogrenci("Durmuş"), new Ogrenci("Melisa")};
        Character[] charli = {'J', 'A', 'V', 'A'};
        Integer[] intli = {1,12,13,18,98};
        String[] stringli = {"RRR", "TTT", "eee", "pppp"};

        CharYazdir.charYazdir1(charli);
        System.out.println("***********************");
        IntegerYazdir.IntegerYazdir1(intli);
        System.out.println("***********************");
        StringYazdir.stringYazdir1(stringli);
        System.out.println("***********************");
        for(Ogrenci a : ogrenci){
            System.out.println(a);
        }
        System.out.println("**** Bundan sonrası genericli yazdirmadır ****");
        Genericli_Yazdirma<Character> characterGenericli_yazdirma = new Genericli_Yazdirma<Character>();
        Genericli_Yazdirma<Integer> integerGenericli_yazdirma = new Genericli_Yazdirma<Integer>();
        Genericli_Yazdirma<String> stringGenericli_yazdirma = new Genericli_Yazdirma<String>();
        Genericli_Yazdirma<Ogrenci> ogrenciGenericli_yazdirma = new Genericli_Yazdirma<Ogrenci>();

        characterGenericli_yazdirma.yazdirma(charli);
        System.out.println("***********************");
        integerGenericli_yazdirma.yazdirma(intli);
        System.out.println("***********************");
        stringGenericli_yazdirma.yazdirma(stringli);
        System.out.println("***********************");
        ogrenciGenericli_yazdirma.yazdirma(ogrenci);
    }
}
