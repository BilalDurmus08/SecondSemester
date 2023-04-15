package U_10ArrayList_LinkedList.SehirlerArasiGecisProjesi;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
        public static void mesajiYazdir(){
            String mesaj = "0-) Mesajı Yazdır"+
                            "\n1-) Sehir İleri Git"+
                            "\n2-) Sehir Geri gel"+
                            "\n3-) Cıkıs";

            System.out.println(mesaj);
        }
    public static void switchliYapim(LinkedList listim){
        ListIterator iteratorum = listim.listIterator();

        boolean cikis = false;
        mesajiYazdir();
        boolean gidis = true;
        while(!cikis){
            System.out.print("İslem seciniz: ");
            Scanner scanner = new Scanner(System.in);
            String secim = scanner.nextLine();
            switch (secim){
                case "0":{
                    mesajiYazdir();
                    break;
                }
                case "1":{
                    if (!iteratorum.hasNext()){
                        System.out.println("Gidilecek sehir yok");
                        break;
                    }
                    if (!gidis){
                        iteratorum.next();
                    }
                    gidis = true;
                    System.out.println("Sonraki sehre gidiliyor.");
                    System.out.println(iteratorum.next() + " sehrine gidildi");
                    break;
                }
                case "2":{
                    if (!iteratorum.hasPrevious()){
                        System.out.println("Dönülecek sehir yok.");
                        break;
                    }
                    if (gidis){
                        iteratorum.previous();
                    }
                    gidis = false;
                    System.out.println("Önceki Sehre geliniyor.");
                    System.out.println(iteratorum.previous() + " sehrine dönüldü");
                    break;
                }
                case "3":{
                    System.out.println("İslemlerden çıkılıyor.");
                    cikis = true;
                    break;
                }
                default: {
                    System.out.println("Yanlış girdi verdiniz. tekrar deneyin");
                break;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ankara");
        linkedList.add("Artvin");
        linkedList.add("İzmir");
        linkedList.add("Eskişehir");

    switchliYapim(linkedList);

    }
}














