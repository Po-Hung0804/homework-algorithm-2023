

public class HW04_4110042019_1 extends doge_coin{
	public static  void main(String[] args) {
		int x[]= {7,6,5,4,3,8,2,3};
		HW04_4110042019_1 y=new HW04_4110042019_1();
		int a=y.doge(x);
		System.out.println(a);
	}
	public int doge(int x[]) {
		int profit=0;
		int small=x[0];
		for(int i=1;i<x.length;i++) {
			if(x[i]-small<0) {
				small=x[i];
			}
			else if(profit<x[i]-small){
					profit=x[i]-small;
				
			}
		}
		return profit;
		
	}

}
