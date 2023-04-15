package U_10ArrayList_LinkedList.Strings_SomeProperties;

public class main {
    public static void main(String[] args) {
        String a = new String(); //Böyle de tanımlanabilir, çünkü string bir classtır.
        a = "adsfasdf";
        String b = "Bilal";
        System.out.println(b.charAt(0)); //yazdığımız indexdeki harfi gösterirr.
        System.out.println(b.indexOf("l")); //Yazdığımız harfin hangi indexte olduğunu gördük
        System.out.println(b.lastIndexOf("l")); //en sonrakini bulur. Normal indexini verir.
        System.out.println(b.startsWith("Bi"));
        System.out.println(b.endsWith("al"));

        String a1 = "1924";
        int b1;
        b1 = Integer.parseInt(a1); //from String to int
        System.out.println(b1 - 1);
        String a2;
        a2 = String.valueOf(b1); //from int to String
        System.out.println(a2);

    }
}
