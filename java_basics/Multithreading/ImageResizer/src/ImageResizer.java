import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageResizer implements Runnable {


    private File[] files;
    private int newWidth;
    private String dstFolder;
    private Component Scalr;

    public ImageResizer(File[] files, int newWidth, String dstFolder) {
        this.files = files;
        this.newWidth = newWidth;
        this.dstFolder = dstFolder;
    }

    @Override
    public void run() {

        try {
            for (File file : files) {
                BufferedImage image = ImageIO.read(file);
                if (image == null) {
                    continue;
                }
                BufferedImage newImage = Scalr.resize(image, newWidth);
                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(newImage, "jpg",newFile);
                System.out.println(file.getName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}