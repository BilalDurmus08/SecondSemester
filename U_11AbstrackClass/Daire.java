package U_11AbstrackClass;

public class Daire extends SekilAbstrack{

    private int yaricap;
    public Daire(String isim, int yaricap) {
        super(isim);
        this.yaricap = yaricap;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim() + "Alanı: " + Math.PI * Math.pow(yaricap,2));
    }
    public void cevreHesapla(){
        System.out.println(getIsim()+ "Çevresi: " + Math.PI * 2 * yaricap);
    }


}
