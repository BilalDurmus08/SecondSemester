package U_11InnerClass;

public class Siniflarr {
    public class ogrenciler {
        private String isim = "Lalegül";
        public void isimiDe (String isimm){
            System.out.println(isim + " "+ isimm + "'a selam söylüyo knk" );
        }
    }

    public class loveMidur {

        public boolean askMiDegilMi (boolean AsikMi){
            System.out.println("Asık mı acep");
            return AsikMi;
        }
    }


}
