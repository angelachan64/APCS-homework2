public class Node{
    private int data;
    private Node left,right;

    public Node(){
	data = null;
	left = null;
	right = null;
    }
    public Node(int n){
	data = n;
	left = null;
	right = null;
    }
    public Node(int n, Node l, Node r){
	data = n;
	left = l;
	right = r;
    }

    public int getData(){
	return data;
    }
    public void setData(int n){
	data = n;
    }

    public Node getLeft(){
	return left;
    }
    public void setLeft(Node L){
	left = L;
    }

    public Node getRight(){
	return right;
    }
    public void setRight(Node R){
	right = R;
    }

    /*public String toString(){
	return ""+data+"\n"+"Left: "+left+"\n"+"Right: "+right;
	}*/
    public String toString(){
	return ""+data;
    }
}
