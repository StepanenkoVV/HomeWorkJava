import java.time.LocalDate;

public class DepositAccount extends BankAccount {

    // protected DepositAccount(){

//    }
    private LocalDate lastIncome;

    protected void put(double amountPut) {
        super.put(amountPut);
        System.out.println(getAmount());
        lastIncome = LocalDate.now();
    }

    protected void take(double amountToTake) {
        LocalDate dateCanTake = lastIncome.plusMonths(1);
        if (LocalDate.now().isAfter(dateCanTake)){
            super.take(amountToTake);
            System.out.println("Пополнение " +   amountToTake +  " в "+  lastIncome );
        }
        else {
            System.out.println("Вы  сможете снять деньги со счета  " + dateCanTake);
        }
    }

}
