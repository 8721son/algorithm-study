import java.util.ArrayDeque;
import java.util.Scanner;

public class BJ1260{
    static int pointCount;
	static int lineCount;
	static int startPoint;
	static boolean[] visit;
	static boolean[][] child;

	static ArrayDeque<Integer> bfsQueue = new ArrayDeque<>();
	
	public static void dfs(int i) {
		visit[i] = true;
		
		System.out.print(i + " ");
		int childLength = child[i].length;
		for (int j=1 ; j<childLength; j++) {
			if(child[i][j]==true) {				
				if (visit[j] == false) {
					dfs(j);
				}
			}
		}
	}
	
	public static void bfs(int i) {
		bfsQueue.addLast(i);
		visit[i] = true;
		while(!bfsQueue.isEmpty()) {
			int visitNode = bfsQueue.pollFirst();
			System.out.print(visitNode+" ");
			for (int j = 0; j < child.length; j++) {
				if(child[visitNode][j]==true && visit[j]==false) {
					bfsQueue.addLast(j);
					visit[j]=true;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		pointCount = sc.nextInt();
		lineCount = sc.nextInt();
		startPoint = sc.nextInt();
		child = new boolean[pointCount + 1][];
		visit = new boolean[pointCount + 1];

		for (int i = 0; i < pointCount + 1; i++) {
			child[i] = new boolean[pointCount + 1];
		}

		for (int i = 0; i < lineCount; i++) {
			int first = sc.nextInt();
			int second = sc.nextInt();

			child[first][second] = true;
			child[second][first] = true;
						
		}
		
		dfs(startPoint);
		System.out.println();
		visit = new boolean[pointCount + 1];
		bfs(startPoint);
	}
}