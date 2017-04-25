package practiceRace.Stack;

/**
 * Created by seradam on 2017.04.25..
 */
public class Stack {

    Node top;

    public Stack() {
        top = null;
    }

    public void push(int x){
        if(top == null){
            top = new Node(x);
        }else{
            Node p = new Node(x);
            p.next = top;
            top = p;
        }
    }

    public int pop(){
        if(top == null){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int x = top.data;
            top = top.next;
            return x;
        }
    }

    public int peek(){
        return top.data;
    }

    public void printAll(){
        System.out.println("My actual Stack: ");
        Node current = top;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(2);
        myStack.printAll();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printAll();
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        myStack.pop();
    }


}
