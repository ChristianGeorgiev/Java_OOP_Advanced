package main.java.P05_Square;

public class Rectangle {
    private int m_width;
    private int m_height;

    protected void setWidth(int width) {
        this.m_width = width;
    }

    protected void setHeight(int height) {
        this.m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}
