package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-14.
 */
class ROLk {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] str = line.trim().split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        String input[];
        input = br.readLine().split(" ");
       for(int i=n-(n-k);i<n;i++){
           System.out.print(input[i]+ " ");
       }
       for(int i=0;i<n-(n-k);i++){
           System.out.print(input[i]+ " ");
       }
    }
}
