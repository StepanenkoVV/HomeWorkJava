public class ArithmeticCalculator {
    public int number1;
    public int number2;
    public int resulte;


    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }



    public int calculate(Operation operation) {
        if (operation.equals(Operation.ADD)) {
            resulte = number1 + number2;
        }
        if (operation.equals(Operation.MULTIPLY)) {
            resulte = number2 * number1;
        } else if (operation.equals(Operation.SUBTRACT)) {
            resulte = number1 - number2;
        }
        return resulte;
    }


}
