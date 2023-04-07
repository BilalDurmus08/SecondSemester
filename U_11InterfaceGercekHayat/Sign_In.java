package U_11InterfaceGercekHayat;

public class Sign_In {
    private I_Interface SignInterface;
    Sign_In(I_Interface SignInterface){
        this.SignInterface = SignInterface;

    }
     public void signInMethod(user userr){
        if (SignInterface.check(userr))
            System.out.println("Girişiniz başarıyla sağlandı."+ userr.getIsim());
        else
            System.out.println("Girişiniz sağlanamadı."+ userr.getIsim());
     }



}
