public class Account {

    private long money;
    private String accNumber;
    private boolean accountIsBlocked;

    public Account(String accNumber, long money){
        this.accNumber = accNumber;
        this.money = money;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getAccNumber() {
        return accNumber;
    }


    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public boolean getAccountIsBlocked(){
        return accountIsBlocked;
    }

    public void setAccountIsBlocked(boolean accountIsBlocked){
        this.accountIsBlocked = accountIsBlocked;
    }
}
