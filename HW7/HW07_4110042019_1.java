

public class HW07_4110042019_1 extends LLK{
	public static void main(String[] args) {
		int [][]A={{0,0},{1,0},{1,1},{0,1}} ;  
		HW07_4110042019_1 test=new HW07_4110042019_1();
		System.out.println(test.checkLLK(A));
	}

	public boolean checkcollinear(int a1[],int a2[],int a3[]) {
		int x1=a1[0];
		int y1=a1[1];
		int x2=a2[0];
		int y2=a2[1];
		int x3=a3[0];
		int y3=a3[1];
		if(x2-x1==0&&x3-x2==0) {
			return true;
		}
		else {
			return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
		}
	}
	
	
	
	public boolean checkLLK(int[][] array) {
		int i;
		boolean ct=false;
		int n=array.length;
		for(i=0;i<n;i++) {
			int left=i+1;
			int right=n-1;
			while(left<right) {
				if(checkcollinear(array[i],array[left],array[right])) {
					ct=true;
					break;
				}
				else {
					left++;
					right--;
				}
			}
		}
		return ct;
	}

}

