package U_9_OOP_Composition_Encapsulation_Polymorphism.U_9Composition;

public class Monitor {
    private String model;
    private String uretici;
    private String boyut;

    private Resulation resulation1;

    public Monitor(String model, String uretici, String boyut, Resulation resulation1) {
        this.model = model;
        this.uretici = uretici;
        this.boyut = boyut;
        this.resulation1 = resulation1;
    }

    public void monitoruKapa(){
        System.out.println("Monitor Kapatılıyor.");
    }
}
