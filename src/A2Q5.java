/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    // 
    public void binaryConvert(int n) {

        // the first binary digit will be 1
        if (n == 1) {
            System.out.print(1);
        } // if the number is odd, return a 1
        else if (n % 2 == 1) {
            binaryConvert(n / 2);
            System.out.print(1);
        } else {
            // if the number is even, return a 0
            binaryConvert(n / 2);
            System.out.print(0);
        }




    }

    public static void main(String[] args) {

        A2Q5 test = new A2Q5();
        // runs the binaryConvert recursive method
        test.binaryConvert(156);
        System.out.println("");


    }
}
