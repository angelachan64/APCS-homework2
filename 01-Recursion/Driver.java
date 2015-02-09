import java.util.*;

public class Driver{
    public static void main(String args[]){
	int test,bigtest;
	String string = "asdaaaaasdw";
	Driver d = new Driver();
	Random r = new Random();
	test = r.nextInt(10);
	bigtest = r.nextInt(1000);
	System.out.println("Test value is: " + test);
	System.out.println("fib(test) is: " + d.fib(test));
	//System.out.println("Length of asdfw is: " + d.len(string));
	System.out.println("factorial(test) is: " + d.factorial(test));
	System.out.println("fibonacci(test) is: " + d.fibonacci(test));
	System.out.println("bunnyEars2(test) is: " + d.bunnyEars2(test));
	System.out.println();
	System.out.println("String is: " + string);
	System.out.println("count(string, a) is: " + d.count(string, 'a'));
	System.out.println("strCount(string,a) is: " + d.strCount(string, "a"));
	System.out.println("allStar(string) is: " + d.allStar(string));
	System.out.println();
	System.out.println("Bigtest value is: " + bigtest);
	System.out.println("sumDigits(bigtest) is: " + d.sumDigits(bigtest));
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
	} else if (bunnies%2 == 0){
	    return 3 + bunnyEars2(bunnies-1);
	} else{
	    return 2 + bunnyEars2(bunnies-1);
	}
    }
    public int strCount(String str, String sub){
	int length = sub.length();
	if (str.length() < length){
	    return 0;
	} else if(str.substring(0,length).equals(sub)){
	    return 1 + strCount(str.substring(1), sub);
	} else{
	    return strCount(str.substring(1), sub);
	}
    }
    public int sumDigits(int n){
	if (n/10==0){
	    return n;
	} else{
	    return n%10 + sumDigits(n/10);
	}
    }
    public String allStar(String str){
	if (str.length() == 1){
	    return str;
	} else{
	    return str.substring(0,1) + "*" + allStar(str.substring(1));
	}
    }
}
