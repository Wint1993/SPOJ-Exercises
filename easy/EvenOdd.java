package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-14.
 */
class EvenOdd {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input[];
        int n;
        while(t-->0) {
            input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);

            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.print(input[i]+" ");
                }

            }
            for(int i=1;i<=n;i++){
                if(i%2!=0){
                    System.out.print(input[i]+" ");
                }
            }
            System.out.println();
        }
    }

}
