package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AccountProcess {
    static Logger logger = Logger.getLogger("AccountProcess.class");
    String username;
    long number;
    double balance;


    public AccountProcess(String username1, long num1, double balance1) {
        username = username1;
        number = num1;
        balance = balance1;
        logger.log(Level.INFO, () -> "Your name is:" + username);
        logger.log(Level.INFO, () -> "Your account number is:" + number);
        logger.info("your account is created!!!");
    }

     public void deposit(long amount) {
        balance = balance + amount;
        logger.info("your amount is deposited successfully!!!");
    }

    public void withdrawal(long amount) {
        balance = balance - amount;
        logger.info("your amount is withdrawn successfully!!!");
    }

   public  void displaybalance() {
        logger.log(Level.INFO, () -> "Your current balance is:" + balance);
    }
}
