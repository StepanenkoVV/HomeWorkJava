import junit.framework.Assert;
import org.junit.Test;

import java.util.Hashtable;
import java.util.Map;

public class BankTest {

    private static long account1 = 100_000;
    private static long account2 = 100_000;
    private static long amount = 5_000;
    private static  long amountMaxSum = 50001;

    private static  Map<String, Account> accounts = new Hashtable<>();

    private static Bank bank = new Bank();
    private static String Account1 = "Account 1";
    private static String Account2 = "Account 2";



    @Test
    public void transferShouldTest(){

        bank.addAccount(Account1,new Account(Account1,  account1));
        bank.addAccount(Account2,new Account(Account2, account2));

        accounts.put(Account1,new Account(Account1,account2));
        accounts.put(Account2,new Account(Account2,account2));

        bank.transfer(Account1,Account2,amount);

        int assertSumAccount1 = 95_000;

        Assert.assertEquals(assertSumAccount1, accounts.get(Account1).getMoney() - amount);

        System.out.println("**************************************************************");
    }

    @Test
    public  void transferWithMaxShouldTest(){

        bank.addAccount(Account1,new Account(Account1,  account1));
        bank.addAccount(Account2,new Account(Account2, account2));

        accounts.put(Account1,new Account(Account1,account2));
        accounts.put(Account2,new Account(Account2,account2));

        bank.transfer(Account1,Account2,amountMaxSum);

        boolean isBlocked = false;

        Assert.assertEquals(isBlocked,accounts.get(Account1).getAccountIsBlocked() && accounts.get(Account2).getAccountIsBlocked() );
        System.out.println("**************************************************************");

    }

    @Test
    public void shouldMyBalance(){

        bank.addAccount(Account1,new Account(Account1,  account1));
        bank.addAccount(Account2,new Account(Account2, account2));

        accounts.put(Account1,new Account(Account1,account2));
        accounts.put(Account2,new Account(Account2,account2));

        bank.transfer(Account1,Account2,amount);

        int assertBalanceAccountOne = 100_000;

        Assert.assertEquals(assertBalanceAccountOne,accounts.get(Account1).getMoney());
        System.out.println("**************************************************************");


    }
}
