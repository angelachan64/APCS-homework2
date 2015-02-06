import java.util.*;

public class Driver{
    public static void main(String args[]){
	int test;
	String string = "asdaaaaasdw";
	Driver d = new Driver();
	Random r = new Random();
	test = r.nextInt(10);
	System.out.println("Test value is: " + test);
	System.out.println("Fib(test) is: " + d.fib(test));
	//System.out.println("Length of asdfw is: " + d.len(string));
	System.out.println("factorial(test) is: " + d.factorial(test));
	System.out.println("count(asdfwioeasdfw, a) is: " + d.count(string, 'a'));
	System.out.println("fibonacci(test) is: " + d.fibonacci(test));
    }
    public int factorial(int n){
	if(n == 0){
	    return 1;
	} else{
	    return n * factorial(n-1);
	}
    }
    public int fib (int n){
	if (n < 0){
	    return -1;
	} else if (n < 2){
	    return 1;
	} else{
	    return fib(n-1) + fib(n-2);
	}
    }
    public int len(String s){
	if (s.equals("")){
	    return 0;
	} else{
	    return 1 + len(s.substring(1));
	}
    }
    public int count(String s, char c){
	if (s.equals("")){
	    return 0;
	} else if (s.charAt(0) == c){
	    return 1 + count(s.substring(1), c);
	} else{
	    return count (s.substring(1), c);
	}
    }
    public int fibonacci(int n){
	if (n <= 0){
	    return 0;
	} else if (n == 1){
	    return 1;
	} else{
	    return fibonacci(n-1) + fibonacci(n-2);
	}
    }
    public int bunnyEars2(int bunnies){
	if (bunnies <= 0){
	    return 0;
	}
    }
}
