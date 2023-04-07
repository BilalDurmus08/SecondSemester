package U_11Interface;

public class main {
    public static void main(String[] args) {
        //İnterfacelerden obje oluşturulamaz.
        //ama oluşacak objeye öncülük edebilir.
    //  I_Muhendis        getirilebilir. Referans edebilir.
        Pc_Muhendis muhendis1 = new Pc_Muhendis(false, false);
          muhendis1.adli_Sicil_sorgula();
          muhendis1.askerlikDurumu();
          muhendis1.mezuniyet_ortalamasi(50);
          String[] tecrube = {"arcelik, beko"};
          muhendis1.is_tecrubesi(tecrube);

    }
}
