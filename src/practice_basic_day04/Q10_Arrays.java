package practice_basic_day04;

import java.util.Arrays;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */

        //EA
        //split() metodunu onceden yapip ardindan replaceAll yapinca hata verdi.
        // oncesinden replaceAll, ardindan split demek gerekiyor.
        String s="Hava ayaz mi?";
        String arr[]=s.replaceAll("\\s", "").split("");
        System.out.println(Arrays.toString(arr));

        System.out.println(arr.length);

        }

    }

