import java.util.*;
import java.io.*;
import java.lang.Double;

public class Frontier{
    public LinkedList<Node> l = new LinkedList<Node>();

    public void add(Node n){
		Node tmp = l.peekFirst();
		System.out.println(tmp);
		System.out.println(n);
		if (tmp == null) {
			l.add(n);
		} else {
			int ind = 0;
			while (Double.compare(n.getPriority(), tmp.getPriority()) < 0){
	    		ind++;
	    		tmp = tmp.getNext();
			}
			l.add(ind, n);
    	}
    }
    
    public Node remove(){
		Node r = l.remove();
		return r;
    }
    
    public boolean isEmpty(){
		return l.isEmpty();
    }
}
