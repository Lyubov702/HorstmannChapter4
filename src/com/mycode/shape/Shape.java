package com.mycode.shape;

/*Определите абстрактный класс Shape с переменной экземпляра класса Point;
        конструктором и конкретным методом public void moveBy (double dx, double dy),
        перемещающим точку на заданное расстояние; а также абстрактным классом public Point getCenter().
        Предоставьте конкретные подклассы Circle, Rectangle, Line с конструкторами
        public Circle (Point center, double radius), public Rectangle(Point topLeft, double width, double height)
        и public Line (Point from, Point to).*/

public abstract class Shape {
    protected Point point;
    public Shape(Point point) {
        this.point = point;
    }
    public void moveBy(double dx, double dy){
        point.x+=dx;
        point.y+=dy;
    }
    abstract public Point getCenter();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
