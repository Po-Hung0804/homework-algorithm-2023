



public class HW02_4110042019_1 extends FourSum{
	public static void main(String[] args) {
		int []A= {  1 ,0, 2, 4 , 8 ,-3,-1,-4 };
		HW02_4110042019_1 test=new HW02_4110042019_1();
		System.out.println(test.F_sum(A));
	}
	public static void sort(int[] arr) {
	    int max = arr[0], min = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	      if (arr[i] > max) {
	        max = arr[i];
	      }
	      if (arr[i] < min) {
	        min = arr[i];
	      }
	    }
	    int bucketCount = max - min + 1;
	    int[] bucket = new int[bucketCount];
	    for (int i = 0; i < arr.length; i++) {
	      bucket[arr[i] - min]++;
	    }
	    int index = 0;
	    for (int i = 0; i < bucket.length; i++) {
	      for (int j = 0; j < bucket[i]; j++) {
	        arr[index++] = i + min;
	      }
	    }
	  }

	public int F_sum(int[] A) {
		
        int count = 0;
        sort(A);
        int n = A.length;
        for (int i = 0; i < n - 3; i++) {
			if(A[i]>0)break;
            for (int j = i + 1; j < n - 2; j++) {
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int sum =A[i] + A[j] + A[left] + A[right];
                    if (sum == 0) {
                        count++;
                        left++;
                        right--;
                        }
                     else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
       return count;
	}

}
