public class Main {

    public static void main(String[] args)  {

        String path = "/Users/vitalijstepanenko/Desktop/movementList.csv";


        Movements movements = new Movements(path);
        System.out.println("-----------------------");
        movements.calculateDate();

        System.out.println("-----------------------");

        movements.getAmountsOfExpensesByOrganizations();

        System.out.println("-----------------------");

        System.out.println(movements.getInfoAboutExpenseAndIncome());


    }
}
