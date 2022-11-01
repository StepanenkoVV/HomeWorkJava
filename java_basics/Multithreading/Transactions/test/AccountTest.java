import junit.framework.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void sumAllMoney(){

        Account account = new Account("From", 10_000);
        Account account1 = new Account("TO", 10_000);

        int assertAccount = 20_000;
        Assert.assertEquals(assertAccount,account.getMoney() + account1.getMoney(),1e-9);

    }


}
