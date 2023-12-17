public class rectangle extends Geometry {
    public static Double calculateArea(double width, double height){
            return width * height;
    }

    public static Double calculatePerimeter(double width, double height){
        return width * 2 + height * 2;
    }

    public class square {
        public static Double calculateArea(double side){
            return side * side;
        }
        public static Double calculatePerimeter(double side){
            return side * 4;
        }
    }
}
