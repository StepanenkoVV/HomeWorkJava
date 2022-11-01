import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company {


    private List<Employee> employes = new ArrayList();

    public List<Employee> getEmployes() {
        return new ArrayList<>(employes);
    }


    public void hire(Employee employee) { //найм 1 сотрудника
        employes.add(employee);

    }
    public void hireAll(List<Employee> employees){ //найм списка сотрудников
       for (Employee e: employees){
           hire(e);
       }
    }

    public void fire(Employee employee){ //увольнение сотрудника
        employes.remove(employee);
    }


    public int getIncome(){
       int income = 0;
        for (Employee e: employes){
            if (e instanceof Manager){
              income += ((Manager) e).getSales();
            }

        }
        return income;
    }


    public List<Employee> getTopSalaryStaff(int count){
        Collections.sort(employes);
        Collections.reverse(employes);
       return employes.subList(0, count);


    }

    public List<Employee> getLowestSalaryStaff(int count){
        Collections.sort(employes);

        return employes.subList(0, count);
    }




}
