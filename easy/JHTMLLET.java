package łatwe;

import java.util.Scanner;

/**
 * Created by Błażej on 2017-07-21.
 */
class JHTMLLET {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(in.hasNextLine())
        {
            String text = in.nextLine();
            char sign;
            boolean check = false;
            for(int i=0;i<text.length();i++)
            {
                sign = text.charAt(i);
                if(sign == '<')
                {
                    check = true;
                }
                if (sign >= 'a' && 'z' >= sign && check == true)
                {
                    sign = Character.toUpperCase(sign);
                }
                if (sign == '>')
                {
                    check = false;
                }
                System.out.print(sign);
            }
            System.out.println();
        }
        in.close();
    }

}
