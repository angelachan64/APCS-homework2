import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	Random r = new Random();
	Queue<Integer> q = new Queue<Integer>();
	System.out.println("Empty? " + q.empty());
	for (int i=0;i<10;i++){
	    int add = r.nextInt(10);
	    System.out.println(add);
	    q.enqueue(add);
	}
	System.out.println("Empty? " + q.empty());
	System.out.println("New size? " + q.size());
	System.out.println("First element removed: " + q.dequeue());
	System.out.println("New size? " + q.size());
	System.out.println("First element: " + q.head());
    }
}
