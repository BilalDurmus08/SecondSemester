package U_10ArrayList_LinkedList.SarkiciProjesi;

public class main {
    public static void main(String[] args) {
        //Konsoldan alabilirdim Saricilar classındaki methodlları, ama çok vaktimi alırdı o yüzden burdan yazmayı tercih ettim.
        Sarkicilar sarkicilar = new Sarkicilar();
        sarkicilar.sarkiciEkle(new String[]{"Bilal", "tarkan", "Dennis Lyod", "Sagopa"});
        sarkicilar.sarkiciCikar("Sagopa");
        sarkicilar.sarkiciKonumu("tarkan");
        sarkicilar.yerDegistir("Bilal", "Dennis Lyod");
        sarkicilar.sarkiciBastir();

    }


}
