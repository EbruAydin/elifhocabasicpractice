package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        //BURADA KALDIM!
        //1.adim
        //kullanicindan int list uzunlugu iste

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array uzunlugunu giriniz");
        int length = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("girdiginiz uzunlukta array list elemanlairni da giriniz");

        //2.adim
        //List uzunlugu kadar kullanicidan list elemanlarini girmesini iste
        for (int i = 0; i < length; i++) {
            list.add(scan.nextInt());
        }

        tekrarliElemanList(list);

        //3.adim
        //Tekrarli list elemanlarindan yeni bir list olusturan method yap


    }

    private static void tekrarliElemanList(List<Integer> list) {

        List<Integer> tekrarliList = new ArrayList();
        for (int i = 0; i < list.size(); i++) { //ilk listem
            for (int j = i + 1; j < list.size(); j++) { //diger indexleri karislastiracak
                if (list.get(i) == list.get(j) && !tekrarliList.contains(list.get(i))) {
                    tekrarliList.add(list.get(i));
                }

            }
        }
        System.out.println("tekrarli listenin elemanlari :" + tekrarliList);
    }
}

/*

        Scanner scan = new Scanner(System.in);
        System.out.print("Olusturmak istediginiz listin uzunlugunu giriniz : ");
        int listUzunluk = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("girdiginiz list uzunlugu kadar eleman ekleyiniz ..");

        for (int i = 0; i < listUzunluk; i++){
            list.add(scan.nextInt());
        }

        tekrarliEleman(list);

    }

    private static void tekrarliEleman(List<Integer> ls) {
        List<Integer>tekrarliList = new ArrayList<>();
        for (int i = 0; i < ls.size(); i++){ //ilk listem
            for (int j = i+1; j <ls.size(); j++){ //diger indexleri karislastiracak
                if(ls.get(i) == ls.get(j) && !tekrarliList.contains(ls.get(i))){
                    tekrarliList.add(ls.get(i));
                }
            }
        }
        System.out.println("tekrarli listenin elemanlari :" + tekrarliList);

         */