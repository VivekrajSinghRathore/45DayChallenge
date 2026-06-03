public class SortColors {
	    public static void sortColors(int[] nums) {
	        int zero_count =0;
	        int one_count =0;
	        int two_count =0;
	        for(int i =0;i<nums.length;i++){
	            if(nums[i]==0){
	                zero_count++;
	            }else if (nums[i]==1){
	                one_count++;
	            }else{
	                two_count++;
	            }
	        }
	        for(int i =0;i<nums.length;i++){
	            if(zero_count>0){
	                nums[i]=0;
	                -- zero_count;
	            }else if(one_count > 0){
	                nums[i]=1;
	                -- one_count;
	            }else if(two_count>0){
	                nums[i]=2;
	                -- two_count;
	            }
	        }
	    }
	    public static void main(String args[]) {
	    	int x[]= {2,0,2,1,1,0};
	    	
	    	sortColors(x);
	    	for(int i=0;i<x.length;i++) {
	    		System.out.print(x[i]+ " ");
	    	}
	 
		    }
}
