import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Daniel Cox on 10/13/2016.
 */
public class NumericBaseChange {
    public static void main(String[] args) {
        /**
         * This algorithm works based on an input where the first line is the number of lines to follow
         * and every line after that is 3 numbers where the first number is the base of the 3rd and the
         * 2nd number is the base you want to change to.
         * ie.
         * 1
         * 16 10 11
         * 11 is written in base 16 and we want 11 base 16 written in base 10.
         */
        Scanner s = new Scanner(System.in);
        int numLines = Integer.parseInt(s.nextLine());
        for(int i =0; i < numLines; i++){
            String[] x = s.nextLine().split(" ");
            BigInteger newnum = new BigInteger(x[2], Integer.parseInt(x[0]));
            String num = newnum.toString(Integer.parseInt(x[1])).toUpperCase();
            System.out.println(num);
        }
    }

}
