class DuplicateNumberInArray {
    public int findDuplicate(int[] nums) {
    	// this algo is called Floyd’s cycle detection 
        int fast = nums[0];
        int slow = nums[0];
        do {
          slow = nums[slow];
          fast = nums[nums[fast]];
        }while(slow != fast);
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }
}