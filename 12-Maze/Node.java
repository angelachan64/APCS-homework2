public class Node<E>{
    private E data;
    private int x;
    private int y;
    private Node<E> previous;
    private Node<E> next;

    public Node(E s){
	data = s;
	next = null;
    }
    public Node(){
	data = null;
	next = null;
    }

    public void setData(E s){
	data = s;
    }
    public E getData(){
	return data;
    }

    public void setNext(Node<E> n){
	next = n;
    }
    public Node<E> getNext(){
	return next;
    }

    public String toString(){
	return "" + data;
    }
}
