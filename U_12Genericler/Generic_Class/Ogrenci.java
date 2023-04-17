package U_12Genericler.Generic_Class;

public class Ogrenci {
    private String isim;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                '}';
    }
}
