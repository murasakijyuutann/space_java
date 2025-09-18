package Shape;

import java.util.ArrayList;

public class ShapeDemo {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());
        shapes.add(new Square());
        shapes.add(new Pentagon());
        shapes.add(new Octagon());
        shapes.add(new Hexagon());
        
        lineSeparator();
        for (Shape shape : shapes) {
            shape.draw();
        }
        lineSeparator();
    }

    public static void lineSeparator(){
        System.out.println("-------------------------------------------------------------------");
    }
}
