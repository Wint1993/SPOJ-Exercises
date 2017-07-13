package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            sum+=a;
            System.out.println(sum);
        }
    }
}
