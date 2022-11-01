import net.sf.saxon.expr.Component.M;

public class GeometryCalculator {

  //public double radius;

  // метод должен использовать абсолютное значение radius
  public static double getCircleSquare(double radius) {
    return Math.PI * Math.pow(Math.abs(radius), 2);
  }

  // метод должен использовать абсолютное значение radius
  public static double getSphereVolume(double radius) {
    double a = 4;
    int b = 3;
    double c = a / b;
    return (c * Math.PI * Math.pow(Math.abs(radius), 3));
  }

  public static boolean isTrianglePossible(double a, double b, double c) {
    if (a + b > c && a + c > b && b + c > a) {
      {
        return true;
      }
    }
    return false;
  }


  // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
  // методом isTrianglePossible, если невозможен вернуть -1.0
  public static double getTriangleSquare(double a, double b, double c) {
    double p = (a + b + c) / 2; // полупериметр
    if (!isTrianglePossible(a, b, c)) {
      return -1;
    } else {
      return (Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
  }

}
