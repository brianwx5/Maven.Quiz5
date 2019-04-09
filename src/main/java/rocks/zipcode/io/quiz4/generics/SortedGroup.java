package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_ extends Comparable> extends Group<_> {
    List<_> arrayList = new ArrayList<>();

    @Override
    public void insert(_ value) {
        arrayList.add(value);
        arrayList = arrayList.stream().sorted((_1,_2) -> _1.compareTo(_2)).collect(Collectors.toList());
    }

    @Override
    public void delete(_ value) {
        arrayList.remove(value);
    }

    public Integer indexOf(_ value) {
        return arrayList.indexOf(value);
    }
}
