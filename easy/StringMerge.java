package łatwe;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-11.
 */
class StringMerge {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, counter = Integer.parseInt(sc.nextLine());
        String[] values;
        String output;

        while (counter-->0) {
            values = sc.nextLine().split(" ");
            output = "";
            j = values[0].length() <= values[1].length() ? values[0].length() : values[1].length();
            for (i = 0; i < j; ++i) {
                output += values[0].charAt(i) + "" + values[1].charAt(i);
            }
            System.out.println(output.trim());
        }
    }

}
