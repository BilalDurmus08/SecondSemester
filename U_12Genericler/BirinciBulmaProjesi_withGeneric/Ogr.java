package U_12Genericler.BirinciBulmaProjesi_withGeneric;

public abstract class Ogr {
    private int Matematik;
    private int Turkce;
    private int Sosyal;
    private int Fizik;

    public Ogr(int matematik, int turkce, int sosyal, int fizik) {
        Matematik = matematik;
        Turkce = turkce;
        Sosyal = sosyal;
        Fizik = fizik;
    }

    public int getMatematik() {
        return Matematik;
    }

    public void setMatematik(int matematik) {
        Matematik = matematik;
    }

    public int getTurkce() {
        return Turkce;
    }

    public void setTurkce(int turkce) {
        Turkce = turkce;
    }

    public int getSosyal() {
        return Sosyal;
    }

    public void setSosyal(int sosyal) {
        Sosyal = sosyal;
    }

    public int getFizik() {
        return Fizik;
    }

    public void setFizik(int fizik) {
        Fizik = fizik;
    }

    abstract int puanhesapla();

}
