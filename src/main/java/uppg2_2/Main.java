package uppg2_2;

public class Main {
    static void main() {

        Triangle t1 = new Triangle(10, 15, 20);
        Triangle t2 = new Triangle(t1);

        t1.setSideA(66);

        System.out.println(t2.getSideA());
    }
}
