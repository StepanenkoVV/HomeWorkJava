import net.sf.saxon.expr.Component.M;

public class Main {
    public static void main(String[] args) {
        GeometryCalculator geometryCalculator = new GeometryCalculator();
       // System.out.println( GeometryCalculator.getCircleSquare(20.2));
      //  System.out.println(GeometryCalculator.getSphereVolume(3));
       // System.out.println(GeometryCalculator.isTrianglePossible(1,3,8));
       // System.out.println(GeometryCalculator.getTriangleSquare(1,3,6));
       // System.out.println(Math.floorDiv(4, 3));
       // System.out.println(GeometryCalculator.getTriangleSquare(2,4,8));
        System.out.println(GeometryCalculator.getCircleSquare(-20));
        System.out.println(GeometryCalculator.getCircleSquare(20));
        System.out.println(GeometryCalculator.getSphereVolume(-20));
        System.out.println(GeometryCalculator.getSphereVolume(20));
        System.out.println(GeometryCalculator.isTrianglePossible(0,0,0));





    }
}
