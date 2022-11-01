import java.util.ArrayList;
import java.util.List;

public class TopManager implements Employee {
    private int salary =   50000 +   (int) (Math.random() * 10000);
    private Company company;

    public TopManager(Company company){
    this.company = company;
    }

    @Override
    public int getMonthSalary() {
        if (company.getIncome() > 10_000_000)
           return   (int) (salary * 1.5);
        return salary;
    }

}
