package Algorithms.LinkedList;

import java.util.LinkedList;

public class Link {

    // Set to public so getters & setters aren't needed

    public String bookName;
    public int millionsSold;

    // Reference to next link made in the LinkList
    // Holds the reference to the Link that was created before it
    // Set to null until it is connected to other links

    public Link next;

    public Link(String bookName, int millionsSold){

        this.bookName = bookName;
        this.millionsSold = millionsSold;

    }

    public void display(){

        System.out.println(bookName + ": " + millionsSold + ",000,000 Sold");

    }

    public String toString(){

        return bookName;

    }

    public static void main(String[] args) {


        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        System.out.println(linkedList.toString());
        linkedList.remove();
        System.out.println(linkedList.toString());
        System.out.println("Last one is: " + linkedList.removeLast());
        System.out.println(linkedList.toString());
        System.out.println("First one is: " + linkedList.removeFirst());
        System.out.println(linkedList.toString());
        System.out.println(linkedList.peek());
        System.out.println("pool:" + linkedList.poll());
        System.out.println(linkedList.toString());

        LinkList theLinkedList = new LinkList();

        // Insert Link and add a reference to the book Link added just prior
        // to the field next

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings", 150);
        theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

        theLinkedList.display();

        System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");

        // Removes the last Link entered

        theLinkedList.removeFirst();

        theLinkedList.display();

        System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");

        theLinkedList.removeLink("A Tale of Two Cities");

        System.out.println("\nA Tale of Two Cities Removed\n");

        theLinkedList.display();

    }

}