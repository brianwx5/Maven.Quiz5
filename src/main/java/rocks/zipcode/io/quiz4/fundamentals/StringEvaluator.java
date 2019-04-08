package rocks.zipcode.io.quiz4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        ArrayList<String> substringList = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j < string.length()+1; j++) {
                if(!substringList.contains(string.substring(i,j)))
                substringList.add(string.substring(i, j));
            }
        } String[] substringArray = substringList.toArray(new String[substringList.size()]);
        return substringArray;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        String[] string1Array = getAllSubstrings(string1);
        String[] string2Array = getAllSubstrings(string2);
        ArrayList<String> commonSubString = new ArrayList<>();
        for (String substring:string1Array) {
            for (int i = 0; i < string2Array.length ; i++) {
                if(substring.equals(string2Array[i])) {
                    commonSubString.add(substring);
                }
            }
        } String[] commonArray = commonSubString.toArray(new String[commonSubString.size()]);
        return commonArray;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonArray = getCommonSubstrings(string1,string2);
        int index = 0;
        int substringLength = commonArray[0].length();
        for (int i = 1; i < commonArray.length ; i++) {
            if(commonArray[i].length() > substringLength) {
                index = i;
                substringLength = commonArray[i].length();
            }
        } return commonArray[index];
    }
}
