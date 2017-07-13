package łatwe;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-13.
 */
class LinearEquation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        b -= c;
        if (a == 0 && b == 0) {
            System.out.println("NWR");
        } else if (a == 0 && b != 0) {
            System.out.println("BR");
        } else {
            System.out.println(String.format("%.2f", -b / a));
        }
    }
}
