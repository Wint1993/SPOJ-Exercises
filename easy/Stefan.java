package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-21.
 */
public class Stefan {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []tab = new int[t];
        for(int i=0;i<tab.length;i++){
            tab[i] = sc.nextInt();
        }
        int tmp=0;
        for(int i=0;i<tab.length-1;i++){

            if(tab[i]>0 && tab[i+1]>0){
                tmp+=tab[i];
                tmp+=tab[i+1];

            }
        } System.out.println(tmp);
    }
}
