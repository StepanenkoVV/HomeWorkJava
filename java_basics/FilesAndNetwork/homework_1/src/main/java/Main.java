import net.sf.saxon.trans.SymbolicName;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println(" Введите путь до папки:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("STOP")) {
                break;
            }
            if (input.equals("/")) {
                System.out.println("Уточните путь");
                continue;
            }
            System.out.println("Размер папки " + input + " составляет " + FileUtils.getHumanReadableSize(FileUtils.calculateFolderSize(input)));

        }
    }
}

