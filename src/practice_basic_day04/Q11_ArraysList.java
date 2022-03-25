package practice_basic_day04;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q11_ArraysList {


    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.

         */

        // 1. adim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String username=scan.nextLine().trim();

        // 2. adim

        List<String>gecerliIsimler= new ArrayList<>();
        gecerliIsimler.add("Ebru");
        gecerliIsimler.add("Meryem");
        gecerliIsimler.add("Dilek");
        gecerliIsimler.add("Yavuz");
        gecerliIsimler.add("Akif");
        gecerliIsimler.add("Atilay");
        gecerliIsimler.add("Mulkiye");

        // 3. adim

        boolean kullaniciIsmiVarMi=gecerliIsimler.contains(username);

        // 4. adim
        if (kullaniciIsmiVarMi){
            System.out.println("Bu kullanici adi zaten alinmis.");
        } else {
            System.out.println("Bu kullanici adini kullanabilirsiniz.");
        }

        if (kullaniciIsmiVarMi){
            int rastgeleSayi=new Random().nextInt(100000);
            username= username+ ""+ rastgeleSayi;
            System.out.println("Yeni kullanici adi olarak bunu kullanabilirsiniz " + username);
        } else{
            System.out.println("Yeni kullanici adi : " + username);
        }
        scan.close(); // bu kod olmadan da calisiyor ama hedef yeni bir girdi ya da ciktinin olmasini
                        // engellemek.



    }
}
