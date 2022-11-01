
public class BankAccount {

    private double amount;

    protected double getAmount() {
        return amount;
    }

    protected void put(double amountToPut) {
        if (amountToPut >= 0) {
            amount += amountToPut;
        }

    }

    protected boolean take(double amountToTake) {   //Списание
        if (amountToTake >= getAmount()) {
            System.out.println(getAmount());
            return false;
        } else {
            amount = amount - amountToTake;
            System.out.println(amount);
            return true;
        }
    }

    protected boolean send(BankAccount receiver, double amount) {
        if (take(amount)) {
            receiver.put(amount);
            return true;
        } else {
            System.out.println("Сумма перевода превышает баланс на счете");
            return false;
        }


    }

}
