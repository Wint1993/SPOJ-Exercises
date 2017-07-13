package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-12.
 */
class Half {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in;
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0){
           in = sc.nextLine();
           System.out.println(in.substring(0,(in.length()+1)/2));
        }
    }
}
