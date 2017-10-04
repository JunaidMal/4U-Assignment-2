/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public int digitalRoot(int n) {

        // if the inputted number is 1 digit, return it as n
        if (10 > n) {
            return n;
        } else {

            // seperates the furthest right digit as "q" and the rest of it as "e"
            int q = n % 10;
            int e = n / 10;

            // adds the furthest right digit to the rest of the number every time until only a single digit is left
            return digitalRoot(e + q);

        }
    }

    public static void main(String[] args) {

        A2Q2 test = new A2Q2();
        // creates int that uses the digitalSum recursive method
        int awwewewew = test.digitalRoot(276);
        // outputs the answer to the user
        System.out.println(awwewewew);
    }
}
