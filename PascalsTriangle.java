package Vivekraj45DaysChallenge._days_challenge;

import java.util.*;

public class PascalsTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> lists = new ArrayList<>();

		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		lists.add(firstRow);
		for (int i = 1; i < numRows; i++) {
			List<Integer> prevList = lists.get(i - 1);
			List<Integer> newRow = new ArrayList<>();
			newRow.add(1);
			for (int j = 0; j < i - 1; j++) {
				newRow.add(prevList.get(j) + prevList.get(j + 1));
			}
			newRow.add(1);
			lists.add(newRow);

		}
		return lists;

	}
	 public static void main(String args[]) {
		 generate(5);
		 
	    }
}
