import java.util.*;

class Solution {

    public int longestConsecutive(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int longest = 0;
        for (int value : set) {
            if (!set.contains(value - 1)) {
                int cnt = 1;
                int x = value;
                while (set.contains(x + 1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}