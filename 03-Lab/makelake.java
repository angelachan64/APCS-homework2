import java.util.*;
import java.io.*;

public class makelake{
    private int[][] field;
    private int elevation,command;

    public static void main(String[] args){
	makelake ml = new makelake();
	ml.makefield(4,6,22,2);
    }
    public void makefield(int R, int C, int E, int N){
	field = new int[R][C];
	elevation = E;
	command = N;
    }
}
