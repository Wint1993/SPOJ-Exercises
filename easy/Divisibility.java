package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-14.
 */
class Divisibility {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input[];
        int n,x,y;
        while (t-- > 0) {
            input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            x = Integer.parseInt(input[1]);
            y = Integer.parseInt(input[2]);
            for(int i=0;i<n;i++){
                if(i%x==0 && i%y!=0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
