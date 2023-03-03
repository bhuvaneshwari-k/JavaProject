package org.example.creditcard;
import java.util.logging.*;
import java.util.*;
public class CreditCard implements cloneable{
    Logger l=Logger.getLogger("creditcard.class");
    String cardnumber1="1202340456067808";
    String cardholdername;
    String cardnumber;
    String expirydate;
    CreditCard(String number,String name,String date){
        cardholdername=number;
        cardnumber=name;
        expirydate=date;
    }
    String checknumber(){
        if(cardnumber.equals(cardnumber1)){
            return "true";
        }
        else{
            return "false";
        }
    }
    CreditCard cloneTest() {
        try {
            return (CreditCard) super.clone();
        }
        catch (CloneNotSupportedException e) {
            l.info("cloning not supported");
            return this;
        }
    }
    public static void getCard() {
        Scanner s=new Scanner(System.in);
        Logger l=Logger.getLogger("creditcard.class");
        l.info("Enter card holder's name:");
        String name=s.nextLine();
        l.info("Enter card number:");
        String number=s.nextLine();
        l.info("Enter expiration date:");
        String date=s.nextLine();
        CreditCard cc=new CreditCard(name,number,date);
        l.info("The new credit card details are:-");
        l.log(Level.INFO, () -> "The card holder's name is:" +cc.cardholdername);
        l.log(Level.INFO, () -> "The card number is:" +cc.cardnumber);
        l.log(Level.INFO, () -> "The expiration date is:" +cc.expirydate);
        String result=cc.checknumber();
        if(result.equals("true")){
            l.info("your card number is correct.");
        }
        else{
            l.info("your card number is not correct.");

        }
        CreditCard cc1=cc.cloneTest();
        l.info("The cloned credit card details are:-");
        l.log(Level.INFO, () -> "The card holder's name is:" +cc1.cardholdername);
        l.log(Level.INFO, () -> "The card number is:" +cc1.cardnumber);
        l.log(Level.INFO, () -> "The expiration date is:" +cc1.expirydate);
    }

}

