package main.java.P05_Square;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SquareTests {

    private static final int DEFAULT_SQUARE_SIDE = 5;
    private static final int DEFAULT_SQUARE_AREA = 25;

    private Rectangle square;

    @Before
    public void initialize(){
        this.square = new Square(DEFAULT_SQUARE_SIDE);
    }

    @Test
    public void testSquareSide(){
        Assert.assertEquals(DEFAULT_SQUARE_SIDE, this.square.getHeight());
        Assert.assertEquals(DEFAULT_SQUARE_SIDE, this.square.getWidth());
    }

    @Test
    public void testSquareArea(){
        Assert.assertEquals(DEFAULT_SQUARE_AREA, this.square.getArea());
    }
}
