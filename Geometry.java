public class Geometry{
/**
 * Finds area of the circle
 * @param radius Radius of the circle
 */
    public static void circleArea(double radius){
        System.out.println("Area of the circle is " + circle.calculateArea(radius));
    }
/**
 * Finds perimeter of the circle
 * @param radius Radius of the circle
 */
    public static void circlePerimeter(double radius){
        System.out.println("Perimeter of the circle is " + circle.calculatePerimeter(radius));
    }
/**
 * Finds area of the rectangle
 * @param width width of the rectangle
 * @param height height of the rectangle 
 */
    public static void rectangleArea(double width, double height){
        System.out.println("Area of the rectangle is " + rectangle.calculateArea(width, height));
    }
/**
 * Finds area of the square
 * @param side Side of the square
 */
    public static void rectangleArea(double side){
        System.out.println("Area of the rectangle is " + rectangle.square.calculateArea(side));
    }
/**
 * Finds perimeter of the rectangle 
 * @param width width of the rectangle
 * @param heightheight of the rectangle
 */
    public static void rectanglePerimeter(double width, double height){
        System.out.println("Perimeter of the square is " + rectangle.calculatePerimeter(width, height));
    }
/**
 * Finds perimeter of the square
 * @param side side of the square
 */
    public static void rectanglePerimeter(double side){
        System.out.println("Perimeter of the square is " + rectangle.square.calculatePerimeter(side));
    }
}