import java.io.*;
import java.nio.file.*;


public class FileUtils {
    public static void copyFolder(String sourceDirectory, String destinationDirectory) throws IOException {
        // TODO: write code copy content of sourceDirectory to destinationDirectory
        Files.walk(Paths.get(sourceDirectory))
                .forEach(source -> {
                    Path destination = Paths.get(destinationDirectory, source.toString()
                            .substring(sourceDirectory.length()));
                    try {
                        Files.copy(source, destination);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}
