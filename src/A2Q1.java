/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public int digitalSum(int n) {

        // if the inputted number is 1 digit, return it as n
        if (10 > n) {
            return n;
        } else {

            // seperates the furthest right digit as "q" and the rest of it as "e"
            int q = n % 10;
            int e = n / 10;

            // e will return as the "n" value and continues to be deconstructed until it's a single digit, all while adding up right digit being broken off
            return digitalSum(e) + q;
        }

    }

    public static void main(String[] args) {

        A2Q1 test = new A2Q1();
        // creates int that uses the digitalSum recursive method
        int awwewewew = test.digitalSum(12345);
        // outputs the answer to the user
        System.out.println(awwewewew);



    }
}
