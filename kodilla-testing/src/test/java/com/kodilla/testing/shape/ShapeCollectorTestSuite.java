package com.kodilla.testing.shape;

        import org.junit.*;

        import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    //Test suite for classes of Forum

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

    @Test
    public void testAddShape() {
        // Given

        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 5.18);
        // When
        shapeCollector.addShape(circle);
        // Then
        Assert.assertEquals(1, shapeCollector.getShapes().size());
    }

    @Test
    public void testRemoveShape() {
        // Givem
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle("Circle", 5.18);
        shapeCollector.addShape(circle);
        // When
        boolean result = shapeCollector.removeShape(circle);
        int listSize = shapeCollector.getShapes().size();
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, listSize);
    }
    @Test
    public void testTakeShape() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("Triangle", 78.4);
        // When
        shapeCollector.addShape(triangle);
        //Then
        Assert.assertEquals(triangle, shapeCollector.getShape(0));
    }
}