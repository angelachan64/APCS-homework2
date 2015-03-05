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
    }
    public Select(int n){
	Random r = new Random()
	for (int i=0;i<n;i++){
		list.add(r.nextInt(100));
	}
    }
    public int selection(ArrayList<Integer> A){

    }
}
