import org.apache.commons.collections.ArrayStack;

import java.util.*;

public class CoolNumbers {
    public static final String LETTERS = "АВЕКМНОРСТУХ";
    public static final String CAR_NUMBER_REGEX =
            String.format("^[%s]\\d{3}[%s]{2}\\d{2,3}$", LETTERS, LETTERS);

    public static List<String> generateCoolNumbers() {
        Random random = new Random();
        final String[] letters = new String[]{"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        final String[] numbers = new String[]{"111", "222", "333", "444", "555", "666", "777", "888", "999",
                "001", "002", "003", "004", "005", "006", "007", "008", "009"};
        final int[] regions = new int[200];
        HashSet<String> setNumber = new HashSet<>();
        for (String s :letters) {
            for (int j = 0; j < numbers.length; j++) {
                for (int b = 0; b < letters.length; b++) {
                    for (int z = 0; z < letters.length; z++) {
                        for (int k = 1; k < regions.length; k++) {
                            int randomRegions = random.nextInt(k);
                            String region = String.valueOf(randomRegions);
                            if (k < 10) {
                                region = "0" + region;
                            }
                            int randomIndex = random.nextInt(letters.length);
                            String letter = letters[randomIndex];
                            //
                            int randomIndexTwo = random.nextInt(numbers.length);
                            String number2 = numbers[randomIndexTwo];
                            //
                            int randomIndex2 = random.nextInt(letters.length);
                            String letter2 = letters[randomIndex2];
                            //
                            int randomIndex3 = random.nextInt(letters.length);
                            String letter3 = letters[randomIndex3];


                            String number = String.format("%s%s%s%s%s", letter, number2, letter2, letter3, region);
                            if (number.matches(CAR_NUMBER_REGEX)) {
                                setNumber.add(number);
                            }
                        }

                    }
                }
            }
        }
        ArrayList<String> arrayListNumber = new ArrayList<>(setNumber);
        return arrayListNumber;

    }


    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long startSearch = System.nanoTime();
        if (list.contains(number)) {
            long stopSearch = System.nanoTime();
            System.out.println("Поиск перебором: номер найден, поиск занял " + (stopSearch - startSearch) + " нс");
            return true;
        }
        long endSearsh = System.nanoTime();
        System.out.println("Поиск перебором - номера нет в списке, время на проверку - " + (endSearsh - startSearch) + " нс");
        return false;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        Collections.sort(sortedList);
        long startSearch = System.nanoTime();
        if (Collections.binarySearch(sortedList, number) >= 0) {
            long stopSearch = System.nanoTime();
            System.out.println("Бинарный поиск:  номер найден, поиск занял " + (stopSearch - startSearch) + " нс");
            return true;
        }
        long endSearsh = System.nanoTime();
        System.out.println("Бинарный поиск - номерa нет в спискеБ время на проверку " + (endSearsh - startSearch) + " нс");

        return false;
    }


    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long startSearch = System.nanoTime();
        if (hashSet.contains(number)) {
            long stopSearch = System.nanoTime();
            System.out.println("Поиск в HashSet: номер найден, поиск занял " + (stopSearch - startSearch) + " нс");
            return true;
        }
        long endSearsh = System.nanoTime();
        System.out.println("Поиск в HashSet: - номера нет в списке, время на проверку - " + (endSearsh - startSearch) + " нс");

        return false;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long startSearch = System.nanoTime();
            if (treeSet.contains(number)) {
                long stopSearch = System.nanoTime();
                System.out.println("Поиск в TreeSet: номер найден, поиск занял " + (stopSearch - startSearch) + " нс");
                return  true;
        }
            long endSearsh = System.nanoTime();
        System.out.println("Поиск в TreeSet: - номера нет в списке, время на проверку - " + (endSearsh - startSearch) + " нс");
        return false;
    }

    public static void  testSearh() {

        ArrayList<String> list2 = new ArrayList<>(generateCoolNumbers());
        bruteForceSearchInList(list2, "У007УУ199");

        ArrayList<String> srotedList = new ArrayList<>(generateCoolNumbers());
        binarySearchInList(srotedList, "У007УУ199");

        HashSet<String> hashSet = new HashSet<>(generateCoolNumbers());
        searchInHashSet(hashSet, "У007УУ199");

        TreeSet<String> treeSet = new TreeSet<>(generateCoolNumbers());
        searchInTreeSet(treeSet, "У007УУ199");
    }
}

