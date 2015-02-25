import java.util.*;
import java.io.*;

public class ctravel{
    private char[][] pasture;
    private int time,min,count;
    private int startx,starty,endx,endy;

    public static void main(String[] args){
	ctravel cow = new ctravel(4,5,6,1,3,1,5);
	System.out.println(cow);
    }
    public ctravel(int N, int M, int T, int x, int y, int x1, int y1){
	time = T;
	startx = x; starty = y;
	endx = x1; endy = y1;
	pasture = new char[][]{
	    {'.','.','.','*','.'},
	    {'.','.','.','*','.'},
	    {'.','.','.','.','.'},
	    {'.','.','.','.','.'}};
    }
    public String toString(){
	String s = "";
	for (int r=0;r<pasture.length;r++){
	    for (int c=0;c<pasture[r].length;c++){
		s += pasture[r][c] + " ";
	    }
	    s += "\n";
	} return s;
    }
    public void solve(int X, int Y){
	int moves=0;
	if (pasture[X][Y] == '*'){
	    moves--;
	    return;
	} if(X == endx && Y == endy){
	    if (moves<=time){
		count++;
	    } else if((time-moves)%2 != 0){
		return;
		moves--;
	    }
	}
	if (moves < time){
	    moves++;
	    if (X<pasture.length-1){
		solve(X+1,Y);
	    } if (X!=0){
		solve(X-1,Y);
	    } if (Y<pasture[0].length-1){
		solve(X,Y+1);
	    } if (Y!= 0){
		solve(X,Y-1);
	    }
	}
    }
}
