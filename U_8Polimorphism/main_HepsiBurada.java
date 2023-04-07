package U_8Polimorphism;

class hayvan {  //Polimorphism amacı bir class birden fazla classı işaret edebilir.
    String name;    //extends olması lazım ama

    hayvan(String name) {
        this.name = name;
    }

    public String konus() {
        return "Hayvan Konuşii";
    }

}

class kedi extends hayvan {
    public kedi(String namee) {
        super(namee);
    }

    @Override
    public String konus() {
        return name + " konuşuyorr";
    }
}

    class balik extends hayvan{
       public balik (String name1){
           super(name1);
       }

        @Override
        public String konus() {
            return name + " Konuşuyor";
        }
    }



public class main_HepsiBurada {
    public static void konustur (hayvan hayvan4){
        System.out.println( hayvan4.konus());
    }
    public static void konusturObjeli (Object objee){
        if (objee instanceof kedi){
            kedi kedii = (kedi) objee;
            System.out.println(kedii.konus());
        } else if (objee instanceof  balik) {
            balik balikk = (balik) objee;
            System.out.println(balikk.konus());
        } else if (objee instanceof  hayvan) {
            hayvan hayvann = (hayvan) objee;
            System.out.println(hayvann.konus());
        }


    }

    public static void main(String[] args) {

        hayvan hayvan1 = new kedi("kedopo");
        hayvan hayvan2 = new balik("balıkopo");
        hayvan hayvan3 = new hayvan("bu da hayvan sanırım");
        System.out.println(hayvan1.konus()+"\n"+
        hayvan2.konus()+"\n"+
        hayvan3.konus());
            // Veya alttaki gibi bir kullanım da sergileyebiliriz.
        konustur(new kedi("karaliii")); // Böyle de oluşturulabilir.

        balik balik1 = new balik("balıkopoo");
        if (balik1 instanceof balik)        //İnstanceof anahtar kelimesini o sınıftan mıdır diye kontrol ederken kullanırız.
            System.out.println("Bu nesne balık sınıfından");
        System.out.println("******************************************************************************");
        konusturObjeli(hayvan1);
        konusturObjeli(hayvan2);
        konusturObjeli(hayvan3);

    }



}
