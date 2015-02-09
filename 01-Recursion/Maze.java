public class Maze{
    private char[][]board;
    private int maxX;
    private int maxY;
    public Maze(){
	maxX=40;
	maxY=20;
	board=newchar[maxX][maxY];
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
	String s = "[2J\n";
	s = s + "[31;43m";
	for (int y=0;y<maxY;y++){

	}
}
