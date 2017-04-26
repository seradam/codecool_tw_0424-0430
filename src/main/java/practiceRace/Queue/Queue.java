package practiceRace.Queue;

/**
 * Created by seradam on 2017.04.26..
 */
public class Queue {

    Node first = null;
    Node last = null;

    public boolean isEmpty(){
        return (first == null || last == null);
    }

    public void push(int x){
        if (isEmpty()){
            Node p = new Node(x);
            first = last = p;
        }else{
            Node p = new Node(x);
            last.next = p;
            last = p;
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }else{
            int temp = first.data;
            first = first.next;
            return temp;
        }
    }

    public int peek(){
        return first.data;
    }

    public void printAll(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }else{
            Node current = first;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();
        myQueue.printAll();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.push(5);
        myQueue.printAll();
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.pop());
        myQueue.printAll();
    }

}
