package ex1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Jar<E> implements JarStack<E>{
    private Deque<E> content;
    public Jar(){
        this.content = new ArrayDeque<E>();
    }


    @Override
    public void add(E element) {
        this.content.push(element);
    }

    @Override
    public E remove() {
        return this.content.pop();
    }
}
