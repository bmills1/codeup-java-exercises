package abstraction;

abstract class Employee {
    private double salary;
    public abstract String work();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
