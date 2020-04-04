package com.mycode.shape;

/*1. Define a class Point with a constructor public Point(double x, double y) and
        accessor methods getX, getY. Define a subclass LabeledPoint with a constructor public
        LabeledPoint(String label, double x, double y) and an accessor method getLabel.
 2. Define toString, equals, and hashCode methods for the classes of the preceding
        exercise.
 3. Make the instance variables x and y of the Point class in Exercise 1 protected.
        Show that the LabeledPoint class can access these variables only in LabeledPoint
        instances.
4. Define an abstract class Shape with an instance variable of class Point, a
        constructor, a concrete method public void moveBy(double dx, double dy) that
        moves the point by the given amount, and an abstract method public Point
        getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
        public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
        double height), and public Line(Point from, Point to).
5. Define clone methods for the classes of the preceding exercise.
        */
public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 4);
        Point point2 = new Point(8, 4);

        Shape circle = new Circle(point, 4);
        Shape rectangle = new Rectangle(4, 4, point);
        Shape line = new Line(point, point2);

        System.out.println(circle);
        System.out.println("Center= " + circle.getCenter());
        System.out.println(rectangle);
        System.out.println("Center=" + rectangle.getCenter());
        System.out.println(line);
        System.out.println("Center=" + line.getCenter());

        Point pointWithLabel = new LabeledPoint(1, 2, "Name");
        System.out.println(pointWithLabel);

    }
}
