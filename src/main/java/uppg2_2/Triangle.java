package uppg2_2;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Triangle(Triangle t) {
        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;
    }

    public double getSideA() {
        return sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    //--------------------------------------------------------------
    public boolean isValidTriangle(Triangle t) {
        return (t.sideA + t.sideB > t.sideC) &&
                (t.sideA + t.sideC > t.sideB) &&
                (t.sideB + t.sideC > t.sideA);
    }
    public double perimeter(Triangle t) {
        return t.sideA + t.sideB + t.sideC;
    }
    public String triangleType(Triangle t) {
        String result;
        double a = t.sideA;
        double b = t.sideB;
        double c = t.sideC;

        if (a == b && b == c)
            result = "Equilateral Triangle";
        else if (a == b || a == c || b == c)
            result = "Isosceles Triangle";
        else
            result = "Scalene Triangle";
        return result;
        //--------------------------------------------------------------
    }

    public static Triangle copyOf(Triangle orig) {
        return new Triangle(orig);
    }
}
