public class Manager implements Employee {
    private int salary = 45000 +  (int) (Math.random() * 7_500);
    private int sales;

    public int getSales() {
        return sales;
    }

    public Manager(){
        sales = (int) (Math.random() * (140000 - 115000) + 1150000);
        salary += sales * 0.05;
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }

}
