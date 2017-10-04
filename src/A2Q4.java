/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public void hailStone(int n) {

        // this prints the number every time the method repeats
        System.out.println(n);

        // returns the number 1 and ends the recursive method when n becomes 1
        if (n == 1) {
            // if n is an odd number, then it will be multiplied by 3 and added to 1
        } else if (n % 2 == 1) {
            hailStone(3 * n + 1);
        } // if n is an even number, it's divided by 2
        else {
            hailStone(n / 2);

        }


    }

    public static void main(String[] args) {
        A2Q4 test = new A2Q4();
        // runs the hailStone method
        test.hailStone(5);
    }
}
