import java.util.*;
import java.io.*;

public class Tree{
    private Node root;

    public Tree(){
	root = null;
    }
    public Tree(int n){
	root = new Node(n);
    }

    public void add(Node root, int i){
	Node tmp = new Node(i);
	if (root == null){
	    root = tmp;
	} else{
	    if(root.getLeft() == null){
		root.setLeft(tmp);
	    } else if(root.getRight() == null){
		root.setRight(tmp);
	    } else{
		Random r = new Random();
		if (r.nextInt(2) == 0){
		    add(root.getLeft(), i);
		} else{
		    add(root.getRight(), i);
		}
	    }
	}
    }

    public int maxvalue(Node t){
	return 0;
    }
    public int height(Node t){
	return 0;
    }
    public String maxpath(Node t){
	return "";
    }
    public void splitdupes(Node t){

    }

    public String toString(){
	return "Root: "+root;
    }

    public static void main(String[] args){
	Tree tree = new Tree();
	Random r = new Random();
	for (int i=0;i<10;i++){
	    tree.add(tree.root, r.nextInt(10));
	}
	System.out.println(tree);
    }
}
