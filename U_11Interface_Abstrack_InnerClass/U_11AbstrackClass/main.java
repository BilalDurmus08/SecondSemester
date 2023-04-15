package U_11Interface_Abstrack_InnerClass.U_11AbstrackClass;

public class main {
    public static void main(String[] args) {
        SekilAbstrack abstrackk = new Daire("Daire1" , 4);
        //Eğerkim daire classınının içinde özel olarak yaratmış, abstrack classta olmayan bir methodu
        //Çağırmak istersek çağıramayız. Lakin abstracktan gelen methodlara erişebiliriz.
        abstrackk.adimiSoyle();
        abstrackk.alanHesapla();
        System.out.println("**************************************");
        //abstrackk.cevreHesapla ya ulaşamayız. Lakin referansı da Daire classından yaparsak getirebiliriz.
        Daire dairee1 = new Daire("Dariree", 8);
        dairee1.alanHesapla();
        dairee1.adimiSoyle();
        dairee1.cevreHesapla();
        //böyle oldiii
        System.out.println("*************************************");
        SekilAbstrack kare = new Kare("kare1 ", 8);
        kare.alanHesapla();
        kare.adimiSoyle();


    }
}
