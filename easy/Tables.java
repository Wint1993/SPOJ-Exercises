package łatwe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-10.
 */
class Tables {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            int[] tab = new int[a];
            for(int j=0;j<a;j++)
            {
                int k = sc.nextInt();
                tab[j] = k;
            }
            for(int l=tab.length-1; l>=0; l--)
            {
                System.out.print(tab[l] + " ");
            }
            System.out.println();

        }

    }



}
