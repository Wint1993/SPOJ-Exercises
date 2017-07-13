package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class Pesel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        String[] tab;
        int wynik = 0;
        while(t-->0){
            tab = sc.nextLine().split("");
            wynik = Integer.parseInt(tab[0])+3*Integer.parseInt(tab[1])+7*Integer.parseInt(tab[2])+9*Integer.parseInt(tab[3])+
                    Integer.parseInt(tab[4])+3*Integer.parseInt(tab[5])+7*Integer.parseInt(tab[6])+9*Integer.parseInt(tab[7])
                    +Integer.parseInt(tab[8])+3*Integer.parseInt(tab[9])+Integer.parseInt(tab[10]);
            if(wynik%10==0){
                System.out.println("D");
            }else{
                System.out.println("N");
            }
        }
    }

}
