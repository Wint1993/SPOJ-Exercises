package łatwe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Błażej on 2017-07-18.
 */
class MaternitySpecialist {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String input[];
        int x,y,z;
        while(t-->0) {
            input = br.readLine().split(" ");
            x = Integer.parseInt(input[0]);
            y = Integer.parseInt(input[1]);
            z = Integer.parseInt(input[2]);

            System.out.println(Math.round(12*(y-x/(z-1.))));
        }
    }

}
