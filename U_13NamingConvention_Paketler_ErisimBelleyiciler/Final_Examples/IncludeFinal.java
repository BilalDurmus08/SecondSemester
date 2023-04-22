package U_13NamingConvention_Paketler_ErisimBelleyiciler.Final_Examples;

public class IncludeFinal {
    public final int numberOfClass; //Final olan değişkenler sadece constructor'da ve başta tanımlanırken verilebilir.
                                    //Ayrıca değiştirilemezler. Methodlarda tanımlanamazlar. Farklı classlarda değiştirilemezler.
    public static int createClassNumber = 0;

    public IncludeFinal() {
        createClassNumber++;
        numberOfClass = createClassNumber;
    }

}
