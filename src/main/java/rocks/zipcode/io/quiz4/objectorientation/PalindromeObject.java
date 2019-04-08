package rocks.zipcode.io.quiz4.objectorientation;

import java.util.ArrayList;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeObject {
    private String input;
    public PalindromeObject(String input) {
        this.input = input;
    }

    public String[] getAllPalindromes(){
        ArrayList<String> allPalindromes = new ArrayList<>();
        for (int i = 0; i < input.length() ; i++) {
            for (int j = input.length(); i <j ; j--) {
                if(isPalindrome(input.substring(i,j))) {
                    if(!allPalindromes.contains(input.substring(i,j)))
                        allPalindromes.add(input.substring(i,j));
                }
            }
        }
        String[] palindromeArray = allPalindromes.toArray(new String[allPalindromes.size()]);
        return palindromeArray;
    }

    public Boolean isPalindrome(){
        for (int i = 0; i < input.length()/2 ; i++) {
            if(input.charAt(i) != input.charAt(input.length() -1 -i)) {
                return false;
            }
        } return true;
    }

    public String reverseString(){

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }




    //used for palindrome check
    public Boolean isPalindrome(String string) {
        for (int i = 0; i < string.length()/2 ; i++) {
            if(string.charAt(i) != string.charAt(string.length() -1 -i)) {
                return false;
            }
        } return true;
    }
}
