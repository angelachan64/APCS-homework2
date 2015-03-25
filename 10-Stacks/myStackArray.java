import java.util.*;

public class myStackArray{
    private int[] stack;

    public myStackArray(){
	stack = new int[0];
    }
    public myStackArray(int n){
	stack = new int[1];
	stack[0] = n;
    }

    public void push(int n){
	int[] tmp = new int[stack.length + 1];
	for (int i=0;i<=stack.length;i++){
	    if (i == stack.length){
		tmp[i] = n;
	    } else{
		tmp[i] = stack[i];
	    }
	}
	stack = tmp;
    }
    public int pop(){
	if (empty()){
	    throw new EmptyStackException();
	}
	else{
	    int n = stack[stack.length-1];
	    int[] tmp = new int[stack.length-1];
	    for (int i=0;i<tmp.length;i++){
		tmp[i] = stack[i];
	    } stack = tmp;
	    return n;
	}
    }
    public boolean empty(){
	return stack.length == 0;
    }
    public int top(){
	return stack[stack.length-1];
    }
}
