package U_10ArrayList_LinkedList.SarkiciProjesi;

import java.util.ArrayList;
import java.util.Arrays;

public class Sarkicilar {
    private ArrayList<String> arrayList = new ArrayList<>();

    public void sarkiciEkle(String[] sarkiciIsmi) {
        arrayList.addAll(Arrays.asList(sarkiciIsmi));
        System.out.println("Sarkicilar eklendi");
        System.out.println("*******************");
    }

    public void sarkiciCikar(String name) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (name.equals(arrayList.get(i))) {
                System.out.println(name + " isimli şarkıcı çıkarılıyor.");
                arrayList.remove(name);
            }
        }
        System.out.println("*******************");

    }

    public void sarkiciKonumu (String name){
        int sira = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (name.equals(arrayList.get(i))) {
               sira = i+1;
            }
        }
        if (sira >= 0){
            System.out.println(name + " adlı şarkıcının konumu " + sira);
        }else {
            System.out.println("Şarkıcı bulunamadı");
        }

        System.out.println("*******************");

    }

    public void yerDegistir (String name1, String name2){
        int name1Konum = -1;
        int name2Konum = -1;
        for (int i = 0; i < arrayList.size(); i++) {
            if (name1.equals(arrayList.get(i)))
                name1Konum = i;
            if (name2.equals(arrayList.get(i)))
                name2Konum = i;
        }
        if (name1Konum >= 0 && name2Konum >= 0){
            System.out.println("Girdiğiniz değerler doğrudur. Değiştirme işlemi yapılıyor.");
            arrayList.set(name1Konum, name2);
            arrayList.set(name2Konum, name1);
        }else {
            System.out.println("Girdiğiniz değerler yanlıştır.");
        }
        System.out.println("*******************");

    }
    public void sarkiciBastir (){
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(i+1 + ". sıradaki sarkici: " + arrayList.get(i));
        }
        System.out.println("*******************");

    }





}



