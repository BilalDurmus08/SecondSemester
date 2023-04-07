package U_11MiniProjeBasicHesaplamalar;

public class problem {


    public static class Matematik {
        public static void ucgenCevre(int kenar1, int kenar2, int kenar3){
         int totalKenar = kenar1 + kenar2 + kenar3;
            System.out.println("Total kenar: " + totalKenar);
        }



    }

    public static class Fizik {

        public static void iccarpim (vec vec1, vec vec2){
        int total = vec1.getI()*vec2.getI() + vec1.getJ()*vec2.getJ() + vec1.getK()*vec2.getK() ;
            System.out.println(vec1.getName() + " ile " + vec2.getName() + " ic carpimi: " + total);
        }


    }


}
