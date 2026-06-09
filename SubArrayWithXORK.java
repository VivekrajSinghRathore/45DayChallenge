import java.util.*;

class Solution {
    public long subarrayXor(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int xr = 0;
        long count = 0;

        map.put(0, 1); 

        for (int num : arr) {
            xr ^= num;

            count += map.getOrDefault(xr ^ k, 0);

            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }
}