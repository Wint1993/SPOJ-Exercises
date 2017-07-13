package łatwe;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-10.
 */
class WheelField {

    public static void main(String[] args) {
        Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        Locale.setDefault(bLocale);
        Scanner sc = new Scanner(System.in);
        double r  = sc.nextInt();
        double d = sc.nextInt();
        d = d/2;
        double pole = Math.sqrt(Math.pow(r, 2) - Math.pow(d, 2));
        pole = 3.141592654 * Math.pow(pole, 2);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        String s = nf.format(pole);
        System.out.println(s);
        sc.close();
    }
}
