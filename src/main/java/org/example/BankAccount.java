package org.example;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class BankAccount {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Logger l=Logger.getLogger("BankAccount.class");
        String username1;
         long num1;
        BankAccount(){
            l.info("Enter username:");
            username1 = scanner2.nextLine();
            l.info("Enter account number:");
            num1 = scanner1.nextLong();
            String str = Long.toString(num1);
            int len=str.length();
            try{
                if(len != 15)
                    throw new BankException("Your bank account number is not valid");
            }
            catch(BankException e){
                l.log(Level.INFO, () ->"" +e.getMessage());
                System.exit(0);
            }
        }

        int ch;
        public void BankProcess() {
          AccountProcess ba = new AccountProcess(username1, num1, 0.0);
          do {
              l.info("1.Deposit\n2.Withdrawal\n3.Current Balance\n4.Exit");
              l.info("Enter your choice:");
              ch = scanner1.nextInt();
              switch (ch) {
                  case 1 -> {
                      l.info("Enter the amount to deposit:");
                      long amt = scanner1.nextLong();
                      ba.deposit(amt);
                  }
                  case 2 -> {
                      l.info("Enter the amount to withdraw:");
                      long amt1 = scanner1.nextLong();
                      ba.withdrawal(amt1);
                  }
                  case 3 -> ba.displaybalance();
                  default ->
                      l.info("you are exiting...!");
              }
          } while (ch < 4);
      }
    }
