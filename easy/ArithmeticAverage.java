package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Błażej on 2017-07-13.
 */
class ArithmeticAverage {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input[];
        float average=0;
        int n;
        while(t-->0) {
            input = br.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            for(int i=1;i<=n;i++){
                average+=Integer.parseInt(input[i]);

            }
            average /=n;
            float tab[] = new float[n];
            for(int j=1;j<=n;j++){
                tab[j-1] = Math.abs(Integer.parseInt(input[j])-average);
            }
            int z=0;
            for(int i=n;i>0;i--){
                if(tab[n-1]>=tab[i-1]){
                    tab[n-1]= tab[i-1];
                    z=i;
                }
            }
            System.out.println(input[z]);
            average =0 ;
        }
    }

}
