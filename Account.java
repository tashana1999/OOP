public class Account
{
 private double balance;
 public static void main(String[] args){
}
public Account(double initialBalance)
 {
   if(initialBalance>0.0)
     balance=initialBalance;

}
public void credit(double amount)
{
 balance=balance+amount;
}
public void debit(double withdrawal)
{if(balance>withdrawal)
   balance=balance-withdrawal;
 else
   System.out.println("Debit amount exceeded account balance");
}
public double getBalance()
{
 return balance;
}
}

