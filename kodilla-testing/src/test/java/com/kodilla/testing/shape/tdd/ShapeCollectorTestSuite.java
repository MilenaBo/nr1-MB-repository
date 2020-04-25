package com.kodilla.testing.shape.tdd;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Rectangle;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.ShapeCollector;

import org.junit.*;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test         //test 1
    public void testAddFigure() {
        ShapeCollector shapeCollector1 = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector1.addFigure(circle);
        Assert.assertEquals(circle, shapeCollector1.getFigure(0));
    }

    @Test            //test 2
    public void testRemoveFigure() {
        ShapeCollector shapeCollector1 = new ShapeCollector();
        Circle circle1 = new Circle();
        shapeCollector1.addFigure(circle1);
        Assert.assertEquals(true, shapeCollector1.removeFigure(circle1));
    }

    @Test
    public void testClearFigures() {
        ShapeCollector shapeCollector1 = new ShapeCollector();
       shapeCollector1.clearFigures();
        Assert.assertEquals(true,shapeCollector1.clearFigures());
        //System.out.println("emty : ",shapeCollector1.clearFigures());
    }

    @Test          //test 4
    public void testGetFigure() {

        ShapeCollector shapeCollector1 = new ShapeCollector();
        Square square = new Square();
        shapeCollector1.addFigure(square);

        Rectangle rectangle= new Rectangle();
        shapeCollector1.addFigure(rectangle);

        Circle circle = new Circle();
        shapeCollector1.addFigure(circle);
       Assert.assertEquals(square, shapeCollector1.getFigure(0));
       Assert.assertEquals(rectangle, shapeCollector1.getFigure(1));
       Assert.assertEquals(circle, shapeCollector1.getFigure(2));
    }
}


