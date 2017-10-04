/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public boolean isPalindrome(String word) {
        // while the word exists as a whole or in shortened versions
        if (word.length() > 1) {
            // creates char array that holds each letter of the word
            char[] array = word.toCharArray();
            // checks if the first char in the array is equal to the last char (the first letter and last of the word)
            if (array[0] == array[word.length() - 1]) {
                // removes the first and last letter of the word
                word = word.substring(1, word.length() - 1);
                // returns word to be deconstructed further
                return isPalindrome(word);

                // if the first letter doesn't equal the last, then the program will return false due to the word not being a palindrome
            } else {
                return false;
            }
        }
        // the whole word has become deconstructed without the program returning false which happens when the word isn't a palindrome
        // therefore the word is a palindrome, therefore return true
        return true;

    }

    public static void main(String[] args) {

        A2Q7 test = new A2Q7();
        System.out.println(test.isPalindrome("hoh"));



    }
}
