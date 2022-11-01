import org.apache.commons.collections.iterators.LoopingListIterator;
import org.apache.commons.collections.list.TreeList;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {

        while (true) {
            List<String> testList = CoolNumbers.generateCoolNumbers();
            System.out.println((testList.size()) + " номером сгенерированно");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            if (testList.contains(input)){
               CoolNumbers.bruteForceSearchInList(testList,input);
               CoolNumbers.binarySearchInList(testList,input);
               HashSet<String> hashSet = new HashSet<>(testList);
               CoolNumbers.searchInHashSet(hashSet,input);
               TreeSet<String> treeSet = new TreeSet<>(testList);
               CoolNumbers.searchInTreeSet(treeSet,input);

            }
            else {
                CoolNumbers.bruteForceSearchInList(testList,input);
                CoolNumbers.binarySearchInList(testList,input);
                HashSet<String> hashSet = new HashSet<>(testList);
                CoolNumbers.searchInHashSet(hashSet,input);
                TreeSet<String> treeSet = new TreeSet<>(testList);
                CoolNumbers.searchInTreeSet(treeSet,input);
            }
            break;
        }

    }
}
