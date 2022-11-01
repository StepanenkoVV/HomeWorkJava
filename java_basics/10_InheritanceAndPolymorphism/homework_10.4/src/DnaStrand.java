public class DnaStrand {
    public static String makeComplement(String dna) {

        String[] subStr;
        subStr = dna.split(""); // Разделения строки str с помощью метода split()
        String s = "";
        // Вывод результата на экран
        for(int i = 0; i < subStr.length; i++) {
            if(i == 'A'){
            }

        }
        //Your code

        return s;
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTA"));
    }
}
