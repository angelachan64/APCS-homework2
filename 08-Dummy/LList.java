import java.util.*;
import java.io.*;

public class LList<E>{
    private Node<E> l=null;
    private int len;

    public LList(){
	Node<E> DN = new Node<E>();
	DN.setNext(l);
	l = DN;
	len = 0;
    }

    public Iterator<E> iterator(){
	LLit<E> llit = new LLit<E>(l.getNext());
	return llit;
    }
    public void add(E s){
	//l = new Node(s);
	//l.setNext(null);
	Node<E> temp = new Node<E>(s);
	temp.setNext(l.getNext());
	l.setNext(temp);
	len++;
    }

    public String toString(){
	String s = "";
	Node<E> tmp;
	for (tmp = l;tmp != null;tmp=tmp.getNext()){
	    s = s+tmp + " --> ";
	} s = s + "null";
	return s;
    }

    public E get(int n){
	int ind = 0;
	Node<E> ret = l;
	while (ind<n && n<len){
	    ret = ret.getNext();
	    ind++;
	} return ret.getData();
    }
    public void add(int n, E s){
	int ind = 0;
	Node<E> insert = new Node<E>(s);
	Node<E> replace = l;
	/*if (n == 0){
	    add(s);
	}*/
	while (ind < n-1){
	    replace = replace.getNext();
	    ind++;
	} insert.setNext(replace.getNext());
	replace.setNext(insert);
	len++;
    }
    public Object remove(int n){
	if (n>=len || n<0){
	    return null;
	} Node T = l;
	for (int i=0;i<n-1;i++){
	    T = T.getNext();
	} Object s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	//get(n-1).setNext(get(n).getNext());
	return s;
    }

    //OTHER SOLUTIONS

    public boolean remove(E n){
	Node tmp = l;
	while (tmp.getNext() != null){
	    if (tmp.getNext().getData() == n){
		tmp.setNext(tmp.getNext().getNext());
		return true;
	    }
	} return false;
    }
    /*public boolean remove(int n){
	T = L.getNext();
	T2 = L;
	while (T != null){
	    if (T.getData() == n){
		T2.setNext(T.getNext());
		return true;
	    } T2 = T;
	    T.getNext();
	}
    }*/   

    public int length(){
	return len;
    }
}
