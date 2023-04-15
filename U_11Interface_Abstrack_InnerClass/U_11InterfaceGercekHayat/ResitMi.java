package U_11Interface_Abstrack_InnerClass.U_11InterfaceGercekHayat;

public class ResitMi implements I_Interface {


    @Override
    public boolean check(user userr) {
        if (userr.getYas() < 18) {
            return false;
        } else {
            return true;
        }
    }

}
