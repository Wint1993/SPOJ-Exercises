package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-06.
 */
class SimpleAddition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int numberEquality=0;
        int temp;
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
           numberEquality = sc.nextInt();
           for(int j=0;j<numberEquality;j++){
               temp = sc.nextInt();
               sum +=temp;
           }
            System.out.println(sum);
            sum=0;
        }
    }

}
