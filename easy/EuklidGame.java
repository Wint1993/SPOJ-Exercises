package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class EuklidGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(a!=b){
                if(a<b){
                    b = b-a;
                }else{
                    a = a-b;
                }
            }
            System.out.println(2*a);
        }
    }
}
