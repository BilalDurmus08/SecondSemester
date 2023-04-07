package U_11Interface;

public class Pc_Muhendis implements I_Muhendis, I_Calisma{ //Böylece birden fazla koyabiliriz.
    private boolean askerlik;
    private boolean adliSicil;

    public Pc_Muhendis(boolean askerlik, boolean adliSicil) {
        this.askerlik = askerlik;
        this.adliSicil = adliSicil;
    }

    @Override
    public void calisma() {

    }

    @Override
    public void askerlikDurumu() {
        if (askerlik)
            System.out.println("Askerliği yaptım");
        else
            System.out.println("Henüz askerlik yapılmadı");
    }

    @Override
    public String mezuniyet_ortalamasi(double ortalama) {

        return "ortalamam: "+ortalama;
    }

    @Override
    public void adli_Sicil_sorgula() {
        if (adliSicil)
            System.out.println("Adli sicil kaydı bulunuyor.");
        else
            System.out.println("Herhangi bir adli sicil kaydı yokk");
    }

    @Override
    public void is_tecrubesi(String[] tecrube) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım: ");
        for (int i = 0; i < tecrube.length; i++) {
            System.out.println(tecrube[i]);
        }
        
    }
}
