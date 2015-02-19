import java.util.*;
import java.io.*;

public class KT{
    private int[][] board;
    private Random rnd = new Random();
    public int size;//,startx,starty;
    public static int startx,starty;
    private boolean solved = false;

    public static void main(String[] args){
	KT kt = new KT();
	Random r = new Random();
	kt.print();
	kt.solve(2,2,1);
    }
    public KT(){
	size = rnd.nextInt(7) + 4;
	//startx = rnd.nextInt(size)+2;
	//starty = rnd.nextInt(size)+2;
	//size = 5;
	board = new int[size+4][size+4];
	/*int n = 1;
	for (int r=0;r<size;r++){
	    for (int c=0;c<size;c++){
		board[r][c] = n;
		n++;
	    }
	}*/
	for (int r=0;r<size+4;r++){
	    for (int c=0;c<size+4;c++){
		if (r<=1 || c<=1 || r>=size+2 || c>=size+2){
		    board[r][c] = -1;
		} else{
		    board[r][c] = 0;
		}
	    }
	}
    }
    public void print(){
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
        for (int row=0;row<size+4;row++){
	    for (int col=0;col<size+4;col++){
		System.out.printf("%4d",board[row][col]);
	    }
	    System.out.printf("\n");
	}
    }
    public void solve(int x, int y, int visited){
	if (board[x][y] != 0 || solved){
	    return;
	}
	board[x][y] = visited;
	//visited++;
	if (visited == size * size){
	    print();
	    solved = true;
	    //print();
	}/* try{
	    Thread.sleep(75);
	} catch (Exception e){}*/
	//print();
	//board[x][y] = visited;
	//visited++;
	solve(x+2,y+1,visited+1);
	solve(x+2,y-1,visited+1);
	solve(x+1,y+2,visited+1);
	solve(x+1,y-2,visited+1);
	solve(x-1,y+2,visited+1);
	solve(x-1,y-2,visited+1);
	solve(x-2,y+1,visited+1);
	solve(x-2,y-1,visited+1);
	if (!solved){
	    board[x][y] = 0;
	    visited--;
	}
    }
}
