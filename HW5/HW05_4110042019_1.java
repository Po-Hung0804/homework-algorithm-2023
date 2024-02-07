
public class HW05_4110042019_1 extends littlebit{
	public static void main(String[] args) {
		int x[]= {33,23,23,2};
		HW05_4110042019_1 y=new HW05_4110042019_1();
		int a=y.l_bit(x);
		System.out.println(a);
	}
	public int l_bit(int ratings[]) {
		
		int n = ratings.length;
	    int[] ansLeft = new int[n];
	    int[] ansRight = new int[n];
	    ansLeft[0] = 1;
	    ansRight[n-1] = 1;
	    for(int i = 1; i < n; i++){
	        if(ratings[i] > ratings[i-1]){
	            ansLeft[i] = ansLeft[i-1] + 1;
	        }else if(ratings[i]==ratings[i-1]){
	            ansLeft[i]=ansLeft[i-1];
	        }
	        else {
	        	ansLeft[i]=1;
	        }
	    }
	    
	    for(int i = n-2; i >= 0; i--){
	        if(ratings[i] > ratings[i+1]){
	            ansRight[i] = ansRight[i+1] + 1;
	        }else if(ratings[i]==ratings[i+1]){
	            ansRight[i]=ansRight[i+1];
	        }
	        else {
	        	ansRight[i]=1;
	        }
	    }
	    
	    int ans = 0;
	    for(int i = 0; i < n; i++){
	        ans += Math.max(ansLeft[i], ansRight[i]);
	    }
	    return ans;

	}
	
	

}
