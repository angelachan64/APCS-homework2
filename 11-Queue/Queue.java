public class Queue<E>{
    private Node<E> start;
    private Node<E> end;

    public Queue(){
	start = null;
	end = null;
    }
    public Queue(E data){
	start = new Node<E>(data);
	end = start;
    }

    public void enqueue(E data){
	if (size() == 0){
	    start = new Node<E>(data);
	    end = start;
	} else{
	    Node<E> tmp = new Node<E>(data);
	    end.setNext(tmp);
	    end = tmp;
	}
    }
    public E dequeue(){
	E tmp = start.getData();
	start = start.getNext();
	return tmp;
    }
    public boolean empty(){
	return start == null;
    }
    public E head(){
	return start.getData();
    }
    public int size(){
	Node<E> tmp = start;
	int count = 0;
	while (tmp.getNext() != null){
	    tmp = tmp.getNext();
	    count++;
	} return count;
    }
}
