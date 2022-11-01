public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
    protected void put(double putMoney) {
        super.put(putMoney);
        System.out.println(getAmount());
    }

    protected boolean take(double getMoney) {
        if (getMoney >= getAmount()) {
            System.out.println("Недостатчно средств для списания,  сумма на счете: " + super.getAmount());
            return false;
        } else {
            double percent = (getMoney * 1) / 100;
            super.take(getMoney + percent);
            return true;
        }
    }

}
