public class HW10_4110042019_2 extends Buy_Phone{
	 public static void main(String[] args) {
		  int a[][]= {{1,1},{2,4},{2,10},{5,4},{4,8},{5,5},{8,4},{10,2},{10,1}};
		  int b[][]= {{3,1},{4,5},{5,4},{2,11},{9,1}};

		  HW10_4110042019_2 test=new HW10_4110042019_2();
		  int [][]x=test.bestPhone(a);
		  int [][]y=test.bestPhone(b);

		}
	
	 public int[][] bestPhone(final int[][] A){
			final int LEN=A.length, END=LEN-1;
			int i, j, len=LEN;
			for(i=0; i<END; i++){
				for(j=END; j>i; j--){
					if(A[j]==null) continue;
					else if(A[i]==null) { len--; break; }
					else if(A[j][0]>=A[i][0]&&A[j][1]>=A[i][1])
					{ A[i]=null;
					  len--;
					  break;
					}
					else if((A[j][0]==A[i][0]&&A[j][1]<A[i][1])||(A[j][0]<A[i][0]&&A[j][1]==A[i][1])) {
						A[j]=null;
						len--;
						break;
					}
				}
			}
			final int[][] ANS=new int[len][];
			for(i=j=0; i < LEN; ++i)
				if(A[i]!=null){ ANS[j++]=A[i]; }
			return ANS;
		}
		}
