package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @author leon on 11/12/2018.
 */
public class ComparableTreeSet<_> extends TreeSet implements Comparable {
    _[] treeSet;
    public ComparableTreeSet(_... arr) {
        this.treeSet = arr;
    }


    public ComparableTreeSet() {

    }

    public int compareTo(ComparableTreeSet<_> o) {
        return this.compareTo(o);
    }

    @Override
    public int compareTo(Object o) {
        return this.compareTo(o);
    }



}
