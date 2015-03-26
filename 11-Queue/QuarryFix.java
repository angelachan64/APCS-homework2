public class QuarryFix{
    private int head,tail;
    private int[] queue;

    public QuarryFix(){
	head = 0; tail = 0;
	queue = new int[10];
    }
    public QuarryFix(int n){
	head = 0; tail = 0;
	queue = new int[n];
    }

    public String toString(){
	String s = "Start <-- ";
	for (int i=head;i<tail;i++){
	    s += "" + queue[i] + " <-- ";
	} return s + "END";
    }

    public void enqueue(int dat){
	if (tail<queue.length){
	    queue[tail] = data;
	    tail++;
	} else{
	    throw new IndexOutOfBoundsException();
	}
    }
    public int dequeue(){
	if (head < tail){
	    
	} return 0;
    }
    public boolean empty(){
	return head == tail;
    }
    public int head(){
	if (head < tail){
	    return queue[head];
	} else{
	    throw new IndexOutOfBoundsException();
	}
    }
}
