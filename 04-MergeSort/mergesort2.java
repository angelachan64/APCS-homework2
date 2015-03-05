import java.util.*;
import java.io.*;

public class mergesort2{
    private int[] nums;

    public static void main(String[] args){
	mergesort2 ms = new mergesort2(20);
	//System.out.println(ms.A);
	//System.out.println(ms.B);
	//System.out.println("Merged: " + ms.merge(ms.A,ms.B));
	System.out.println(ms);
	//ms.msort(ms.nums);
	System.out.println("Sorted: " + ms.print(ms.msort(ms.nums)));
	//ms.msort(AL);
    }
    public String toString(){
	String s = "";
        for (int i=0;i<nums.length;i++){
	    s+=nums[i] + " ";
	} return s;
    }
    public String print(int[] A){
	String s = "";
	for (int i=0;i<nums.length;i++){
	    s+=A[i] + " ";
	} return s;
    }
    public mergesort2(int n){
	Random r = new Random();
	nums = new int[n];
	//A.add(1);A.add(3);A.add(5);A.add(7);A.add(22);
	//B.add(2);B.add(3);B.add(7);B.add(10);B.add(25);
	for (int i=0;i<n;i++){
		nums[i]=r.nextInt(100);
	}
    }
    public int[] msort(int[] al){
	if (al.length<=1){
	    return al;
	} int half = al.length/2;
	int[] A = new int[half];
	int[] B = new int[al.length-half];
	int i;
	for (i=0;i<half;i++){
	    A[i]=al[i];
	} for (;i<al.length;i++){
	    B[i-half]=al[i];
	} //System.out.println(A);
	//System.out.println(B);
	//System.out.println("Merging...");
	return merge(msort(A),msort(B));
    }
    public int[] merge(int[] A, int[] B){
	int[] ai = new int[A.length+B.length];
	int iA = 0, iB = 0, ia = 0;
	//int count=0,add=0;
	while (iA < A.length && iB < B.length){
	    if (A[iA] <= B[iB]){
		ai[ia] = A[iA];
		iA++;
		ia++;
	    } else{
		ai[ia] = B[iB];
		iB++;
		ia++;
	    } //count++;
	}
	while (iA < A.length){
	    ai[ia] = A[iA];
	    iA++;
	    ia++;
	    //add++;
	}
	while (iB < B.length){
	    ai[ia] = B[iB];
	    iB++;
	    ia++;
	    //add++;
	} //System.out.println(count + " comparisons");
	//System.out.println("Merged: " + ai);
	return ai;
    }
}
