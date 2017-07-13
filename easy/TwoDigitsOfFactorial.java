package łatwe;

import java.util.Scanner;

class TwoDigitsOfFactorial {

    public static void main(String[] args) {

        TwoDigitsOfFactorial d = new TwoDigitsOfFactorial();
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            d.exercise(sc.nextInt());
        }
    }

    public void exercise(int n){
     int tab[] = {1,1,2,6,24,120,720,5040,40320,362880};
        if(n<10){

            int tmp = tab[n];
            int firstDigit = tmp/10%10;
            int secondDigit = tmp%10;
            System.out.println(firstDigit + " " + secondDigit);
        }else{
            int secondDigit = 0;
            int firstDigit =  0;
            System.out.println(firstDigit + " " + secondDigit);
        }
    }

}
