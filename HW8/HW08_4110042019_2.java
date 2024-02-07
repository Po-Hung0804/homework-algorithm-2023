

public class HW08_4110042019_2 extends MaxLandArea{
	   public static void main(String[] args) {
  int[][] matrix = {{0,1,1},
					{1,0,1},
					{0,1,1}}  ;
  HW08_4110042019_2 test=new HW08_4110042019_2();
		System.out.println(test.maxLandArea(matrix));
}

		public int maxLandArea(int[][] grid) {
	        int row = grid.length;
	        int col = grid[0].length;
	        int maxArea = 0;
	        for(int i = 0; i < row ; i++){
	            for(int j = 0 ; j < col ; j++){
	                if(grid[i][j] == 1){
	                    int area = traverseDFS(grid, i, j);
	                    if(area> maxArea){
	                        maxArea = area;
	                    }
	                }
	            }
	        }
	        return maxArea;
	    }

	    public int traverseDFS(int[][] grid, int x, int y){
	        if(x<0 || x>grid.length-1 || y <0 || y >grid[0].length-1 ){
	            return 0;
	        }

	        if(grid[x][y] == 0){
	            return 0;
	        }

	        grid[x][y]=0;

	        return 1+traverseDFS(grid,x, y-1) + traverseDFS(grid,x, y+1) + traverseDFS(grid,x-1, y) + traverseDFS(grid,x+1, y);
	    }
}