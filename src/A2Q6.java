/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    
    // String array holds the A-F values
    private static String letters[] = new String[]{"A", "B", "C", "D", "E", "F"};
    
    
    public static String convert(int n, int b){
        // s value holds the quotent 
        int s = n / b;
        // a value holds the remainder
        int a = n % b;
        // final return value
        if(s == 0) {
          return Integer.toString(a);
          // converts a number above 10 to a letter and string, returns it
        } else if(a >= 10){
            return convert(s, b) + letters[a - 10] ;
        } else{
            // returns quotent with the base case for further deconstruction along with the remainer converted and returned as a string
            return convert(s, b) + Integer.toString(a);
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        
        System.out.println(convert(1000, 16));
        
    }
}
