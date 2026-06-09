package Vivekraj45DaysChallenge._days_challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityElement2 {

    public static List<Integer> majorityElement(int[] nums) {

        int count1 = 0;
        int count2 = 0;
        int element1 = 0;
        int element2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1) {
                count1++;

            } else if (nums[i] == element2) {
                count2++;

            }

            // FIX 2: assign element1 first if empty
            else if (count1 == 0) {
                element1 = nums[i];
                count1 = 1;

            } else if (count2 == 0) {
                element2 = nums[i];
                count2 = 1;

            } else {
                count1--;
                count2--;
            }
        }

        List<Integer> result = new ArrayList<>();

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element1) count1++;
            if (nums[i] == element2) count2++;
        }

        int min = nums.length / 3 + 1;

        if (count1 >= min) result.add(element1);
        if (count2 >= min && element2 != element1) result.add(element2);

        Collections.sort(result);
        return result;
    }

    public static void main(String args[]) {
        int nums[] = {1, 2, 1, 1, 3, 2};
        System.out.println(majorityElement(nums));
    }
}