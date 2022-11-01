import javax.swing.text.Document;
import javax.xml.namespace.QName;

public class Printer {
    private static int printer = 0;
    private String queue = " ";
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int doc = 0;
    private int allCount = 0;
    private String name = " ";

   public Printer() { printer++; }

    public void append(String document,String name, int count) {
        if (contains(document)){
            return;
        }
        queue =  queue +   "\n" +  "текст документа: " + document +  " имя документа: " + name +  "количество страниц в документе: " + count + " стр.";
        pagesCount = pagesCount+count;
        //DocumentsCount+=1;
        documentsCount=documentsCount+1;
        allCount=allCount+count;
        doc=doc+1;

    }
    public void append(String document,String name){  append(document,name,1);  }


    public void append(String document){ append(document,name,1); }


    public void clear() { System.out.println("Очищаем принтер " );
        documentsCount=0;
        pagesCount=0;
    }

    public boolean contains(String document){
       return queue.contains(document);
    }


    public void print (String title) {
        System.out.println(title);
        if (queue.isBlank()){
            System.out.println("Спиcок для печати пуст: ");
            clear();
        }
        else { System.out.println("Список документов на печать: " + "\n" +  queue);
            clear();
        }
    }

    public int getpagesCount()
    {
        return pagesCount;
    }

    public int getdocumentsCount() {  System.out.print(" общее количество документов, которые добавлены в принтер - "  );
        return documentsCount;
    }

    public int getDoc() {  System.out.print("  Сколько всего  документов было на печать за всю историю ?   - " );
        return doc;
    }

    public int getAllCount() {  System.out.print(" Сколько всего страниц было распечатано за всю историю?   - " + allCount + "\n");
        return allCount;
    }

    public int[] reduce (){  System.out.println("Было  распечатано документов за всю итсорию - " + doc + " / "+ " было распечатано страниц за всю историю - "+ allCount);
       return new int[]{ doc,allCount};
    }

    public static void increasPrinter() {  System.out.println("Сколько принтеров в офисе? - " + Printer.printer);
       Printer.printer = Printer.printer+ printer;
    }

}

