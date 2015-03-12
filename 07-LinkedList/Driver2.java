import java.util.*;

public class Driver2{
    public static void main(String[] args){
	LList L = new LList();
	//L.add("hello");
	//System.out.println(L);
	//L.add("world");
        //System.out.println(L);
	for (int i=0;i<10;i++){
	    L.add(""+i);
	}
	System.out.println(L);
    }
}
