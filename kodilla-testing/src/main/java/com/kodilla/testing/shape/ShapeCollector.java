package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public void showFigures() {
        for (Shape shape : figures) {
            System.out.println(shape.getShapeName());
        }
    }

    public boolean clearFigures() {
        figures.clear();
        boolean result = false;
        if (figures.size() == 0) {result=true;         }
        return result;
    }
}