package scaler.oops.intro;

public class BankAccount {
     double balance;
     String ownerName;

     double deposit(double amount) {
         balance = balance + amount;
         return balance;
     }
     double withdraw(double amount) {
         if(amount >0 && balance >= amount) {
             balance = balance - amount;
             return balance;
         }
         return balance;
     }
}
