package GraphRelated;

import java.util.Stack;

/**
 * Created by seradam on 2017.04.26..
 */
public class DepthFirstTraversal {

    public void traversal(Node start) {
        Node current = start;
        Stack<Node> stack = new Stack<>();
        stack.push(current);
        current.isVisited = true;
        System.out.println(current.data);
        while (!stack.empty()){
            for(Node n : current.connections){
                if(!n.isVisited){
                    stack.push(n);
                    n.isVisited = true;
                    System.out.println(stack.peek().data);
                    current = stack.peek();
                    break;
                }
                else if (n == current.connections.get(current.connections.size() - 1)){
                    stack.pop();
                    if (!stack.empty()){
                        current = stack.peek();
                    }
                }
            }
        }
    }




    public static void main(String[] args) {
        DepthFirstTraversal dft = new DepthFirstTraversal();
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.addConnection(b);
        a.addConnection(c);
        b.addConnection(a);
        b.addConnection(d);
        b.addConnection(e);
        c.addConnection(a);
        c.addConnection(f);
        c.addConnection(g);
        d.addConnection(b);
        d.addConnection(h);
        e.addConnection(b);
        f.addConnection(c);
        g.addConnection(c);
        h.addConnection(d);
//        e.addConnection(h);
//        h.addConnection(e);

        dft.traversal(a);

    }
}
