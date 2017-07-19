package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-19.
 */
class CollatzProblem {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int s,n;
        while(t-->0) {
            n = 0;
            s = Integer.parseInt(br.readLine());
            while ( s != 1 ) {
                if (s % 2 == 1) { //jezeli s jest nieparzyste
                    s *= 3;
                    s += 1;
                } else {
                    s /= 2;
                }
                ++n;
            }
            System.out.println(n);
        }
    }
}
