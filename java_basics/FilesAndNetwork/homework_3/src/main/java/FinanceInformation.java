import java.text.NumberFormat;

public class FinanceInformation {
    private String accountType;
    private String accountNumber;
    private String currency;
    private String dateOfOperation;
    private String wiringReference;
    private String operationDescription;
    private double income;
    private double expense;

    @Override
    public String toString() {
        return
                "Тип счёта  " + accountType + '\'' +
                        "Номер счета  " + accountNumber + '\'' +
                        "Валюта  " + currency + '\'' +
                        "Дата операции  " + dateOfOperation + '\'' +
                        "Референс проводки  " + wiringReference + '\'' +
                        "Описание операции  " + operationDescription + '\'' +
                        "Приход  " + income + '\'' +
                        "Расход  " + expense
                ;
    }


    public FinanceInformation(String accountType, String accountNumber, String
            currency, String dateOfOperation, String wiringReference,
                              String operationDescription,
                              double income, double expense) {
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.dateOfOperation = dateOfOperation;
        this.wiringReference = wiringReference;
        this.operationDescription = operationDescription;
        this.income = income;
        this.expense = expense;


    }

    public String getAccountType() {
        return accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public String getDateOfOperation() {
        return dateOfOperation;
    }

    public String getWiringReference() {
        return wiringReference;
    }

    public String getOperationDescription() {
        return operationDescription;
    }

    public double getIncome() {
        return income;

    }

    public double getExpense() {
        return expense;
    }
}
