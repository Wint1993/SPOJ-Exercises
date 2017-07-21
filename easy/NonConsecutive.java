package łatwe;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-17.
 */
class NonConsecutive {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else if(n==1 || n==2){
            System.out.println("NIE");
        }
        else if(n==3){
            System.out.println(1 +" " +3+" "+0+" "+2);
        }
        else {
            for(int i = 1; i <= n; i = i + 2) {
                System.out.print(i+" ");
            }
            for(int i = 0; i <=n; i = i + 2) {
                System.out.print(i+" ");
            }
        }
    }
}
