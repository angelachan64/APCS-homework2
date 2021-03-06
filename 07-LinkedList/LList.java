public class LList{
    private Node l=null;
    private int len;

    public void add(String s){
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

    public Node find(int n){
	int ind = 0;
	Node ret = l;
	while (ind<n && n<len){
	    ret = ret.getNext();
	    ind++;
	} return ret;
    }
    public void insert(int n, String s){
	int ind = 0;
	Node insert = new Node(s);
	Node replace = l;
	if (n == 0){
	    add(s);
	}
	else{
	    while (ind < n-1){
		replace = replace.getNext();
		ind++;
	    } insert.setNext(replace.getNext());
	    replace.setNext(insert);
	} len++;
    }
}
