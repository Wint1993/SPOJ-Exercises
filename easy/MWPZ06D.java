package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-21.
 */
class MWPZ06D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if (a == 1 || a - 1 > b )
            {
                System.out.println("TAK");
            }
            else {
                if (b%(a-1) > 0)
                {
                    System.out.println("TAK"); }
                else
                {
                    System.out.println("NIE"); }
            }
        }
    }
}
