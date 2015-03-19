import java.lang.System;
import java.util.*;
import java.io.*;

public class DriverSum{
    public static void main(String[] args){
	LList L = new LList();
	ArrayList<Integer> AL = new ArrayList<Integer>();
	LinkedList<Integer> LL = new LinkedList<Integer>();
	int num; Random r = new Random();

	for (int i=0;i<2500;i++){
	    num = r.nextInt(10);
	    AL.add(num);
	}
	for (int i=0;i<250;i++){
	    num = r.nextInt(10);
	    LL.add(num);
	}
	for (int i=0;i<150;i++){
	    num = r.nextInt(10);
	    L.add(num);
	}

	long start,elapsed;
	int sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<AL.size();i++){
	    sum += AL.get(i);
	} elapsed = System.currentTimeMillis()-start;
	System.out.println("Time elapsed for ArrayList: " + elapsed);

	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<LL.size();i++){
	    sum = sum + LL.get(i);
	} elapsed = System.currentTimeMillis()-start;
	System.out.println("Time elapsed for LinkedList: " + elapsed);

	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<L.length();i++){
	    sum += L.get(i);
	} elapsed = System.currentTimeMillis()-start;
	System.out.println("Time elapsed for LList: " + elapsed);

	System.out.println();
	System.out.println("It takes about 1 millisecond for ArrayList to do 2500 objects, about 1 millisecond for LinkedList to do 250 objects, and about 1 millisecond for LList to do 150 objects.");
	System.out.println();

	AL = new ArrayList<Integer>();
	LL = new LinkedList<Integer>();
	L = new LList();

	for (int i=0;i<10000;i++){
	    num = r.nextInt(10);
	    AL.add(num); LL.add(num); L.add(num);
	}

	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<AL.size();i++){
	    sum += AL.get(i);
	} elapsed = System.currentTimeMillis()-start;
	System.out.println("ArrayList for 10,000 elements: " + elapsed);

	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<LL.size();i++){
	    sum += LL.get(i);
	} elapsed = System.currentTimeMillis()-start;
	System.out.println("LinkedList for 10,000 elements: " + elapsed);

	sum = 0;
	start = System.currentTimeMillis();
	for (int i=0;i<L.length();i++){
	    sum += L.get(i);
	} elapsed = System.currentTimeMillis()-start;
	System.out.println("LList for 10,000 elements: " + elapsed);
	
    }
}
