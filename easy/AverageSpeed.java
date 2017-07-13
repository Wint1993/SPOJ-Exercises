package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-13.
 */
class AverageSpeed {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a,b;
        String input[];
        while(t-->0){
           input = br.readLine().split(" ");
           a = Integer.parseInt(input[0]);
           b = Integer.parseInt(input[1]);
           System.out.println((2*(a*b))/(b+a));
        }
    }
}
