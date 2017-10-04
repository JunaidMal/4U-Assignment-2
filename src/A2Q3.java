/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public int triangle(int n) {

        // once the recursive method reaches the first row of the triangle, it returns the final value
        if (n == 0) {
            return n;
        }
        // all the blocks in the previous rows of the triangle are added to # of blocks in the longest row
        return triangle(n - 1) + n;


    }

    public static void main(String[] args) {

        A2Q3 test = new A2Q3();
        // creates int that uses the triangle() recursive method
        int awwewewew = test.triangle(2);
        // outputs the answer to the user
        System.out.println("triangle(" + awwewewew + ")");




    }
}
