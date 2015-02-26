import java.util.*;
import java.io.*;

public class mergesort{
    private ArrayList<Integer> A = new ArrayList<Integer>();
    private ArrayList<Integer> B = new ArrayList<Integer>();

    public static void main(String[] args){
	mergesort ms = new mergesort();
	System.out.println(ms.A);
	System.out.println(ms.B);
	System.out.println("Merged: " + ms.merge(ms.A,ms.B));
    }
    public mergesort(){
	A.add(1);A.add(3);A.add(5);A.add(7);A.add(22);
	B.add(2);B.add(3);B.add(7);B.add(10);B.add(25);
    }
    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	while (A.size()>0 && B.size()>0){
	    if (A.get(0) <= B.get(0)){
		ai.add(A.get(0));
		A.remove(0);
	    } else{
		ai.add(B.get(0));
		B.remove(0);
	    } 
	} if (A.size()>0){
	    while (A.size()>0){
		ai.add(A.get(0));
		A.remove(0);
	    }
	} else if (B.size()>0){
	    while (B.size()>0){
		ai.add(B.get(0));
		B.remove(0);
	    }
	} return ai;
    }
}
