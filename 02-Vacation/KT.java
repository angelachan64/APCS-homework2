import java.util.*;
import java.io.*;

public class KT{
    public int[][] board;
    public int size;
    public Random rnd = new Random();

    public static void main(String[] args){
	KT kt = new KT();
	kt.print();
    }
    public KT(){
	size = rnd.nextInt(7) + 4;
	size = 5;
	board = new int[size][size];
	/*int n = 1;
	for (int r=0;r<size;r++){
	    for (int c=0;c<size;c++){
		board[r][c] = n;
		n++;
	    }
	}*/
	for (int r=0;r<size;r++){
	    for (int c=0;c<size;c++){
		board[r][c] = 0;
	    }
	}
    }
    public void print(){
        for (int row=0;row<size;row++){
	    for (int col=0;col<size;col++){
		System.out.printf("%4d",board[row][col]);
	    }
	    System.out.printf("\n");
	}

    }
}
