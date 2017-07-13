package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class SquareEquation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(sc.hasNextDouble()){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double delta = (Math.pow(b,2)-4*a*c);

            if(delta>0){
                System.out.println("2");
            }else if(delta==0){
                System.out.println("1");
            }else{
                System.out.println("0");
            }
        }
    }
}
