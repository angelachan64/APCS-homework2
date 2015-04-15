import java.util.*;
import java.io.*;

public class Node{
    private int x,y;
    private Node prev,next;
    private int priority;

    public Node(int x, int y){
	this.x = x;
	this.y = y;
	priority = Math.sqrt((26-x)*(26-x) + (18-y)*(18-y));
    }

    public int getX(){
	return x;
    }
    public int getY(){
	return y;
    }

    public Node getPrev(){
	return prev;
    }
    public void setPrev(Node n){
	prev = n;
    }

    public Node getNext(){
	return next;
    }
    public void setNext(Node n){
	next = n;
    }

    public int getPriority(){
	return priority;
    }
}