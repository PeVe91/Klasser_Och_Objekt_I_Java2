package uppg2_1;

public class Main {
    static void main() {


        Employee per = new Employee("Per", 27500, "IT");
        Employee carl = new Employee("Carl", 60000);
        Employee charlie = new Employee(per);

        System.out.println(per.getName() + " " + per.getSalary() + " " + per.getDepartment());
        System.out.println(carl.getName() + " " + carl.getSalary() + " " + carl.getDepartment());
        System.out.println(charlie.getName() + " " + charlie.getSalary() + " " + charlie.getDepartment());

    }
}
