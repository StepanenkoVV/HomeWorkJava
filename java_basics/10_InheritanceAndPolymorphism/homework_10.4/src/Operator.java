public class Operator implements Employee {
    private final int salary =  35000 + (int) (Math.random() * 5000);

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
