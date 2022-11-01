import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        List<Employee> managerList = new ArrayList<>();


        for (int i = 0; i < 180; i++) {
            company.hire(new Operator());
        }
        for (int i = 0; i < 80; i++) {
            managerList.add(new Manager());
        }
        for (int i = 0; i < 10; i++) {
            managerList.add(new TopManager(company));
        }
        company.hireAll(managerList);

        printEmployes(company);
        System.out.println("--------------------------- ");
        List<Employee> employees = company.getEmployes();
        System.out.println(employees.size());
        for (int i =0; i < 135; i ++){
            company.fire(employees.get(i));
        }
        System.out.println(company.getEmployes().size());



    }

    private static void printEmployes(Company company) {
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        for (Employee employee : topSalaryStaff) {
            System.out.println(employee.getMonthSalary());
        }
        System.out.println("--------------------------- ");

        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(80);
        for (Employee employee : lowSalaryStaff) {
            System.out.println(employee.getMonthSalary());
        }
    }

}
