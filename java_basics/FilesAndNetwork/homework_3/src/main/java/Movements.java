import au.com.bytecode.opencsv.CSVReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Movements {

    private String pathMovementsCsv;
    private List<FinanceInformation> financeOperations;

    public Movements(String pathMovementsCsv) {
        this.pathMovementsCsv = pathMovementsCsv;
        calculateDate();

    }

    public String getInfoAboutExpenseAndIncome() {
        String information = "\nСумма расходов: " + getSumExpense() + "\n" + "Сумма доходов: " + getIncomeSum();

        return information;
    }

    public double getSumExpense() {
        return financeOperations.stream().mapToDouble(FinanceInformation::getExpense).sum();
    }

    public double getIncomeSum() {
        return financeOperations.stream().mapToDouble(FinanceInformation::getIncome).sum();

    }

    public void getAmountsOfExpensesByOrganizations() {
        Map<String, Integer> testMap = new TreeMap<>();

        financeOperations.stream()
                .forEach(e ->
                {
                    putToMap(testMap, e.getOperationDescription(), (int) e.getExpense());
                });
        System.out.println("Суммы расходов по организациям: ");
        testMap.forEach((key, value) -> System.out.printf("%n%s %d руб. %n ", key, value));


    }

    public void calculateDate() {

        try (CSVReader csvReader = new CSVReader(new BufferedReader(new FileReader(pathMovementsCsv)), ',', '"', 1)) {

            String[] nextLine;
            financeOperations = new ArrayList<>();
            while ((nextLine = csvReader.readNext()) != null) {
                financeOperations.add(new FinanceInformation(nextLine[0], nextLine[1], nextLine[2], nextLine[3], nextLine[4],
                        stringOperationDescFormat(nextLine[5]),
                        Double.parseDouble(nextLine[6].replaceAll("\"", "").replace(',', '.')),
                        Double.parseDouble(nextLine[7].replaceAll("\"", "").replace(',', '.'))));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void putToMap(Map<String, Integer> mapWhereWeWantToPutCount,
                                 String key,
                                 Integer value) {
        if (mapWhereWeWantToPutCount.containsKey(key)) {
            Integer oldCount = mapWhereWeWantToPutCount.get(key);
            mapWhereWeWantToPutCount.put(key, oldCount + value);
        } else {
            mapWhereWeWantToPutCount.put(key, value);
        }
    }

    private static String stringOperationDescFormat(String text)  //метод формотирвоания строки, описание организации
    {
        return text.substring(text.indexOf(" "), text.indexOf("        "))
                .replaceAll("([<>/])", " ")
                .replaceAll(" ", "").strip()
                .replaceAll("^[0-9]{0,9}", "").strip();
    }
}

