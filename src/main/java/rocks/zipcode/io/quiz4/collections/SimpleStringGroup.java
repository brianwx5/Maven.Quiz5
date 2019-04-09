package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable<String> {
    public List<String> arrayList;

    public SimpleStringGroup() {
        arrayList = new ArrayList<>();
    }

    public Integer count() {
        return arrayList.size();
    }

    public void insert(String string) {
        arrayList.add(string);
    }

    public Boolean has(String string) {
        if(arrayList.contains(string)) {
            return true;
        }
        return false;
    }

    public String fetch(int indexOfValue) {
        return arrayList.get(indexOfValue);
    }

    public void delete(String string) {
        arrayList.remove(string);
    }

    public void clear() {
        arrayList.clear();

    }


    @Override
    public Iterator iterator() {
        return arrayList.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        for (String string: arrayList) {
           action.accept(string);
        }
    }


}
