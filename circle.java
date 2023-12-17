import java.lang.Math;

public class circle extends Geometry {
    public static Double calculateArea(Double r){
            return Math.PI * Math.pow(r, 2.0);
    }

    public static Double calculatePerimeter(Double r){
        return 2.0 * Math.PI * r;
    }
}
