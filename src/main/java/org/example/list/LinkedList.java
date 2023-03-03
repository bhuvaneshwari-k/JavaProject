package org.example.list;

import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedList {
    Logger log=Logger.getLogger("linkedlist.class");

    Node1 rootNode =null;
    int count =0;

    public void addElement(int value) {
        if (this.rootNode == null) {
            this.rootNode = new Node1(value);
            this.count++;
        } else {
            Node1 temp = this.rootNode;
            while (temp.nextNode != null) {
                temp = temp.nextNode;
            }
            temp.nextNode = new Node1(value);
            this.count++;
        }
    }

    public void insertElement(int value,int index) {
        Node1 newNode = new Node1(value);
        try {
            if (index == 0) {
                log.info("After Insert an element at Start:");
                newNode.nextNode = this.rootNode;
                this.rootNode = newNode;
            } else {
                log.info("After Insert an element at Middle/Last:");
                Node1 temp = this.rootNode;
                int count1 = 0;
                while (temp != null) {
                    Node1 current = temp.nextNode;
                    count1++;
                    if (count1 == index) {
                        temp.nextNode = newNode;
                        newNode.nextNode = current;
                        break;
                    }
                    temp = temp.nextNode;

                }
            }
            this.count++;
        } catch (NoSuchElementException e) {
            e.getMessage();
        }
    }


    public void removeElement(int index) {
        try {
            if (index == 0) {
                log.info("After Delete an element at Start:");
                Node1 temp = this.rootNode;
                this.rootNode = temp.nextNode;
            } else {
                log.info("After Delete an element at Middle/Last:");
                Node1 temp = this.rootNode;
                int count1 = 0;
                while (temp != null) {
                    Node1 prev = temp.nextNode;
                    count1++;
                    if (count1 == index) {
                        temp.nextNode = prev.nextNode;
                        break;
                    }
                    temp = temp.nextNode;
                }
            }
            this.count--;
        }catch (NoSuchElementException e){
            e.getMessage();
        }
    }

    public void printElements() {
        Node1 temp = this.rootNode;
        if (temp == null) {
            log.info("Is empty!");
        } else {
            while (temp != null) {
                int result=temp.data;
                log.log(Level.INFO,()->""+result);
                temp = temp.nextNode;
            }
        }
        log.log(Level.INFO,()->"Size of the LinkedList is:"+this.count);
    }

    public static void startList() {
        LinkedList list = new LinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);
        list.printElements();
        list.insertElement(5, 3);
        list.printElements();
        list.removeElement(3);
        list.printElements();
    }
}