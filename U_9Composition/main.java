package U_9Composition;

public class main {
    public static void main(String[] args) {
        Resulation resulation = new Resulation("112", "20");
        Monitor monitor = new Monitor("MonitorModel", "ModelUretici", "ModelBoyut", resulation);
        AnaKart anakart = new AnaKart("AnakartModel", "AnakartUretici", 20, "ios");
        kasa kasa1 = new kasa("KasaModel", "KasaUretici", "KasaMalzeme");
        Bilgisayar bilgisayar1 = new Bilgisayar(monitor, kasa1, anakart);

        bilgisayar1.getAnaKart1().isletim_sistemi_yukle("Windows");
        bilgisayar1.getKasa1().bilgisayari_ac();
        bilgisayar1.getMonitor1().monitoruKapa();

    }
}
