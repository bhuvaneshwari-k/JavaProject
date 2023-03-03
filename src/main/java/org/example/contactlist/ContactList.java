package org.example.contactlist;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContactList {
    Logger l=Logger.getLogger("contactlist.class");
    Node rootNode=null;
    int count=0;
    public void addContact(String name, long phno, String email) {
        if(rootNode==null){
            rootNode=new Node(name,phno,email);
            count++;
        }
        else{
            Node temp=rootNode;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node(name,phno,email);
            count++;
        }
    }
    public void insertContact(String name, long phno, String email,int index){
        Node newNode=new Node(name,phno,email);
        if(index==0){
            newNode.next= rootNode;
            rootNode=newNode;
        }
        else{
            Node temp=rootNode;
            int count1=0;
            while(temp!=null){
                Node current=temp.next;
                count1++;
                if(count1==index){
                    temp.next=newNode;
                    newNode.next=current;
                    break;
                }
                temp=temp.next;
            }
        }
        count++;
    }
    public void deleteContact(int index){
        if(index==0){
            Node temp=rootNode;
            rootNode=temp.next;
        }
        else{
            Node temp=rootNode;
            int count1=0;
            while(temp!=null){
                Node prev=temp.next;
                count1++;
                if(count1==index){
                    temp.next=prev.next;
                    break;
                }
                temp=temp.next;
            }
        }
        count--;
    }
    public void searchContact(String name){
        Node temp=rootNode;
        int search=0;
        while(temp!=null){
            if(temp.name.equals(name)){
                search++;
                String contactname=temp.name;
                long phonenumber=temp.phno;
                String emailid=temp.email;
                l.log(Level.INFO,()->"The searched contact name is:"+contactname);
                l.log(Level.INFO,()->"The searched contact phonenumnber is:"+phonenumber);
                l.log(Level.INFO,()->"The searched contact email id is:"+emailid);
                break;
            }
            temp=temp.next;
        }
        if(search==0)
            l.info("The searched contact is not present in the list.");
    }
    public void displayContact(){
        Node temp=rootNode;
        if(temp==null){
            l.info("Contact List is empty");
        }
        else{
            while(temp!=null){
                String contactname=temp.name;
                long phonenumber=temp.phno;
                String emailid=temp.email;
                l.log(Level.INFO,()->"Contact Name is:"+contactname );
                l.log(Level.INFO,()->"Contact Phone Number is:"+ phonenumber);
                l.log(Level.INFO,()->"Contact Email ID is:"+ emailid);
                temp=temp.next;
            }
        }
        l.log(Level.INFO,()->"Contact List size is:"+ count);

    }

    public static void getContact() {
        Logger l=Logger.getLogger("welcome");
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        ContactList ll = new ContactList();
        int ch;
         do {
             l.info("\n 1.To Add the contact.\n2.To Insert the contact.\n3.To Delete the contact.\n4.To Search the Contact.\n5.To Display the contact.\n6.To exit.");
             l.info("Enter your choice:");
            ch=s.nextInt();
            try {
            switch (ch) {
                case 1: {
                    l.info("Enter the number of contacts you want to add:");
                    int size = s.nextInt();
                    int i = 0;
                    while (i < size) {
                        l.info("Enter name,phonenumber,emailid to add:");
                        ll.addContact(s1.nextLine(), s.nextLong(), s1.nextLine());
                        i++;
                    }
                    break;
                }
                case 2: {
                    l.info("Enter name,phonenumber,emailid,index to insert:");
                    ll.insertContact(s1.nextLine(), s.nextLong(), s1.nextLine(), s.nextInt());
                    break;
                }
                case 3: {
                    l.info("Enter index to delete:");
                    ll.deleteContact(s.nextInt());
                    break;
                }
                case 4: {
                    l.info("Enter contact name to search:");
                    ll.searchContact(s1.nextLine());
                    break;
                }
                case 5: {
                    ll.displayContact();
                    break;
                }
                default: {
                    l.info("Invalid choice.");
                    break;
                }
            }
            }catch (InputMismatchException e){
                      l.log(Level.INFO,()->"Invalid Input"+e.getMessage());
            }

        }while(ch<6);
    }
}