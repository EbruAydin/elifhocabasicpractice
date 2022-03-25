package practice_free;

import java.util.Scanner;

public class C04_Interview4 {
    public static void main(String[] args) {
        //String olan pin kodunuzu kotnrol eden bir kod yaziniz.

        Scanner scan=new Scanner(System.in);
        String pin="said.12345";
        int girisHakki=4;

        System.out.println("*******Hosgeldiniz*****");

        while (true){ // while dongusu dogru olarak calistigi surece asagidaki bloklar calisacak.
            System.out.println("pin kodunuzu giriniz");
            String girilenPin=scan.nextLine();

            if (pin.equals(girilenPin)) {
                System.out.println("basarili giris yaptiniz");
                break;
            } else {
                System.out.println("yanlis giris yaptiniz");
                girisHakki--;
                System.out.println("kalan giris hakkiniz " + girisHakki);
            } if (girisHakki==0){
                System.out.println("giris hakkiniz bitti. kartiniz bloke oldu");
                break;
            }
        }
    }
}
