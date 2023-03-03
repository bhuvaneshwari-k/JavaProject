package org.example.list;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Stack {
    Logger log = Logger.getLogger("stack.class");
    Node1 rootNode = null;
    int count = 0;

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
        Node1 temp = this.rootNode;
        if (this.count == 1) {
            this.rootNode = temp.nextNode;
        } else {
            Node1 prev = temp;
            while (temp.nextNode != null) {
                prev = temp;
                temp = temp.nextNode;
            }
            prev.nextNode = temp.nextNode;
        }
        this.count--;
    }


    public void printElements() {
        Node1 temp = this.rootNode;
        if (temp == null) {
            log.info("Is empty!");
        } else {
            while (temp != null) {
                int result = temp.data;
                log.log(Level.INFO, () -> "" + result);
                temp = temp.nextNode;
            }
        }
        log.log(Level.INFO, () -> "Size of the Stack is:" + this.count);
    }

    public static void getStack() {
        Scanner scan=new Scanner(System.in);
        Logger log=Logger.getLogger("queue.class");
        Stack stack = new Stack();
        stack.addElement(12);
        stack.addElement(4);
        stack.addElement(10);
        stack.addElement(50);
        stack.printElements();
        log.info("Enter number of elements you want to remove:");
        int num=scan.nextInt();
        int i=0;
        try {
            while (i < num) {
                stack.removeElement();
                i++;
            }
        }catch (IndexOutOfBoundsException e){
            e.getMessage();
        }
        stack.printElements();
    }
}