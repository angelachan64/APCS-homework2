import java.util.*;

public class Frontier{
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
	Node tmp = l.getFirst();
	int ind = 0;
	while (n.getPriority() > tmp.getPriority()){
	    ind++;
	    tmp = tmp.getNext();
	}
	l.add(ind, n);
    }
    public Node remove(){
	Node r = l.remove();
	return r;
    }
    public boolean isEmpty(){
	return l.isEmpty();
    }
}
