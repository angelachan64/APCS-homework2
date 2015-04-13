import java.util.*;
import java.io.*;

public class Maze{
    private char[][]board;
    private int maxX;
    private int maxY;
    private char wall=' ';
    private char exit='$';
    private char path='#';
    private char me='z';
    private char visited='.';
    private boolean solved = false;

    public Maze(){
	maxX=40;
	maxY=20;
	board=new char[maxX][maxY];
	try{
	    Scanner sc = new Scanner(new File("maze.dat"));
	    int j=0;
	    while (sc.hasNext()){
		String line = sc.nextLine();
		for (int i=0;i<maxX;i++){
		    board[i][j] = line.charAt(i);
		}
		j++;
	    }
	} catch (Exception e){}
    }
    public String toString(){
	//String s = "[2J\n";
	String s = "[2J\n";
	//s = s + "[31;43m";
	for (int y=0;y<maxY;y++){
	    for (int x=0;x<maxX;x++){
		s = s + board[x][y];
	    }
	    s=s+"\n";
	} return s;
    }
    public void solve(int x, int y){
	/*try{
	    Thread.sleep(50);
	} catch (Exception e){}*/
	if (board[x][y]==wall    ||
	    board[x][y]==me      ||
	    board[x][y]==visited ||
	    solved){
	    return;
	} if (board[x][y]==exit){
	    System.out.println(this);
	    //System.exit(0);
	    solved = true;
	}
	try{
	    Thread.sleep(50);
	} catch (Exception e){}
	System.out.println(this);
	board[x][y]=me;
	solve(x+1,y);
	solve(x-1,y);
	solve(x,y-1);
	solve(x,y+1);
	if (!solved){
	    board[x][y]=visited;
	}
    }

    public void bfs(int x, int y){
	frontier f = new frontier();

	//add initial node to the frontier
	f.add(new Node(x,y));

	board[x][y] = 'x';
	Node current = null;
	int tx=0,ty=0;


	while(!f.isEmpty()){
	    current = f.remove();
	    int cx = current.getX();
	    int cy = current.getY();

	    if(board[cx][cy]==exit){
		break;
	    }

	    board[cx][cy] = 'z';
	    Node tmp;

	    tx = cx+1;
	    ty = cy;
	    if(board[tx][ty]==path || board[tx][ty]==exit){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    tx = cx-1;
	    ty = cy;
	    if(board[tx][ty]==path || board[tx][ty]==exit){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    tx = cx;
	    ty = cy+1;
	    if(board[tx][ty]==path || board[tx][ty]==exit){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    tx = cx;
	    ty = cy-1;
	    if(board[tx][ty]==path || board[tx][ty]==exit){
		tmp = new Node(tx,ty);
		tmp.setPrev(current);
		f.add(tmp);
	    }

	    try{
		Thread.sleep(20);
	    } catch (Exception e){}
	    System.out.println(this);
	}
	//recover the path
	for (Node p = current.getPrev();p != null;p = p.getPrev()){
	    board[p.getX()][p.getY()]='P';
	    try{
		Thread.sleep(100);
	    } catch (Exception e){}
	    System.out.println(this);
	}
    }

    public static void main(String[] args){
	Maze m = new Maze();
	System.out.println(m);
	//m.solve(1,1);
	m.bfs(1,1);
	System.out.println(m);
    }
}
