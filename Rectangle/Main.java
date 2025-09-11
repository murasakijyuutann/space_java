package Rectangle;

import java.util.LinkedList;

public class Main {

    LinkedList<RectangleRadius> rectangles = new LinkedList<>();

    public static void printRectangleInfo(LinkedList<RectangleRadius> rectangles) {
        System.out.printf("%-10s | %-10s | %-10s | %-10s%n", "Length", "Width", "Area", "Perimeter");
        System.out.println("-----------------------------------------------------");
        for (RectangleRadius rectangle : rectangles) {
            System.out.printf("%-10.2f | %-10.2f | %-10.2f | %-10.2f%n",
                    rectangle.getLength(),
                    rectangle.getWidth(),
                    rectangle.getArea(),
                    rectangle.getPerimeter());
        }
    }
    public static void main(String[] args) {
        LinkedList<RectangleRadius> rectangles = new LinkedList<>();
        rectangles.add(new RectangleRadius(5.0, 10.0));
        rectangles.add(new RectangleRadius(3.5, 7.2));
        rectangles.add(new RectangleRadius(8.0, 4.0));

        printRectangleInfo(rectangles);
    }
    
}
