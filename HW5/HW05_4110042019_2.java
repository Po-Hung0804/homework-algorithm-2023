

public class HW05_4110042019_2 extends littlebit{
	public static void main(String[] args) {
		int x[]= {2,5,1,6,4,8};
		HW05_4110042019_2 y=new HW05_4110042019_2();
		int a=y.l_bit(x);
		System.out.println(a);
	}
	
	public int l_bit(int[] A) {
		int a[]=new int [A.length];
		for(int i=0;i<A.length;i++) {
			a[i]=1;
		}
		for(int i=0;i<A.length-1;i++) {
			if(A[i+1]>=A[i]) {
				if(A[i+1]==A[i]) {
					a[i+1]=a[i];
				}
				else {
				a[i+1]=a[i]+1;
			}

		}
		}
		for(int i=A.length-1;i>0;i--) {
			if(A[i-1]>A[i]) {
				if(a[i-1]<(a[i]+1)) {
					a[i-1]=a[i]+1;
				}
			}
		}
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

}