package U_9InheritanceCalisanProjesi;

import U_9Inheritance.Calisan;

public class Yazilimci extends Calisan {
    private String diller;


    public Yazilimci(String isim, String departman, int maas, String diller) {
        super(isim, departman, maas);
        this.diller = diller;
    }

    public void formAt (String Atilacak_Format){
        System.out.println(getIsim() + "Yeni bir "+Atilacak_Format+" Dili yükleniyor.");
    }

    @Override
    public void bilgileriGetir() {
        super.bilgileriGetir();
        System.out.println("Bilinen Diller: "+diller);
    }
}
