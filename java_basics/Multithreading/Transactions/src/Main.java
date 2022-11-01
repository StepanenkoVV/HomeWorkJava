import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  throws InterruptedException {

        Bank bank = new Bank();

        generationAccounts(bank);
        startThread(bank);

    }

    public static void generationAccounts(Bank bank){
        for (int i = 0; i< 100_000; i++){

            String number = "408" + i;
            bank.addAccount(number,new Account(number, (long) (100_000 +  Math.random() * 100_100)));

        }
    }

    public static  void startThread(Bank bank){
        System.out.println("Всего денег в банке  в начале  -    " + bank.getSumAllAccounts());
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 100; i++ ){
            threadList.add(
                    new Thread(() ->{
                        System.out.println("Start thread");
                        String from = "408" + (int) (Math.random() * 100_000);
                        String to = "408" + (int) (Math.random() * 100_000);
                        long amount = (long) (Math.random() * 60_000);
                        for (int j = 0; j < 10_000; j++){
                            bank.transfer(from,to,amount);
                        }
                        System.out.println("Stop thread");
                    })
            );
            threadList.forEach(Thread :: start);
            boolean isAlive = true;

            while (isAlive){
                isAlive = threadList.stream().filter((t) -> t.isAlive()).count() > 0;
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

    }
}
