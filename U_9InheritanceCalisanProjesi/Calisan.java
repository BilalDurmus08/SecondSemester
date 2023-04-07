package U_9InheritanceCalisanProjesi;

public class Calisan {
    private String isim;
    private String soyad;
    private int id;

    public String getIsim() {
        return isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getId() {
        return id;
    }


    public Calisan(String isim, String soyad, int id) {
        this.isim = isim;
        this.soyad = soyad;
        this.id = id;
    }

    public void bilgileriGoster() {
        System.out.println("İsim: " + isim);
        System.out.println("Soyad: " + soyad);
        System.out.println("Id: " + id);
    }


}
