public class RotateImage {
	public static void rotate(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			int left = 0;
			int right = matrix.length - 1;
			while (left < right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right] = temp;

				left++;
				right--;
			}
		}
	}

	public static void main(String args[]) {
		//int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		//int matrix[][] = { { 1, 2, 3}, { 4,5, 6 }, { 7,8,9}};
		int matrix[][]= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}