



public class HW10_4110042019_1 extends Buy_Phone{
	 public static void main(String[] args) {
		  int a[][]= {{1,1},{2,4},{2,10},{5,4},{4,8},{5,5},{8,4},{10,2},{10,1}};
		  int b[][]= {{3,1},{4,5},{5,4},{2,11},{9,1}};

		  HW10_4110042019_1 test=new HW10_4110042019_1();
		  int [][]x=test.bestPhone(a);
		  int [][]y=test.bestPhone(b);

		}
	 final int[][]REV=new int[1000][];
	 public int[][]bestPhone(final int[][]A){
			mergeSort(A);
			int len=A.length-1,count=len-1;
			for(int i=count,min=(REV[len]=A[len])[1];i>-1;i--)
				if(A[i][1]>min){min=A[i][1];REV[count--]=A[i];}
			
			final int[][]ans=new int[len-=count++][];
			System.arraycopy(REV,count,ans,0,len);
			int alen=ans.length-1;
			
			
			return ans;
		}
	 public void mergeSort(final int[][]A){
		 	if(A.length<2)return;
			int i,j,k;
			
			final int MID=A.length/2,LEFT[][]=new int[MID][],RIGHT[][]=new int[A.length-MID][];
			
			for(i=0;i<MID;i++)
				LEFT[i]=A[i];
			for(i=MID;i<A.length;i++)
				RIGHT[i-MID]=A[i];
			mergeSort(LEFT);
			mergeSort(RIGHT);
			i=j=k=0;
			while(i<LEFT.length&&j<RIGHT.length)
				A[k++]=LEFT[i][0]<RIGHT[j][0]?LEFT[i++]:RIGHT[j++];
			while(i<LEFT.length)
				A[k++]=LEFT[i++];
			while(j<RIGHT.length)
				A[k++]=RIGHT[j++];
		}
}
