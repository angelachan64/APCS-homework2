import java.util.*;
import java.io.*;

public class mergesort{
    private ArrayList<Integer> AL = new ArrayList<Integer>();

    public static void main(String[] args){
	mergesort ms = new mergesort();
	//System.out.println(ms.A);
	//System.out.println(ms.B);
	//System.out.println("Merged: " + ms.merge(ms.A,ms.B));
	System.out.println(ms.AL);
	System.out.println("Sorted: " + ms.msort(ms.AL));
	//ms.msort(AL);
    }
    public mergesort(){
	Random r = new Random();
	//A.add(1);A.add(3);A.add(5);A.add(7);A.add(22);
	//B.add(2);B.add(3);B.add(7);B.add(10);B.add(25);
	for (int i=0;i<20;i++){
		AL.add(r.nextInt(100));
	}
    }
    public ArrayList<Integer> msort(ArrayList<Integer> al){
	if (al.size()==1){
	    return al;
	} int half = al.size()/2;
	ArrayList<Integer> A = new ArrayList<Integer>();
	ArrayList<Integer> B = new ArrayList<Integer>();
	for (int i=0;i<half;i++){
	    A.add(al.get(i));
	} for (int n=half;n<al.size();n++){
	    B.add(al.get(n));
	} return merge (msort(A),msort(B));
    }
    public ArrayList<Integer> merge(ArrayList<Integer> A, ArrayList<Integer> B){
	ArrayList<Integer> ai = new ArrayList<Integer>();
	int iA = 0; int iB = 0;
	//int count=0,add=0;
	while (iA < A.size() && iB < B.size()){
	    if (A.get(0) <= B.get(0)){
		ai.add(A.get(iA));
		iA++;
	    } else{
		ai.add(B.get(iB));
		iB++;
	    } //count++;
	}
	while (iA < A.size()){
	    ai.add(A.get(iA));
	    iA++;
	    //add++;
	}
	while (iB < B.size()){
	    ai.add(B.get(iB));
	    iB++;
	    //add++;
	} //System.out.println(count + " comparisons");
	return ai;
    }
}
