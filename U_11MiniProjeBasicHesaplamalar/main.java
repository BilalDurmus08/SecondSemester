package U_11MiniProjeBasicHesaplamalar;

public class main {
    public static void main(String[] args) {
        //problem.Matematik probMath = new problem().new Matematik();
        //statik olmasaydı böyle tanımlayacaktık ama statikte direkt çağırabiliyoruz.

        problem.Matematik.ucgenCevre(12,15,20);
        vec vec1 = new vec("Birinci Vektör");
        System.out.println("********************");
        vec vec2 = new vec("Buda İkincisi Vektör");
        problem.Fizik.iccarpim(vec1,vec2);




    }
}
