package U_11InnerClass;

public class main {
    public static void main(String[] args) {
        Siniflarr sinif = new Siniflarr();
        Siniflarr.ogrenciler ogr = new Siniflarr().new ogrenciler();
        ogr.isimiDe("Berat");

        Siniflarr.loveMidur lover = new Siniflarr().new loveMidur();
        if (lover.askMiDegilMi(true))
            System.out.println("Yeab buddy");



    }
}
