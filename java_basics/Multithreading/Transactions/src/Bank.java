import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Bank {

    private Map<String, Account> accounts = new Hashtable<>();
    private final Random random = new Random();

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
        throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    /**
     * TODO: реализовать метод. Метод переводит деньги между счетами. Если сумма транзакции > 50000,
     * то после совершения транзакции, она отправляется на проверку Службе Безопасности – вызывается
     * метод isFraud. Если возвращается true, то делается блокировка счетов (как – на ваше
     * усмотрение)
     */
    public synchronized void transfer(String fromAccountNum, String toAccountNum, long amount) {

        if (accounts.get(fromAccountNum).getAccountIsBlocked()){
            System.out.println("Ваша карта заблакирована");
        }
        else if (accounts.get(toAccountNum).getAccountIsBlocked()){
            System.out.println("Счет отправления заблакирован");
        }
        else if(amount <= 0){
            System.out.println("Некорректный ввод суммы ");
        }
        else if (amount > accounts.get(fromAccountNum).getMoney()){
            System.out.println("Недостаточно средств для отправления\n" + " " + getBalance(fromAccountNum) + " на вашем счете ");
        } else  if (amount > 0 && amount < 50000){
            transMoney(fromAccountNum,toAccountNum,amount);

        } else {
            boolean isBlock = false;
            try {
                isBlock = isFraud(fromAccountNum, toAccountNum,amount);
            } catch (InterruptedException e){
                e.printStackTrace();
            } if (isBlock){
                accounts.get(fromAccountNum).setAccountIsBlocked(true);
                accounts.get(toAccountNum).setAccountIsBlocked(true);
                System.out.println("С вашей карты были совершены подозрительные дейсвтия. Карта заблакирована.");
            } else {
                transMoney(fromAccountNum,toAccountNum,amount);
            }

        }
        System.out.println("Всего денег на всех аккаунтах " + getSumAllAccounts());


    }
    private void transMoney(String fromAccountNum, String toAccountNum, long amount){

        long balance1 = accounts.get(fromAccountNum).getMoney() - amount;
        accounts.get(fromAccountNum).setMoney(balance1);

        long balance2 = accounts.get(toAccountNum).getMoney() + amount;
        accounts.get(toAccountNum).setMoney(balance2);

        System.out.println("Вы перевели " + amount + " рублей  на счет " + toAccountNum);
        System.out.println("Баланс вашего кошелька " + getBalance(fromAccountNum) + " рублей");

    }

    public void addAccount(String AccountNum, Account account){
        accounts.put(AccountNum, account);

    }

    /**
     * TODO: реализовать метод. Возвращает остаток на счёте.
     */
    public long getBalance(String accountNum) {

        return accounts.get(accountNum).getMoney();
    }


    public long getSumAllAccounts() {
        long sum = 0;
        for (Account value: accounts.values()){
            sum +=value.getMoney();
        }
        return sum;
    }
}
