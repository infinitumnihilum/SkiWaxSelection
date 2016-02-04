package davis.john;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by jrdavis on 2/4/16.
 */
public class Wax {


    public static void main(String[] args) {
        String wc;
        String wt;

        int userTemp;
        String userCond;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the temp you will be skiing at");
        userTemp = scan.nextInt();
        System.out.println("Enter Powder, firm or Crusty for your ski conditions");
        userCond = scan.next();
        SnowSelection SS = new SnowSelection(userCond);
          wt =  SS.conditionSelection();
            if (userTemp > 38 || userTemp <= 5)
                wt = "Standard";
        TempSelection TS = new TempSelection(userTemp);
            wc = TS.tempSelection();

        System.out.println("You need to buy " + wc + " with a " + wt + " type");
    }
}
