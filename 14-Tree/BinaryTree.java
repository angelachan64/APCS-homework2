import java.util.*;
import java.io.*;

public class BinaryTree{
    private Node Root;

    public BinaryTree(){
	Root = null;
    }
    
    public BinaryTree(int n){
	Root = new Node(n);
    }

    public void insert(Node root, int i){
	if (root==null){
	    Root = new Node(i);
	} else{
	    boolean left=false;
	    Node n = new Node(i);
	    Node tmp=root,piggyback=null;
	    /*while(tmp != null){
		piggyback = tmp;
		if (i<tmp.getData()){
		    tmp = tmp.getLeft();
		    left = true;
		} else{
		    tmp = tmp.getRight();
		    left = false;
		}
	    } if (left){
		piggyback.setLeft(n);
	    } else{
		piggyback.setRight(n);
	    }
	    }*/
	    while (tmp!= null){
		piggyback = tmp;
		if (tmp.getData() == i){
		    return;
		} else if (tmp.getData() < i){
		    tmp = tmp.getRight();
		} else if (tmp.getData() > i){
		    tmp = tmp.getLeft();
		} else{
		    return;
		}
	    } if (i > piggyback.getData()){
		piggyback.setRight(n);
	    } else{
		piggyback.setLeft(n);
	    }
	}
    }

    /*public Node search(Node root, int i){
	while (root!=null){
	    int n = i - root.getData();
	    if (n==0){
		return root;
	    }
	    if(n>0){
		root=root.getRight();
	    } else if (n<0){
		root=root.getLeft();
	    }
	}
	return root;
    }*/

    public Node search(Node t, int i){
	if (t==null || t.getData() == i){
	    return t;
	} else if (i < t.getData()){
	    return search(t.getLeft(), i);
	} else{
	    return search(t.getRight(), i);
	}
    }

    public String toString(){
	return "Root: "+Root;
    }

    /*public String Traverse(Node t){
	if (t == null){
	    return null;
	}else{
	    return t.getData()+"\n"+Traverse(t.getLeft())+" "+Traverse(t.getRight());
	}
    }*/

    public String Traverse(Node t){
	if (t == null){
	    return "";
	} else{
	    return Traverse(t.getLeft())+"\n"+t+"\n"+Traverse(t.getRight());
	}
    }

    public Node remove(int n){
	if (root == null){
	    return root;
	} else{
	    boolean left = null;
	    while(tmp.getData() != i){
		piggyback = tmp;
		if (i<tmp.getData()){
		    tmp = tmp.getLeft();
		    left = true;
		} else{
		    tmp = tmp.getRight();
		    left = false;
		}
	    } if (tmp.getLeft() == null && tmp.getRight() == null){
		if (left){
		    piggyback.setLeft(new Node());
		}
	    }
    }

    public static void main(String[] args){
	BinaryTree tree = new BinaryTree();
	tree.insert(tree.Root,20);
	tree.insert(tree.Root,5);
	tree.insert(tree.Root,30);
	System.out.println(tree);
	System.out.println();
	System.out.println("30? : " + tree.search(tree.Root, 30));
	System.out.println();
	System.out.println("10? : " + tree.search(tree.Root, 10));
	System.out.println();
	System.out.println(tree.Traverse(tree.Root));
    }
}
