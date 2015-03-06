import java.util.*;
import java.io.*;

/* 1. Choose a pivot value
      - for now, choose any value
   2. Partition the list
      - rearrange so all values less than pivot are on its left and all values
        greater than pivot are on the right
   3. Now pivot is at its proper or final location
   4. Either we're done if pivot is kth smallest or call select on upper or
      lower parts as appropriate
*/

public class Select{
    public ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args){
	Select s = new Select(10);
	System.out.println(s.list);
	s.selection(s.list);
    }
    public Select(int n){
	Random r = new Random();
	int num;
	for (int i=0;i<n;i++){
	    num = r.nextInt(100);
	    if (list.contains(num)){
		i--;
	    } else{
		list.add(num);
	    }
	}
    }
    public int selection(ArrayList<Integer> A){
	Random r = new Random();
	//ArrayList<Integer> al = new ArrayList<Integer>();
	int ind = r.nextInt(A.size());
	int num = A.get(ind);
	A.add(0, A.remove(ind));
	for (int i=1;i<A.size();i++){
	    if (A.get(i)<num){
		A.add(0,A.remove(i));
	    }
	}
	System.out.println(num);
	System.out.println(A);
	return 0;
    }
}
