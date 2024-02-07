



public class HW06_4110042019_1 extends MedianOfArrays{
	public static void main(String[] args) {
		int [][] x= {{3},{-1,5},{-2, 5, 12}};
		HW06_4110042019_1 a=new HW06_4110042019_1();
		double y=a.find_median(x);
		System.out.println(y);
	}

	public  double find_median(int[][] arr) {
		int totalarrays=arr.length;
		int halfarrays=totalarrays/2;
		int []a1=arr[0];
		for(int i=1;i<halfarrays;i++) {
			a1=mergeArray(a1,arr[i]);
		}
		int []a2=arr[halfarrays];
		for(int j=halfarrays+1;j<totalarrays;j++) {
			a2=mergeArray(a2,arr[j]);
		}
		double an=0.0;
		an=findMedianSortedArrays(a1,a2);
		
		
		return an;
		
	}
	
	public static int [] mergeArray(int arr1[],int arr2[]) {
		int n1=arr1.length;
		int n2=arr2.length;
		int i=0,j=0,k=0;
		int arr3[]=new int [n1+n2];
		
		while(i<n1&&j<n2) {
			if(arr1[i]<=arr2[j]) {
				arr3[k]=arr1[i];
				i++;
			}
			else {
				arr3[k]=arr2[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr3[k]=arr2[j];
			k++;
			j++;
		}
		
		return arr3;
		
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    int index1 = 0;
	    int index2 = 0;
	    int med1 = 0;
	    int med2 = 0;
	    for (int i=0; i<=(nums1.length+nums2.length)/2; i++) {
	        med1 = med2;
	        if (index1 == nums1.length) {
	            med2 = nums2[index2];
	            index2++;
	        } else if (index2 == nums2.length) {
	            med2 = nums1[index1];
	            index1++;
	        } else if (nums1[index1] < nums2[index2] ) {
	            med2 = nums1[index1];
	            index1++;
	        }  else {
	            med2 = nums2[index2];
	            index2++;
	        }
	    }
	    if ((nums1.length+nums2.length)%2 == 0) {
	        return (med1+med2)/2;
	    }

	    return med2;
	}

}