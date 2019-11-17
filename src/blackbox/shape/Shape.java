package blackbox.shape;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Integer> sideLengths;

    Shape(ArrayList<Integer> sideLengths) {
        this.sideLengths = sideLengths;
    }

    public int getPerimeter() {
        int sum = 0;
        for (Integer sideLength : sideLengths) {
            sum += sideLength;
        }
        return sum;
    }

    public double getArea(int a,int b) {
        return 0;
    };
}

class Triangle extends Shape {
    Triangle(ArrayList<Integer> sideLengths) {
        super(sideLengths);
    }

    public double getArea(int height,int base) {
        return 0.5*base*height;
    }
}

class Rectangle extends Shape {
    Rectangle(ArrayList<Integer> sideLengths) {
        super(sideLengths);
    }

    public double getArea(int length,int width) {
        return length*width;
    }
}
