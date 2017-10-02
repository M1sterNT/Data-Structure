import java.util.*;
class LinkedList {
    public Node first;

    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    public LinkedList(int data){
         first = new Node(data);
    }

     void add (int d){
        Node p = new Node(d);
        p.next = first;
        first = p;
    }
     void insert(int d,Node p){
        Node q = new Node(d);
        q.next = p.next;
        p.next = q;
    }
     Node search(int d){
        Node p = first;
            while(p != null){
                if(p.data == d) return p;
                p = p.next;
            }
            return null;
    }
    static void delete(Node prev){
        prev.next = prev.next.next;
    }
     void Printlist(){
        Node p  = first;
        System.out.print("head->");
        while (p != null){
            System.out.print("[" + p.data + "]->");
            p= p.next;
        }
        System.out.print("null");
    }
    void reverse() {
        Node p = first;
        Node q = first;
        while(p.next != null){
            q = p;
            p = p.next;
            p.next = q;
            p = p.next;
         }
    }
}

public class List1{
    public static void main(String[] args){
        LinkedList list = new LinkedList(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.reverse();
        list.Printlist();
    }
}


