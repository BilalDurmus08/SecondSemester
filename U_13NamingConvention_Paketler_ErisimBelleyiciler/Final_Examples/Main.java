package U_13NamingConvention_Paketler_ErisimBelleyiciler.Final_Examples;

public class Main {
    public static void main(String[] args) {
        IncludeFinal class1 = new IncludeFinal();
        IncludeFinal class2 = new IncludeFinal();
        System.out.println("Final değişkenimiz: " + class1.numberOfClass);
        System.out.println("Final değişkenimiz: " + class2.numberOfClass);
        IncludeFinal class3 = new IncludeFinal();
        System.out.println("Final değişkenimiz: " + class1.numberOfClass); //final olduğundan değişmez.
        System.out.println("Final değişkenimiz: " + class2.numberOfClass);
        System.out.println("Final değişkenimiz: " + class3.numberOfClass);


        System.out.println("Static olan class yaratma değişkeni: " + IncludeFinal.createClassNumber);

    }


}
