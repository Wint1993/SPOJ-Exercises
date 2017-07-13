package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class ROL {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
         int n = sc.nextInt();
         int tab[] = new int[n];
         for(int i=0;i<tab.length;i++){
             tab[i] = sc.nextInt();
         }
         int tmp = tab[0];
            for(int i=1;i<tab.length;i++){
                tab[i-1]=tab[i];
            }
            tab[n-1] = tmp;
            for (int i=0;i<tab.length;i++){
                System.out.print(tab[i] + " ");
            }
        }
    }
}
