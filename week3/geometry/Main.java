package week3.geometry;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        System.out.println("Point 1: " + p1.getX() + ", " + p1.getY());
        System.out.println("Point 2: " + p2.getX() + ", " + p2.getY());

        System.out.println("Distance: " + p1.distance(p2));

        Segment s = new Segment(p1, p2);

        System.out.println("Length: " + s.length());
        System.out.println("Slope: " + s.getSlope());
        System.out.println("Intercept: " + s.getIntercept());

        Point p3 = new Point(2.5f, 4);
        System.out.println("On line: " + s.isOnLine(p3));
        System.out.println("On segment: " + s.isOnSegment(p3));

        s.translate(1, 1);
        System.out.println("New P1: " + p1.getX() + ", " + p1.getY());
    }
}
