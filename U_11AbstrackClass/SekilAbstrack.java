package U_11AbstrackClass;

public abstract class SekilAbstrack {   //Abstrack classlarda hem abstrack method hem de normal methodlar bulunabilir.

    private String isim;

    public  void adimiSoyle(){
        System.out.println("Bu şekil " + isim + "objesine aittir.");
    }

    public abstract void alanHesapla();


    public SekilAbstrack(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

}
