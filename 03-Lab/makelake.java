import java.util.*;
import java.io.*;

public class makelake{
    private int[][] field;
    private int[] num;
    private int elevation,command;

    public static void main(String[] args){
	makelake ml = new makelake(4,6,22,2);
	ml.print();
	ml.stomp(1,4,4);
	//ml.print2();
	System.out.println();
	System.out.println();
	ml.print();
	System.out.println();
	System.out.println();
	ml.stomp(1,1,10);
	ml.print();
	System.out.println();
	ml.volume(field,elevation);
    }
    public  makelake(int R, int C, int E, int N){
	field = new int[][]{{28,25,20,32,34,36},
		{27,25,20,20,30,34},
		{24,20,20,20,20,30},
		{20,20,14,14,20,20}};
	elevation = E;
	command = N;
    }
    public void print(){
	for (int r=0;r<field.length;r++){
	    for (int c=0;c<field[r].length;c++){
		System.out.printf("%4d",field[r][c]);
	    }
	    System.out.printf("\n");
	}
    }
    public void print2(){
	for (int i=0;i<num.length;i++){
	    System.out.print(num[i] + " ");
	}
    }
    public void stomp(int x, int y, int h){
	num = new int[9];
	int count = 0,max,min;
	for (int row=x-1;row<x+2;row++){
	    for (int col=y-1;col<y+2;col++){
		num[count] = field[row][col];
		count++;
	    }
	}
	//System.out.println(findmax(num));
	max = findmax(num);
	min = max - h;
	if (min<0){
	    min = 0;
	}
	for (int rows=x-1;rows<x+2;rows++){
	    for (int cols=y-1;cols<y+2;cols++){
		if (field[rows][cols] > min){
		    field[rows][cols] = min;
		}
	    }
	}
    }
    public int findmax(int[] a){
	int max=-1;
	for (int n=0;n<a.length;n++){
	    if (a[n] > max){
		max = a[n];
	    }
	}
	return max;
    }
    public int volume(int[][] a,int e){
        int sum=0;
	for (int ro=0;ro<a.length;ro++){
	    for (int co=0;co<a[ro].length;co++){
		if (22-a[ro][co] > 0){
		    sum += (22-a[ro][co]);
		}
	    }
	} return 72*72*sum;
    }
}
