

public class HW01_4110042019 extends ArrayData{
	public static void main(String[] args) {
		int []A= {100,5,2222,45,666,90};
		HW01_4110042019 test=new HW01_4110042019(A);
		System.out.println(test.max());
		System.out.println(test.min());
	}
	public  HW01_4110042019(int[] A) {
		this.A=A;
	}

	public int max() {
		int i;
		int temp=A[0];
		for(i=1;i<A.length;i++) {
			if(temp<A[i]) {
				temp=A[i];
			}
		}
		return temp;
	}


	public int min() {
		int i;
		int temp=A[0];
		for(i=1;i<A.length;i++) {
			if(temp>A[i]) {
				temp=A[i];
			}
		}
		return temp;
	}
	
}
