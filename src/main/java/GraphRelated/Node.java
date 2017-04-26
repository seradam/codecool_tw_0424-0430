package GraphRelated;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by seradam on 2017.04.26..
 */
public class Node {

    public int data;
    public boolean isVisited;
    public List<Node> connections;

    public Node(int data) {
        this.data = data;
        this.isVisited = false;
        this.connections = new ArrayList<Node>() {
        };
    }

    public void addConnection(Node node){
        this.connections.add(node);
    }
}
