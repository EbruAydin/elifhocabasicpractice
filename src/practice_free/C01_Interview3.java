package practice_free;

import java.util.Scanner;

public class C01_Interview3 {
    public static void main(String[] args) {

        /*
Ask user enter a positive number and check if it is prime or not
Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        boolean asalMi = true;

        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) { // bir bolunce asal olmasindan oturu 2 den baslaniyor.
                if (sayi % i == 0 && sayi%i!=0 && sayi%i!=1) {// buna bir daha bakarsin
                    asalMi = false;
                    break;
                }
            }

            if (asalMi)
                System.out.println("sayi asaldir");
            else System.out.println("sayi asal degildir");

        }
    }
}

