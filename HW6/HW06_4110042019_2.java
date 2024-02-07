
public class HW06_4110042019_2 extends MedianOfArrays{
	public static void main(String[] args) {
		int [][] x= {{1,3,10},{-1,5,7},{-2,6,12}};
		HW06_4110042019_2 a=new HW06_4110042019_2();
		double y=a.find_median(x);
		System.out.println(y);
	}

	public double find_median(int[][] arrays) {
	    int totalLength = 0;
	    for (int[] array : arrays) {
	        totalLength += array.length;
	    }
	    if (totalLength % 2 == 0) {
	        return (findKthElement(arrays, totalLength / 2) + findKthElement(arrays, totalLength / 2 + 1)) / 2.0;
	    } else {
	        return findKthElement(arrays, totalLength / 2 + 1);
	    }
	}

	private int findKthElement(int[][] arrays, int k) {
	    int left = Integer.MAX_VALUE, right = Integer.MIN_VALUE;
	    for (int[] array : arrays) {
	        left = Math.min(left, array[0]);
	        right = Math.max(right, array[array.length - 1]);
	    }
	    while (left < right) {
	        int mid = left + (right - left) / 2;
	        int count = 0;
	        for (int[] array : arrays) {
	            count += binarySearch(array, mid);
	        }
	        if (count >= k) {
	            right = mid;
	        } else {
	            left = mid + 1;
	        }
	    }
	    return left;
	}

	private int binarySearch(int[] array, int target) {
	    int left = 0, right = array.length - 1;
	    while (left <= right) {
	        int mid = left + (right - left) / 2;
	        if (array[mid] == target) {
	            return mid + 1;
	        } else if (array[mid] < target) {
	            left = mid + 1;
	        } else {
	            right = mid - 1;
	        }
	    }
	    return left;
	}
	
	
}