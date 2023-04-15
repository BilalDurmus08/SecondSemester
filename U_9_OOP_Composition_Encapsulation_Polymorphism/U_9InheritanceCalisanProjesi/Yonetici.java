package U_9_OOP_Composition_Encapsulation_Polymorphism.U_9InheritanceCalisanProjesi;

public class Yonetici extends Calisan{
    public String getSorumluOlduguKisi() {
        return SorumluOlduguKisi;
    }

    private String SorumluOlduguKisi;

    public Yonetici(String isim, String soyad, int id,String SorumluOlduguKisi) {
        super(isim, soyad, id);
        this.SorumluOlduguKisi = SorumluOlduguKisi;
    }
    public void zamyap (int zamMiktari){
        System.out.println(getIsim()+" "+ zamMiktari+" Kadar zam yapti");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu olunan kişi: "+ SorumluOlduguKisi);
    }

}
