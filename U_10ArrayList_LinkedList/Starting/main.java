package U_10ArrayList_LinkedList.Starting;

import java.util.ArrayList;

public class main {
    public static void ArrayListYazdir(ArrayList<String> Arraycigim) {
        for (int i = 0; i < 4; i++) {
            System.out.println(Arraycigim.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<String>();
        arrayList.add("Tonny Montano");
        arrayList.add("Patrick Bateman");
        arrayList.add("Casen born");
        arrayList.add("Tyler Durden");

        int[] a = {5, 4, 48, 27, 32};
        for (int bb : a) { //forEachMethodu
            System.out.println(bb);
        }

        ArrayListYazdir(arrayList);

    }
}
