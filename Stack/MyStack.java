import java.util.StringTokenizer;
class MyStackA {

    int size = 0 ;
    int data[];
    int N ;
   MyStackA(int d){
        N = d;
        data = new int[N];
    }
    boolean isFull(){
        return size == N;
    }
    boolean isEmpty(){
        return size == 0;
    }
    void push(int d){
     data[size++] = d;
    }
    int pop(){
        //if(isEmpty()) return false;
        return data[--size];
    }
     int top(){
        //if (isEmpty()) return false;
        return data[size-1];
    }
}
class MyStackL {
    public Node first;

    public MyStackL(int data){
        first = new Node(data);
    }
    public MyStackL(){
        first = null;
    }

    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    void push(int d){
        Node p = new Node(d);
        p.next = first;
        first = p;
    }

    int pop(){
        int d = first.data;
        first = first.next;
        return d;
    }

    int top(){
        return first.data;
    }
}
public class MyStack{
    public static void main(String[] args){
    String exp = "5 3 2 + *";
    System.out.println(computePostFix(exp));
    }
    static void printNBase2(int d){
        MyStackA s = new MyStackA(100);
        while(d > 0){
            s.push(d%2);
            d/=2;
        }
        while(s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    static int computePostFix(String postfix){
        StringTokenizer st = new StringTokenizer(postfix," ");
        MyStackL stack =  new MyStackL(100);
        while(st.hasMoreTokens()){
                String s = st.nextToken();
            if(s.equals("+")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a+b);
            }
            else if(s.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(s.equals("*")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a*b);
            }
            else if(s.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(s));
            }

        }
             return stack.pop();
    }
}
