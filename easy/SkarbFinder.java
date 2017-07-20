package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-20.
 */
class SkarbFinder {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, a, b, vertical, horizon, counter = Integer.parseInt(reader.readLine());
        String input[];

        while (counter-->0) {
            n = Integer.parseInt(reader.readLine());
            vertical = 0;
            horizon = 0;

            while (n-->0) {
                input = reader.readLine().split(" ");
                a  = Integer.parseInt(input[0]);
                b  = Integer.parseInt(input[1]);
                if(a==0){
                    vertical+=b;
                }
                else if(a==1){
                    vertical-=b;
                }
                else if(a==2){
                    horizon-=b;
                }
                else if(a==3){
                    horizon+=b;
                }
            }
            if (horizon == 0 && vertical == 0) {
                System.out.println("studnia");
            } else {
                if (vertical > 0) {
                    System.out.println("0 " + vertical);
                } else if (vertical < 0) {
                    System.out.println("1 " + Math.abs(vertical));
                }
                if (horizon > 0) {
                    System.out.println("3 " + horizon);
                } else if (horizon < 0) {
                    System.out.println("2 " + Math.abs(horizon));
                }
            }
        }
    }
}
