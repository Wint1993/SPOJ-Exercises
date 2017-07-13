package łatwe;

import java.io.IOException;
import java.util.Scanner;


/**
 * Created by Błażej on 2017-07-12.
 */
class Calculator {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            switch (line){
                case "+":
                    System.out.println(a+b);
                    break;
                case "-":
                    System.out.println(a-b);
                    break;
                case "*":
                    System.out.println(a*b);
                    break;
                case "/":
                    System.out.println(a/b);
                    break;
                case "%":
                    System.out.println(a%b);
                    break;

            }
        }
    }
}
