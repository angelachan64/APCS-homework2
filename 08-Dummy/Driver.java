public class Driver{
    public static void main(String[] args){
	LList L = new LList();
	System.out.println(L);
	for (int i=0;i<10;i++){
	    L.add("" + i);
	}
	System.out.println(L);
    }
}
