package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

import java.util.ArrayList;

/**
 * @author leon on 19/12/2018.
 */
public class StringEvaluatorObject {
    public String str;


    public StringEvaluatorObject(String str) {
        this.str = str;
    }

    public String[] getAllSubstrings() {
        ArrayList<String> substringList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length()+1; j++) {
                if(!substringList.contains(str.substring(i,j)))
                    substringList.add(str.substring(i, j));
            }
        } String[] substringArray = substringList.toArray(new String[substringList.size()]);
        return substringArray;
    }

    public String[] getCommonSubstrings(String secondInput) {
        String[] firstinput = getAllSubstrings();
        ArrayList<String> substringList = new ArrayList<>();
        for (int i = 0; i < secondInput.length(); i++) {
            for (int j = i + 1; j < secondInput.length()+1; j++) {
                if(!substringList.contains(secondInput.substring(i,j)))
                    substringList.add(secondInput.substring(i, j));
            }
        } String[] secondInputs = substringList.toArray(new String[substringList.size()]);

        ArrayList<String> commonSubString = new ArrayList<>();
        for (String substring:firstinput) {
            for (int i = 0; i < secondInputs.length ; i++) {
                if(substring.equals(secondInputs[i])) {
                    commonSubString.add(substring);
                }
            }
        } String[] commonArray = commonSubString.toArray(new String[commonSubString.size()]);
        return commonArray;

    }

    public String getLargestCommonSubstring(String secondInput) {
        String[] commonArray = getCommonSubstrings(secondInput);

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
