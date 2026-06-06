package Vivekraj45DaysChallenge._days_challenge;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int count =0;
        int majorityElement = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++) {
        	if(count ==0) {
        		majorityElement = nums[i];
        	}
            if(majorityElement == nums[i]) {
            	count++;
            }else {
            	count--;
            }
            
        	
        }
        return majorityElement;
    }
	 public static void main(String args[]) {
	    	int x[]= {2,2,1,1,1,2,2};
	    	System.out.print(majorityElement(x));
	    	
		    }
}
