

public class HW08_4110042019_1 extends MaxLandArea{
	   public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1},
                {1, 0, 1},
                {0, 1, 1}
        };
        HW08_4110042019_1 test=new HW08_4110042019_1();
		System.out.println(test.maxLandArea(matrix));
    }

		public int maxLandArea(int[][] array) {
			 int maxArea = 0;
		        int numRows = array.length;
		        int numCols = array[0].length;
		        boolean[][] visited = new boolean[numRows][numCols];

		        for (int row = 0; row < numRows; row++) {
		            for (int col = 0; col < numCols; col++) {
		                if (array[row][col] == 1 && !visited[row][col]) {
		                    int area = getConnectedLandArea(array, visited, row, col);
		                    maxArea = Math.max(maxArea, area);
		                }
		            }
		        }

		        return maxArea;
			 
		
  }
		public  int getConnectedLandArea(int[][] terrain, boolean[][] visited, int row, int col) {
	        int area = 0;

	        if (row < 0 || row >= terrain.length || col < 0 || col >= terrain[0].length || visited[row][col] || terrain[row][col] == 0) {
	            return area;
	        }

	        visited[row][col] = true;
	        area++;

	        area += getConnectedLandArea(terrain, visited, row - 1, col);
	        area += getConnectedLandArea(terrain, visited, row + 1, col);
	        area += getConnectedLandArea(terrain, visited, row, col - 1);
	        area += getConnectedLandArea(terrain, visited, row, col + 1);

	        return area;
	    }
}






