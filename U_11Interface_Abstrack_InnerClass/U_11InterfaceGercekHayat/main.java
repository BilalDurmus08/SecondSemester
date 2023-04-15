package U_11Interface_Abstrack_InnerClass.U_11InterfaceGercekHayat;

public class main {
    public static void main(String[] args) {

        user userrr = new user("Dilal", 16);
        Sign_In sign_in = new Sign_In(new ResitMi());

        sign_in.signInMethod(userrr);

    }
}
