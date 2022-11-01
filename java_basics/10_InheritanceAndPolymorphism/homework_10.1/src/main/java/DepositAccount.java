import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    private LocalDate lastIncome;

    protected void put(double amountPut) {
        super.put(amountPut);
        System.out.println(getAmount());
        lastIncome = LocalDate.now();
    }

    protected boolean take(double amountToTake) {
        LocalDate dateCanTake = lastIncome.plusMonths(1);
        if (LocalDate.now().isAfter(dateCanTake)) {
            super.take(amountToTake);
            System.out.println("Пополнение " + amountToTake + " в " + lastIncome);
            return true;
        } else {
            System.out.println("Вы  сможете снять деньги со счета  " + dateCanTake);
            return false;
        }

    }

}
