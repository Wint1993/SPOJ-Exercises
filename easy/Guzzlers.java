package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-11.
 */
class Guzzlers {

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int n = Integer.parseInt(sc.nextLine());
        while(n-->0){
            a = (sc.nextInt());
            b = (sc.nextInt());
            double cakeQuality = 0;
            while(a-->0){
                cakeQuality += 86400/(sc.nextInt());
            }
            System.out.println((int)Math.ceil((cakeQuality)/b));
        }
    }
}
