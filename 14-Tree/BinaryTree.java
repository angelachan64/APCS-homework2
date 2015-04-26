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
	    	while(tmp != null){
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
		}
    }

    public Node search(Node root, int i){
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
    }

    public String toString(){
	return "Root: "+Root;
    }

    public static void main(String[] args){
		BinaryTree tree = new BinaryTree();
		tree.insert(tree.Root,20);
		tree.insert(tree.Root,5);
		tree.insert(tree.Root,30);
		System.out.println(tree);
		System.out.println(tree.search(tree.Root, 30));
    }
}
