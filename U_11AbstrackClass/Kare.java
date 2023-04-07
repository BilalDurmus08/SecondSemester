package U_11AbstrackClass;

public class Kare extends SekilAbstrack{

    private int kenar;
    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        System.out.println(getIsim()+ "Alanı: " + Math.pow(kenar, 2));
    }
}
