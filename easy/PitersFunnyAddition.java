package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-10.
 */
class PitersFunnyAddition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberInput;
        int reverseNumberInput;
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int counter =0;
            numberInput=sc.nextInt();
           reverseNumberInput = reverse(numberInput);
           if(numberInput==reverseNumberInput){
               numberInput=reverseNumberInput;
           } else while(numberInput!=reverseNumberInput){
               numberInput+=reverseNumberInput;
               reverseNumberInput=reverse(numberInput);
               counter++;
           }
            System.out.println(numberInput+ " " + counter);
        }
    }
    public static int reverse(int a){
        int reverse = 0;
        while(a != 0){
            reverse = reverse*10;
            reverse = reverse + a%10;
            a = a/10;
        }
        return reverse;
    }
}
