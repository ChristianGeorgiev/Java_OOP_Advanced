package ex2;

import java.util.Iterator;
import java.util.Timer;

public class Library<Book> implements Iterable<T> {
    private Book[] books;

    @Override
    public Iterator<T> iterator() {
        return new LibIterator<T>();
    }


    private final class LibIterator<B> implements Iterator<Book>{
        private int counter = 0;


        public boolean hasNext(){

        }

        public Book next(){

        }
    }
}
