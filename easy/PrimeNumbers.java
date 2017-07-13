package łatwe;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-06.
 */
class PrimeNumbers {

    public static void main(String[] args) throws IOException {

           PrimeNumbers flam = new PrimeNumbers();
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           for (int i = 0; i < n; i++) {
               flam.exercise(sc.nextInt());
           }
    }

    public void exercise(int n){
     int temp=0;
     if(n<=1){
         System.out.println("NIE");
     }else{
         for(int i=1;i<=n;i++){
             if(n%i==0){
                 temp++;
             }
         }
         if(temp==2){
             System.out.println("TAK");
         }else{
             System.out.println("NIE");
         }
     }
    }
}
