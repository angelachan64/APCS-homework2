import java.util.*;
import java.io.*;

public class Driver{
    public static void main(String[] args){
	Random r = new Random();
	myStack<Integer> stack = new myStack<Integer>();
	System.out.println("Stack empty? " + stack.empty());
	for (int i=0;i<10;i++){
	    int n = r.nextInt(10);
	    stack.push(n);
	    System.out.println(n);
	}
	System.out.println("Remove last element: " + stack.pop());
	System.out.println("Stack empty? " + stack.empty());
	System.out.println("Last element: " + stack.top());
    }
}
