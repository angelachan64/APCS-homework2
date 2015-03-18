public class LList{
    private Node l=null;
    private int len;

    public LList(){
	Node DN = new Node("DummyNode");
	DN.setNext(l);
	l = DN;
	len = 0;
    }

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

    public Node get(int n){
	int ind = 0;
	Node ret = l;
	while (ind<n && n<len){
	    ret = ret.getNext();
	    ind++;
	} return ret;
    }
    public void add(int n, String s){
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
    public String remove(int n){
	if (n>=len || n<0){
	    return "Error: Index Out of Range";
	} Node T = l;
	for (int i=0;i<n-1;i++){
	    T = T.getNext();
	} String s = T.getNext().getData();
	T.setNext(T.getNext().getNext());
	//get(n-1).setNext(get(n).getNext());
	return s;
    }
}
