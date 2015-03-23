import java.util.*;
import java.io.*;

public class myStack{
    public Node<E> l;

    public myStack(){
	l = null;
    }
    public myStack(E s){
	Node<E> tmp = new Node<E>(s);
	l = null;
	l.setNext(tmp);
    }

    public void push(){

    }
    public E pop(){

    }
}
