package GraphRelated;

import java.util.Stack;

/**
 * Created by seradam on 2017.04.27..
 */
public class DepthFirstSearch {

    public int search(Node start, Node goal) {
        Node current = start;
        Stack<Node> stack = new Stack<>();
        stack.push(current);
        current.isVisited = true;
        System.out.println(current.data);
        while (!stack.empty()){
            if (current == goal){
                return current.data;
            }
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
        return -1;
    }

    public static void main(String[] args) {
        DepthFirstSearch dfs = new DepthFirstSearch();
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

        dfs.search(a,e);

    }
}
