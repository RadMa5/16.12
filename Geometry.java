public class Geometry{
    // private Double area;
    // private Double perimeter;
    // private Double length;
    // private Double width;
    // private Double radius;

    public void circleArea(double radius){
        System.out.println("Area of the circle is " + circle.calculateArea(radius));
    }
    public void circlePerimeter(double radius){
        System.out.println("Perimeter of the circle is " + circle.calculatePerimeter(radius));
    }

    public void rectangleArea(double width, double height){
        System.out.println("Area of the rectangle is " + rectangle.calculateArea(width, height));
    }
    public void rectanglePerimeter(double width, double height){
        System.out.println("Perimeter of the rectangle is " + rectangle.calculatePerimeter(width, height));
    }
}