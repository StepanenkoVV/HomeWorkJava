import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
//import org.apache.commons.io.FileUtils;


import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        try {
            String images = "src/images/";

            //Вариант 1, парсим HTML файл в дирректории
            String htmlFile = parseFile("data/code.html");
            Document document = Jsoup.parse(htmlFile);

            //Вариант 2, парсим HTML через подключение по URL
            Document document2 = Jsoup.connect("https://lenta.ru/").get();
            Elements elements = document2.select("img");


            for (Element e : elements) {

                String src = e.attr("abs:src");

                List<String> srcImgLink = new ArrayList<>();

                if (src.matches("(.*\\.jpeg)|(.*\\.jpg)")) {
                    srcImgLink.add(src);

                    for (String imgLink : srcImgLink) {
                        int indexName = imgLink.lastIndexOf("/");
                        if (indexName == imgLink.length()) {
                            imgLink = imgLink.substring(1, indexName);
                        }
                        String name = imgLink.substring(indexName, imgLink.length()).substring(1);
                        FileUtils.copyURLToFile(new URL(imgLink), new File(images + name));
                        System.out.println(name);
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String parseFile(String path) {

        StringBuilder builder = new StringBuilder();

        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            lines.forEach(line -> builder.append(line + "\n"));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return builder.toString();

    }
}