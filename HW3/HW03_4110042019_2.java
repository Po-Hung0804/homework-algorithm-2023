public class HW03_4110042019_2 extends One_0k_rock{
	public static void main(String[] args) {
		String A[]= {"01","1100","1111","0011","00111"};
		HW03_4110042019_1 test=new HW03_4110042019_1();
		boolean x[]=test.one0k(A);
		
	}
	public  boolean valid(String s) {
		int zerolastindex=s.lastIndexOf('0');
		int onefirstindex=s.indexOf('1');
		int n=s.length();
		if(n%2==0) {
			if(zerolastindex==n/2-1&&onefirstindex>zerolastindex) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
		
		
	}

	public boolean[] one0k(String[] str) {
		boolean x[] = new boolean[str.length];
		int i;
		for(i=0;i<str.length;i++) {
			x[i]=valid(str[i]);
		}
		return x;
	}

}