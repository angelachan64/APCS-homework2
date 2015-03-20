import java.util.*;
import java.io.*;

public class LLit<E> implements Iterator<E>{
    private Node<E> l;
    
    public LLit(Node<E> n){
	l = n;
    }
    public boolean hasNext(){
	return l!=null;
    }
    public E next(){
	//move to the next node and return the value in the node before the move
	E s = l.getData();
	l = l.getNext();
	return s;
    }
    public void remove(){

    }
}
