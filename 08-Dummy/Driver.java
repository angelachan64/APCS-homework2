public class Driver{
    public static void main(String[] args){
	LList<Integer> L = new LList<Integer>();
	System.out.println("Empty list: " + L);
	for (int i=0;i<10;i++){
	    L.add(i);
	}
	System.out.println();
	System.out.println("Added elements: " + L);
	
        System.out.println();
	System.out.println("Element at 4: " + L.get(4));
	L.add(4, 9001);
	System.out.println("Updated list: " + L);

	System.out.println();
	L.remove(4);
	System.out.println("Letters removed: " + L);
    }
}
