package Vivekraj45DaysChallenge._days_challenge;

import java.util.*;

public class Set_Matrix_Zero {
	 public static void  setZeroes(int[][] matrix) {
	        int m = matrix.length;
	        int n = matrix[0].length;
	        boolean first_row = false;
	        boolean first_col = false;
	        for(int i =0;i< n ;i++) {
	        	if(matrix[0][i] == 0) {
	        		first_row = true;
	        	}
	        }
	        for(int i =0;i< m ;i++) {
	        	if(matrix[0][i] == 0) {
	        		first_col = true;
	        	}
	        }
	        for(int i=0;i<m;i++) {
	        	for(int j=0;j<n;j++) {
	        		if(matrix[i][j] ==0 ) {
	        			matrix[i][0] =0;
	        			matrix[0][j]=0;
	        		}
	        	}
	        }
	        for (int i = 1; i < m; i++) {
	            for (int j = 1; j < n; j++) {
	                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
	        if(first_row) {
	        	for(int i =0;i< n ;i++) {
	        		matrix[0][i] = 0;
		        }
	        }
	        if(first_col) {
	        	for(int i =0;i< m ;i++) {
	        		matrix[i][0] = 0;
		        }
	        }
	    }
	    public static void main(String args[]) {
	    	int x[][] = {{1,2,3,4},{5,6,0,8},{9,10,11,12}};
	    	setZeroes(x);
	    	for(int i=0;i<x.length;i++){
		        for(int j=0;j<x[i].length;j++){
		        	System.out.print(x[i][j]+"  ");
		        }
		        System.out.println();
		       }
	    }
}