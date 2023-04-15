package U_9_OOP_Composition_Encapsulation_Polymorphism.U_9Composition;

public class AnaKart {
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String isletimSistemi;

    public void isletim_sistemi_yukle (String isletimSistemi){
        this.isletimSistemi = isletimSistemi;
        System.out.println("İşletim sistemi "+isletimSistemi+" yükleniyor");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }



    public AnaKart(String model, String uretici, int yuvaSayisi, String isletimSistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.isletimSistemi = isletimSistemi;
    }
}
