package rocks.zipcode.io.quiz4.generics;

import java.util.Stack;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {
    Stack<_> stack = new Stack<>();

    @Override
    public void insert(_ value) {
        stack.add(value);
    }

    @Override
    public void delete(_ value) {
        stack.remove(value);
    }

    public Integer indexOf(_ value) {
        return stack.indexOf(value);
    }
}
