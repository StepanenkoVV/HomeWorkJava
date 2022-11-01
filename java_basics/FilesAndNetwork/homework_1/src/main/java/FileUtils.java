import net.sf.saxon.trans.SymbolicName;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.nio.file.Files;
import java.util.stream.Stream;


public class FileUtils {

    private static char[] sizeMultipliers = {'B', 'K', 'M', 'G', 'T'};
    private static long sumFiles;
    public static long calculateFolderSize(String path) {


        try {
            File dir = new File(path);
            if (!dir.exists()) {
                System.out.println("Папки с введеным именем не существует");
            } else if (!dir.isDirectory()) {
                System.out.println("Не является папкой");
            } else
                getHumanReadableSize(getFolderSize(dir));
        } catch (Exception e) {
            System.out.println("Ошибка");
            e.getStackTrace();
        }

        return getFolderSize(new File(path));
    }
        //Вариант решения с более современным и продвинутым способом
//        Path path1 = Paths.get(path);
//        try(Stream<Path> subPath = Files.walk(path1)) {
//            long sum = subPath
//                    .map(Path::toFile)
//                    .filter(File::isFile)
//                    .mapToLong(File::length)
//                    .sum();
//            System.out.println(sum);
//            sumFiles = sum;
//        }
//        catch (IOException e){
//            e.printStackTrace();
//
//        }
//        return sumFiles ;
//    }

    public static String getHumanReadableSize(long size) {
        for (int i = 0; i < sizeMultipliers.length; i++) {
            double value = size / Math.pow(1024, i);
            if (value < 1024) {
                return Math.round(value) + "" + sizeMultipliers[i] +
                        (i > 0 ? "b" : "");
            }
        }
        return "Very Big";
    }


    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] files = folder.listFiles();
        for (File file : files) {
            sum += getFolderSize(file);
        }
        return sum;
    }

}
