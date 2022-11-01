public class Main {
    public static void main(String[] args) {
        Printer sony = new Printer();
        sony.append("животный мир. ","<animal>.  ",5);
        sony.print("");
        sony.append("Все о птицах ","birds ");
        sony.clear();
        Printer samsung = new Printer();
        samsung.append("Самсунг");
        samsung.append("Самсунг 2");
        System.out.println("" + sony.getpagesCount());
        System.out.println(" " + sony.getdocumentsCount());

        System.out.println("_______________________________________________\n");

        Printer apple = new Printer();
        apple.append("");
        System.out.println(apple.getdocumentsCount());

        sony.reduce();
        Printer.increasPrinter();
    }



}
