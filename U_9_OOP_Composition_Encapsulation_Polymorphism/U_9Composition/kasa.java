package U_9_OOP_Composition_Encapsulation_Polymorphism.U_9Composition;

public class kasa {
    private String model;
    private String uretici;
    private String malzeme;

    public void bilgisayari_ac(){
        System.out.println("Pc Açılıyor");
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

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public kasa(String model, String uretici, String malzeme) {
        this.model = model;
        this.uretici = uretici;
        this.malzeme = malzeme;
    }
}
