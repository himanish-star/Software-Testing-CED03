package blackbox.shape;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void computePerimeterForTriangle() {
        ArrayList<Integer> sideLengths = new ArrayList<>();
        sideLengths.addAll(Arrays.asList(5,12,13));

        Shape shape = new Shape(sideLengths);
        assertEquals(30, shape.getPerimeter());
        assertEquals(0, shape.getArea(3,4),1);
    }

    @Test
    public void getSidedInSortedOrderTriangle() {
        ArrayList<Integer> sideLengths = new ArrayList<>();
        sideLengths.addAll(Arrays.asList(12,5,13));

        Triangle triangle = new Triangle(sideLengths);
        assertEquals(Arrays.asList(5,12,13), triangle.getSideLengthsSorted());
    }

    @Test
    public void computePerimeterForRectangle() {
        ArrayList<Integer> sideLengths = new ArrayList<>();
        sideLengths.addAll(Arrays.asList(4,5,4,5));

        Shape shape = new Shape(sideLengths);
        assertEquals(18, shape.getPerimeter());
        assertEquals(0, shape.getArea(3,4),1);
    }

    @Test
    public void computeAreaForTriangle() {
        ArrayList<Integer> sideLengths = new ArrayList<>();
        sideLengths.addAll(Arrays.asList(5,12,13));

        Triangle triangle = new Triangle(sideLengths);
        assertEquals(30, triangle.getPerimeter());
        assertEquals(30, triangle.getArea(5, 12),2);
    }

    @Test
    public void computeAreaForRectangle() {
        ArrayList<Integer> sideLengths = new ArrayList<>();
        sideLengths.addAll(Arrays.asList(4,5,4,5));

        Rectangle rectangle = new Rectangle(sideLengths);
        assertEquals(18, rectangle.getPerimeter());
        assertEquals(20, rectangle.getArea(4, 5),2);
    }

    @Test
    public void getSidedInSortedOrderRectangle() {
        ArrayList<Integer> sideLengths = new ArrayList<>();
        sideLengths.addAll(Arrays.asList(12,5,5,12));

        Rectangle rectangle = new Rectangle(sideLengths);
        assertEquals(Arrays.asList(5,5,12,12), rectangle.getSideLengthsSorted());
    }
}