package practice_basic_day04;

import java.util.Arrays;
import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        //EA
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen arrayin uzunlugunu giriniz");
        int length=scan.nextInt();
        int arr [] = new int [length];
        System.out.println("Array'in elemanlarini giriniz ");


        for (int i=0;i < arr.length; i++){
            arr [i]=scan.nextInt();
            if (arr[i]%3==0){
                System.out.print(arr[i] + " ");
            }
        }


    }
}
