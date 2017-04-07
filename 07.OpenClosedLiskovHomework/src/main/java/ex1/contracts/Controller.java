package main.java.ex1.contracts;

import java.io.IOException;
import java.io.Reader;

public interface Controller {
    void readInput() throws IOException;
    Appender[] getAppenders();
}
