package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-20.
 */
public class NewPlot {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n;
        while(t-->0){
            n = Integer.parseInt(br.readLine());
            System.out.println((int)Math.pow(n,2));
        }
    }
}
