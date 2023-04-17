package U_12Genericler.BirinciBulmaProjesi_withGeneric;

public class main {
    public static void main(String[] args) {
        sayisal sayisal1 = new sayisal(40,42,18,11);
        sayisal sayisal2 = new sayisal(56,24,18,44);
        sozel sozel1 = new sozel(11,25,85,48);
        sozel sozel2 = new sozel(45,35,29,41);

        System.out.println(sayisal1.puanhesapla()+" Puanlı kişi 1. öğrenci");
        System.out.println(sayisal2.puanhesapla()+" Puanlı kişi 2. öğrenci");

        System.out.println("Notu çok olan: "+ yuksekNot(sayisal1, sayisal2).puanhesapla());
        System.out.println("Notu çok olan: "+ yuksekNot(sozel1, sozel2).puanhesapla());
    }
    public static <E extends Ogr> E yuksekNot(E e1, E e2){
            if (e2.puanhesapla() < e1.puanhesapla()){
                return e2;
            }
            else
                return e1;
        }



}
