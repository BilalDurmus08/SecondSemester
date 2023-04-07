package U_9Inheritance;

public class Yonetici extends Calisan { //SubClass

    private int sorumluKisi; //Ekstra Ozellik eklemek istersek.
    public Yonetici(String iisim, String ddepartman, int mmaas, int sorumluKisi){
        super(iisim, ddepartman, mmaas); //SuperClasstaki Conctructura eriştik.
        this.sorumluKisi = sorumluKisi; //Hemen üstteki satırda ilk 3 değer için Super classtaki
    }//Constructura gittik. Lakin burada ayrıca eklememiz gerekmekteydi.
     public void zamYap (int zamMiktari){
         System.out.println("Çalışanlara "+zamMiktari+" kadar zam yapıldı.");
     }

    @Override
    public void bilgileriGetir() {
       /* System.out.println("İsim: "+ getIsim());
        System.out.println("Departman: "+getDepartman());
        System.out.println("Maaş: "+getMaas());*/ //Veya istersek alttaki super ile methodu çağırırız.
        super.bilgileriGetir();
        System.out.println("Sorumlu kişi sayısı: "+this.sorumluKisi);
        }


}
