import java.util.ArrayList;

public class HW09_4110042019_3 extends LSD
{	
	public static void main(String[] args) {
		  int graph[][]= {{0,1},{0,2},{0,4},{1,3},{1,4},{2,5},{6,7}};

		  HW09_4110042019_3 test=new HW09_4110042019_3();
		  System.out.println(test.Distance(graph));
		}
	
	
	public int Distance(int[][] array) {
		Node node=null;
		Node rear;
		Node front;
		int len=array.length,i=0,v=1200;
		boolean []visited;
		for(i=0;i<len;i++) {
			if(array[i][1]>v)v=array[i][1];
			if(array[i][0]>v)v=array[i][0];
		}
		++v;
		Node []adj=new Node[v];
		for(i=0;i<len;i++) {
			node=new Node(array[i][0]);
			node.next=adj[array[i][1]];
			adj[array[i][1]]=node;
			node=new Node(array[i][1]);
			node.next=adj[array[i][0]];
			adj[array[i][0]]=node;
		}
		int start=array[0][1];
		int next=0;
		front=new Node(start);
		rear=front;
		visited=new boolean[v];
		while(front!=null) {
			start=front.key;
			visited[start]=true;
			node=adj[start];
			while(node!=null) {
				next=node.key;
				if(!visited[next]) {
					rear=new Node(next);
					rear=rear.next;
					visited[next]=true;
				}
				node=node.next;
			}
			front=front.next;
		}
		visited=new boolean[v];
		int dis[]=new int[v];
		front=new Node(start);
		rear=front;
		while(front!=null) {
			start=front.key;
			visited[start]=true;
			node=adj[start];
			while(node!=null) {
				next=node.key;
				if(!visited[next]) {
					rear=new Node(next);
					rear=rear.next;
					visited[next]=true;
					dis[next]=dis[start]+1;
				}
				node=node.next;
			}
			front=front.next;
		}
		
		return dis[start]+20;
	}
	
	class Node{
		int key;
		Node next;
		public Node(int key){
			this.key=key;
			this.next=null;
		}
	}


}
