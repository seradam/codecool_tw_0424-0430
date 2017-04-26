package GraphRelated;

import java.util.Queue;
import java.util.LinkedList;

/**
 * Created by seradam on 2017.04.26..
 */
public class BreadthFirstSearch {

    public int search(Node start, Node goal){
        Node current = start;
        Queue<Node> queue = new LinkedList<>();
        queue.add(current);
        current.isVisited = true;
        while (queue.peek() != null){
            if (current == goal){
                return current.data;
            }
            for (Node n : current.connections){
                if(!n.isVisited){
                    queue.add(n);
                    n.isVisited = true;
                }
            }
            System.out.println(queue.peek().data);
            current = queue.remove();
        }
        return -1;
    }


    public static void main(String[] args) {
        BreadthFirstSearch bfs = new BreadthFirstSearch();
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

        bfs.search(a,f);

    }
}
