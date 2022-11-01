import org.w3c.dom.ls.LSOutput;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    private static int newWidth= 300;
    public static void main(String[] args) throws  NullPointerException {

        String srcFolder = "/Users/vitalijstepanenko/Desktop/src";
        String dstFolder = "/Users/vitalijstepanenko/Desktop/dst";
        Runtime runtime = Runtime.getRuntime();

        int nrOfProcessors = runtime.availableProcessors();
        System.out.println(nrOfProcessors + " количество ядер на компьютере"); // количество ядер 8

        File srcDir = new File(srcFolder);

        long start = System.currentTimeMillis();

        File[] files = srcDir.listFiles();

        int oneEight = files.length / nrOfProcessors ;

        File[] files1 = new File[oneEight];
        System.arraycopy(files,0,files1, 0,files1.length);
        ImageResizer resizer1 = new ImageResizer(files1,newWidth,dstFolder);
        new Thread(resizer1).start();

        int nbThreads =  Thread.getAllStackTraces().keySet().size();

        System.out.println( "  сейчас запущено  " + nbThreads +  " потоков" );


        System.out.println("Duration: " + (System.currentTimeMillis() - start));
    }
}
