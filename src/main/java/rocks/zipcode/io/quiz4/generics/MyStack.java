package rocks.zipcode.io.quiz4.generics;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Stack;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class MyStack<SomeType> implements Iterable<SomeType> {
    Stack<SomeType> stack;
    public MyStack() {
        this.stack = new Stack<>();
    }

    public Boolean isEmpty() {
        return stack.empty();
    }

    public void push(SomeType i) {
        stack.push(i);
    }

    public SomeType peek() {
        if(isEmpty()) {
            return null;
        } else {
            return stack.peek();
        }
    }

    public SomeType pop() {
        if(stack.pop() == null ||stack.peek() == null) {
            return null;
        }
        SomeType remove = stack.pop();
        stack.pop();
        return remove;
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super SomeType> action) {
        for (SomeType string: stack) {
            action.accept(string);
        }
    }

    @Override
    public Spliterator<SomeType> spliterator() {
        return null;
    }

}
