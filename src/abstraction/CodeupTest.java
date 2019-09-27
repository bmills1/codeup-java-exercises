package abstraction;

public class CodeupTest {
    public static void main(String[] args) {
        //ERROR
//        Employee tim = new Employee();

        Employee[] employees = new Employee[2];
        Employee bob = new Accountant();


        Developer fer = new Developer();
        BackEndDev viv = new BackEndDev();
        bob.setSalary(2);
        fer.setSalary(3);
        System.out.println(fer.debug("bug"));
//        System.out.prin(viv.fixDB());
        employees[0] = bob;
        employees[1] = fer;
        for (Employee employee : employees) {
            System.out.println(employee.work());
            System.out.println("Pay $" + employee.getSalary());

        }
    }
}
