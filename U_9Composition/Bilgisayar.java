package U_9Composition;

public class Bilgisayar {
    private Monitor monitor1;
    private kasa kasa1;
    private AnaKart anaKart1;

    public Monitor getMonitor1() {
        return monitor1;
    }

    public void setMonitor1(Monitor monitor1) {
        this.monitor1 = monitor1;
    }

    public kasa getKasa1() {
        return kasa1;
    }

    public void setKasa1(kasa kasa1) {
        this.kasa1 = kasa1;
    }

    public AnaKart getAnaKart1() {
        return anaKart1;
    }

    public void setAnaKart1(AnaKart anaKart1) {
        this.anaKart1 = anaKart1;
    }

    public Bilgisayar(Monitor monitor1, kasa kasa1, AnaKart anaKart1) {
        this.monitor1 = monitor1;
        this.kasa1 = kasa1;
        this.anaKart1 = anaKart1;


    }
}
