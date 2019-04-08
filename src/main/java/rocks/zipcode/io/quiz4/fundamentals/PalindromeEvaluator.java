package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        ArrayList<String> allPalindromes = new ArrayList<>();
        for (int i = 0; i < string.length() ; i++) {
            for (int j = string.length(); i <j ; j--) {
                if(isPalindrome(string.substring(i,j))) {
                    if(!allPalindromes.contains(string.substring(i,j)))
                    allPalindromes.add(string.substring(i,j));
                }
            }
        }
        String[] palindromeArray = allPalindromes.toArray(new String[allPalindromes.size()]);
        return palindromeArray;
    }

    public static Boolean isPalindrome(String string) {
        for (int i = 0; i < string.length()/2 ; i++) {
            if(string.charAt(i) != string.charAt(string.length() -1 -i)) {
                return false;
            }
        } return true;
    }

    public static String reverseString(String string) {

        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();

    }
}
