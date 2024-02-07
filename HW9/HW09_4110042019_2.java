public class HW09_4110042019_2 extends LSD
{
	 public static void main(String[] args) {
		  int graph[][]= {{0,1},{0,2},{0,4},{1,3},{1,4},{2,5},{6,7}};

		  HW09_4110042019_2 test=new HW09_4110042019_2();
		  System.out.println(test.Distance(graph));
		}
	
	
	public int Distance(int[][] array) {
		Node node=null,rear,front;;
		int len=array.length,i=0,V = 120; 
		boolean[] mark;

		for(i=0;i<len;++i) {
			if(array[i][1]>V) V=array[i][1];
			if(array[i][0]>V) V=array[i][0];
		}
		++V;
		Node[] adj=new Node[V];

		for(i=0;i<len;++i) {
			node=new Node(array[i][1]);node.next=adj[array[i][0]];adj[array[i][0]]=node;
			node=new Node(array[i][0]);node.next=adj[array[i][1]];adj[array[i][1]]=node;
		}
	
		int v=array[0][1],next=0;
		front=new Node(v);rear=front;
		mark=new boolean[V];
		while(front!=null) {
			v=front.key;mark[v]=true;node=adj[v];
			while(node!=null) {
				next=node.key;
				if(!mark[next]) {
					rear.next=new Node(next);rear=rear.next;
					mark[next]=true;
				}
				node=node.next;
			}
			front=front.next;
		}
		mark=new boolean[V];
		int[] dis=new int[V];
		front=new Node(v);rear=front;
		while(front!=null) {
			v=front.key;mark[v]=true;node=adj[v];
			while(node!=null) {
				next=node.key;
				if(!mark[next]) {
					rear.next=new Node(next);rear=rear.next;
					mark[next]=true;dis[next]=dis[v]+1;
				}
				node=node.next;
			}
			front=front.next;
		}
		return dis[v];
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