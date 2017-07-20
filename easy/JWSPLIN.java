package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-20.
 */
class JWSPLIN {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input[];
        int x,y,x1,y1,x2,y2,score;
        while(t-->0){
            score = 0;
            input = br.readLine().trim().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
            x1 = Integer.parseInt(input[2]);
            y1 = Integer.parseInt(input[3]);
            x2 = Integer.parseInt(input[4]);
            y2 = Integer.parseInt(input[5]);
            score = x * y1 + x1 * y2 + y * x2 - y1 * x2 - x * y2 - y * x1;
            if(score==0){
                System.out.println("TAK");
            }else{
                System.out.println("NIE");
            }
        }
    }
}
