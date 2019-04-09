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
        return StringEvaluator.getAllSubstrings(str);
    }

    public String[] getCommonSubstrings(String secondInput) {
        return StringEvaluator.getCommonSubstrings(str,secondInput);

    }

    public String getLargestCommonSubstring(String secondInput) {
        return StringEvaluator.getLargestCommonSubstring(str, secondInput);
    }
}
