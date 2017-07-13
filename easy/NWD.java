package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-10.
 */
 class NWD {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
           a = sc.nextInt();
           b = sc.nextInt();
           while(a!=b){
               if(a > b){
                   a-=b;
               }else{
                   b-=a;
               }
           }
            System.out.println(a);
        }
    }
}
