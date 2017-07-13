package łatwe;


import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class Table {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        String tab[] = d.split(" ");
        for(int i=tab.length-1;i>=0;i--){
            System.out.print(tab[i] + " ");
        }
    }
}
