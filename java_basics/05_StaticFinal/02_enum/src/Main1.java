public class Main1 {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(16, 14);
        //System.out.println(arithmeticCalculator.getNum());
        System.out.println("Сложение двух чисел переданных в конструктор ");
        System.out.println(arithmeticCalculator.calculate(Operation.ADD));
        System.out.println("Умножение двух чисел переданных в конструктор ");
        System.out.println(arithmeticCalculator.calculate(Operation.MULTIPLY));
        System.out.println("Вычитание двух чисел переданных в конструктор ");
        System.out.println(arithmeticCalculator.calculate(Operation.SUBTRACT));


    }
}
