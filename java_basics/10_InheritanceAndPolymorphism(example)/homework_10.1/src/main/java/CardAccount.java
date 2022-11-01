public class CardAccount extends BankAccount {
    // не забывайте, обращаться к методам и конструкторам родителя
    // необходимо используя super, например, super.put(10D);
   // protected CardAccount(){
   // }

    protected void put(double putMoney){
        super.put(putMoney);
        System.out.println(getAmount());
    }

    protected   void take(double getMoney){
        {   //Списание
            if (getMoney >= getAmount()){
                System.out.println("Недостатчон средств для списания,  сумма на счете: "   +  super.getAmount());
            }
            else if (getMoney < getAmount()){
                double percent = (getMoney * 1) /100;
                super.take(getMoney + percent);
               // amount = amount  - (getMoney + x);
             //  System.out.println(amount);
            }
        }
    }




    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        // Родительский класс
        System.out.println("№1");
        bankAccount.put(1000D);
        bankAccount.take(100D);


       CardAccount cardAccount = new CardAccount();
        //подкласс c %/
         System.out.println("№2");
         cardAccount.put(1000D);
         cardAccount.take(100D);

         DepositAccount depositAccount = new DepositAccount();
        System.out.println("№3");
         depositAccount.put(100D);
         depositAccount.put(100D);
         depositAccount.take(100D);


    }


}
