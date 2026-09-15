package uppg2_1;

public class Employee {

    private String name;
    private int salary;
    private String department;


    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.department = "Unassigned";
    }
    public Employee(Employee employee) {
        this.name = employee.name;
        this.salary = employee.salary;
        this.department = employee.department;
    }


    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }


}
