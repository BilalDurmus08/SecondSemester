package U_10ArrayList_LinkedList.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
            //LinkedinList'ler bellekte büyük alan tutar ama hızlı işlem yaparlar arrayListlere göre.
            //O yüzden ne zaman nerede kullanacağına kendin karar ver.
public class main {
    public static void LinkedListBastir(LinkedList<String> Listim){
        ListIterator<String> iteratorum = Listim.listIterator();

        while (iteratorum.hasNext()){
            System.out.println(iteratorum.next());
        }

    }

    public static void alfabetikSirala (LinkedList linkedList, String name){
        ListIterator<String> Iteratorum = linkedList.listIterator();
        while (Iteratorum.hasNext()){
            int buyukluk = Iteratorum.next().compareTo(name);
            if (buyukluk == 0) {
                System.out.println("Aynı değer girdiniz");
                return;
            } else if (buyukluk < 0) {
                //Name daha buyuk ise. Atlarız döngünün sonundaki add methodu etkinleşir.
            } else if (buyukluk > 0) {
                Iteratorum.previous();
                Iteratorum.add(name);
                return;
            }
        }Iteratorum.add(name);
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Milano");
        linkedList.add("Paris");
        linkedList.add("Fransa");
        linkedList.add("Turkey");
        linkedList.add("Diyarbekiir");
        linkedList.add(3,"Eskişehir");


        LinkedListBastir(linkedList);
        System.out.println("***************************");

        LinkedList<String> linkedList1 = new LinkedList<>();
        alfabetikSirala(linkedList1, "Cizre");
        alfabetikSirala(linkedList1, "Mortal Combat");
        alfabetikSirala(linkedList1, "Kutadgu Bilig");
        alfabetikSirala(linkedList1, "Artuklular");

        LinkedListBastir(linkedList1);
    }
}
