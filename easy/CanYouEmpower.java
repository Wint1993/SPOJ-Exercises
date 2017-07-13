package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-05.
 */
public class CanYouEmpower {
    public static void main(String[] args) {

        CanYouEmpower obj = new CanYouEmpower();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            obj.exercise(scanner.nextInt(),scanner.nextInt());
        }
    }

    public void exercise(int a, int b){
        int tab[][] = {
                {0,0,0,0},
                {1,1,1,1},
                {6,2,4,8},
                {1,3,9,7},
                {6,4,6,4},
                {5,5,5,5},
                {6,6,6,6},
                {1,7,9,3},
                {6,8,4,2},
                {1,9,1,9}
        };
        System.out.println(tab[a%10][b%4]);
    }
}
