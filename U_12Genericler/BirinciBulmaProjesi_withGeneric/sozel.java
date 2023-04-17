package U_12Genericler.BirinciBulmaProjesi_withGeneric;

public class sozel extends Ogr{


    public sozel(int matematik, int turkce, int sosyal, int fizik) {
        super(matematik, turkce, sosyal, fizik);
    }

    @Override
    int puanhesapla() {
    int not = getMatematik()*5 + getTurkce()*5 + getFizik()*2 + getSosyal()*4;
    return not;
        }
}
