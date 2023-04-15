package U_9_OOP_Composition_Encapsulation_Polymorphism.U_9Inheritance;

public class Calisan { //SuperClass or BaseClass

    private String isim;
    private String departman;
    private int maas;


    public Calisan(String isim, String departman, int maas) {
        this.isim = isim;
        this.departman = departman;
        this.maas = maas;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void calis (){
        System.out.println("Çalışan son sürat işinin başındadır.");
    }

    public void bilgileriGetir (){
        System.out.println("İsim: "+ isim);
        System.out.println("Departman: "+departman);
        System.out.println("Maaş: "+maas);
    }
    public void departmanDegis(String yeni_Departman){
        System.out.println("Departman Değiştiriliyor.");
        this.departman = yeni_Departman;
        System.out.println("Yeni Departman: "+ departman);
    }



}
