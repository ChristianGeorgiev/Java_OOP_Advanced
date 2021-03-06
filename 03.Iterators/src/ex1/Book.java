package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    private void setAuthors(String... authors) {
        this.authors = new ArrayList<>();
        Collections.addAll(this.authors, authors);
    }

    public List<String> getAuthors() {
        return Collections.unmodifiableList(this.authors);
    }
}
