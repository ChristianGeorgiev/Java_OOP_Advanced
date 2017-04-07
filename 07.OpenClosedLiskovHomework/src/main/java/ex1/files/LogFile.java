package main.java.ex1.files;

import main.java.ex1.contracts.File;

public class LogFile implements File {
    private StringBuilder sb;
    private int size;

    public LogFile(){
        this.sb = new StringBuilder();
        this.size = this.sb.length();
    }

    public int getSize(){
        return this.size;
    }

    @Override
    public void write(String message) {
        this.sb.append(message).append(System.lineSeparator());
        this.size = this.sb.length();
    }
}
