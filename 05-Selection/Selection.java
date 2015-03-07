import java.util.*;
import java.io.*;

public class Selection{
    public int[] nums;

    public static void main(String[] args){
	Selection s = new Selection(10);
	Random r = new Random();
	//System.out.println(s.print(s.nums));
	int ind = r.nextInt(s.nums.length);
	System.out.println("Finding the number at " + ind);
	System.out.println(s.Select(s.nums,ind,0,s.nums.length-2));
    }
    public Selection(int n){
	Random r = new Random();
	ArrayList<Integer> used = new ArrayList<Integer>();
	int add;
	nums = new int[n];
	for (int i=0;i<n;i++){
	    add = r.nextInt(100);
	    if (used.contains(add)){
		i--;
	    } else{
		nums[i] = add;
		used.add(add);
	    }
	}
    }
    public String print(int[] a){
	String s = "";
	for (int i=0;i<nums.length;i++){
	    s += a[i] + " ";
	} return s;
    }
    public int Select(int[] a, int k, int l, int h){
	try{
	    Thread.sleep(100);
	} catch(Exception e){}
	System.out.println(print(a));
	
	if (l == h){
	    System.out.println();
	    int num = a[k];
	    int swapnum = a[a.length-1];
	    System.out.println("Swap " + num + " with " + swapnum);
	    a[k] = swapnum;
	    a[a.length-1] = num;
	    if (l==k){
		System.out.println("Finished!");
		return a[k];
	    }else{
		System.out.println("Repeat");
		if (l<k){
		    Select(a,k,l,a.length-2);
		} else{
		    Select(a,k,0,l);
		}
	    }
	} else{
	    int comp = a[a.length-1];
	    System.out.println();
	    System.out.println("Comparing: " + comp);
	    System.out.println("Low: " + a[l]);
	    System.out.println("High: " + a[h]);
	    if (a[l] < comp){
		System.out.println("Move low index up one");
		Select(a,k,l+1,h);
	    } else{
		System.out.println("Swap low and high");
		int high = a[l];
		int swap = a[h];
		a[l] = swap; a[h] = high;
		Select(a,k,l,h-1);
	    }
	} return a[k];
    }
}
