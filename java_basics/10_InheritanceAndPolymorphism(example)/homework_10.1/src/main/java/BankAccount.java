import java.util.ArrayList;
import java.util.HashSet;

public class BankAccount { // родитель
    //private double amount;
    protected  double amount;
   // protected BankAccount(){
   // }

   /*  protected BankAccount(double amount){
      this.amount = amount;
    }
    protected void setAmount(double amount) {
      this.amount = amount;
    }
    /
    */


  protected double getAmount() {
    return amount;
  }

  protected void put(double amountToPut) {
    if (amountToPut >=0){
      amount +=amountToPut;
    }

  }

  protected void take(double amountToTake) {   //Списание
    if (amountToTake >= getAmount()){
      System.out.println(getAmount());
    }
    else if (amountToTake < getAmount()){
      amount = amount  - amountToTake;
      System.out.println(amount);
    }
  }
}
