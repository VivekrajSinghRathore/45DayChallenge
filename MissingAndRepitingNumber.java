class MissingAndRepeatingNumber {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;
        long expectedSum = n * (n + 1) / 2; // sum of n terms 
        long expectedSqSum = n * (n + 1) * (2 * n + 1) / 6;// sum of square of n terms 
        long actualSum = 0;
        long actualSqSum = 0;
        for (int num : nums) {
            actualSum += num;
            actualSqSum += (long) num * num;
        }

        long diff = expectedSum - actualSum;          // B - A
        long sqDiff = expectedSqSum - actualSqSum;    // B² - A² = (B+A)(B-A) 
        // this logic of finding is important we have used the identity here.

        long sum = sqDiff / diff;                     // B + A

        long missing = (diff + sum) / 2;
        long duplicate = missing - diff;

        return new int[]{(int) duplicate, (int) missing};
    }
}