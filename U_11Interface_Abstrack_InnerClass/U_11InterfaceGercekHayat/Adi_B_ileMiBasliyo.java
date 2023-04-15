package U_11Interface_Abstrack_InnerClass.U_11InterfaceGercekHayat;

public class Adi_B_ileMiBasliyo implements I_Interface {

    @Override
    public boolean check(user userr) {
        if (userr.getIsim().contains("B"))
            return true;
        else
            return false;
    }
}
