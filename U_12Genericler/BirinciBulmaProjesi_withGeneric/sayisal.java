package U_12Genericler.BirinciBulmaProjesi_withGeneric;

public class sayisal extends Ogr{


    public sayisal(int matematik, int turkce, int sosyal, int fizik) {
        super(matematik, turkce, sosyal, fizik);
    }

    @Override
    int puanhesapla() {
        int not = getMatematik()*5 +getFizik()*4 + getTurkce()*5 + getSosyal()*2;
        return not;
    }

}
