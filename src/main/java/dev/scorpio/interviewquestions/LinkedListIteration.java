package dev.scorpio.interviewquestions;

public class LinkedListIteration {
    static Node head;

    public LinkedListIteration() {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

    }

    public void iterateUsingRecursion(Node head){
        if(head==null)
            return;
        System.out.println(head.data);
        iterateUsingRecursion(head.next);
    }

    public void iterateWithoutRecursion(Node head){
        while(head!=null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListIteration obj = new LinkedListIteration();
        System.out.println("Iterating without recursion..");
        obj.iterateWithoutRecursion(head);
        System.out.println("Iterating with recursion..");
        obj.iterateUsingRecursion(head);
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
}
