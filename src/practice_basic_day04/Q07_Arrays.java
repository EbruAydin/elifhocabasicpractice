package practice_basic_day04;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        // EA-internetten buldum cozumu/ hocada varsa sor istersen.

        int arr[][]={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int max=arr[0][0], min=arr[0][0];
        int i,j; // burada bu sekilde yazarsak for icersinde int demeye gerek kalmaz
                // for icersinde int demis isek burada bu sekilde bir int tanimi yapamayiz hata verir/

        for (i = 0; i < arr.length; i++){
            for(j =0; j<arr[i].length;j++){
                if (arr[i][j]>max){
                    max=arr[i][j];
                 if (arr[i][j]<min)
                     min=arr[i][j];
                }
            }
            System.out.println("en buyuk numara " + max);
            System.out.println("en kucuk numara " + min);
            System.out.println();
        }//outher loop



    }
}
