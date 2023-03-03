package org.example.list;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Queue {
    Logger log=Logger.getLogger("queue.class");
    Node1 rootNode=null;
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

    public void removeElement() {
        try {
            this.rootNode = this.rootNode.nextNode;
            this.count--;
        }catch (NoSuchElementException e){
            e.getMessage();
        }
    }

    public void printElements() {
            Node1 temp = this.rootNode;
            if (temp == null) {
            log.info("Is empty!");
            }
            else {
                while (temp != null) {
                    int result = temp.data;
                    log.log(Level.INFO, () -> "" + result);
                    temp = temp.nextNode;
                }
            }
            log.log(Level.INFO, ()->"Size of the Queue is:" + this.count);
    }

    public static void startQueue() {
        Scanner scan=new Scanner(System.in);
        Logger log=Logger.getLogger("queue.class");
        Queue queue = new Queue();
        queue.addElement(12);
        queue.addElement(4);
        queue.addElement(10);
        queue.printElements();
        log.info("Enter number of elements you want to remove:");
        int num=scan.nextInt();
        int i=0;
        while(i<num) {
            queue.removeElement();
            i++;
        }
        queue.printElements();
    }
}

