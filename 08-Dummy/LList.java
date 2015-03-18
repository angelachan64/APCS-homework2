public class LList{
    private Node l=null;
    private int len;

    public LList(){
	Node DN = new Node(-1337);
	DN.setNext(l);
	l = DN;
	len = 0;
    }

    public void add(int s){
	//l = new Node(s);
	//l.setNext(null);
	Node tmp = new Node(s);
	tmp.setNext(l);
	l = tmp;
	len++;
    }

    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l;tmp != null;tmp=tmp.getNext()){
	    s = s+tmp + " --> ";
	} s = s + "null";
	return s;
    }

    public int get(int n){
	int ind = 0;
	Node ret = l;
	while (ind<n && n<len){
	    ret = ret.getNext();
	    ind++;
	} return ret.getData();
    }
    public void add(int n, int s){
	int ind = 0;
	Node insert = new Node(s);
	Node replace = l;
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
    public int remove(int n){
	if (n>=len || n<0){
	    return -1;
	} Node T = l;
	for (int i=0;i<n-1;i++){
	    T = T.getNext();
	} int s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	//get(n-1).setNext(get(n).getNext());
	return s;
    }
    public int length(){
	return len;
    }
}
