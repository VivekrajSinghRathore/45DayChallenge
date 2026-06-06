package Vivekraj45DaysChallenge._days_challenge;
class Search2DMatrix{
	 public static  boolean searchMatrix(int[][] matrix, int target) {
	        int targetRow = Integer.MIN_VALUE;
	        boolean isFound = false;
	        int rowLength = matrix[0].length;
	        for(int i =0;i<matrix.length;i++){
	            if(matrix[i][rowLength-1] > target ){
	                targetRow = i;
	                break;
	            }
	        }
	        if(targetRow != Integer.MIN_VALUE) {
	        for(int i = 0 ;i<rowLength;i++){
	            if(target == matrix[targetRow][i]){
	            isFound = true;
	            }
	        }
	        }
	        return isFound;
	    }
	 public static void main(String args[]) {
	    	int x[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
	    	int targetValue = 62;
	    	System.out.print(searchMatrix(x,targetValue));
	    	
		    }
}