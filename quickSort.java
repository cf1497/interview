package leetcode;

public class quickSort {
	
      public static void partition(int[] nums, int start, int end){
    	  if(start>=end){
    		  return;
    	  }
    	  
    	  int m = start;
    	  
    	  for(int i=start; i<=end; i++){
    		  if(nums[i]<nums[start]){
    			  m++;
    			  swap(nums, i, m);
    		  }
    	  }
    	  
    	  swap(nums, start, m);
    	  
    	  partition(nums,start,m-1);
    	  partition(nums,m+1,end);
      } 
      
      public static void swap(int[] nums, int a, int b){
    	  int tmp = nums[a];
    	  nums[a] = nums[b];
    	  nums[b] = tmp;
      }
      
      public static void quickSort(int[] nums){
    	  partition(nums, 0, nums.length-1);
      }
      
      public static void main(String[] args){
    	  int[] nums = {2,1,5,3,7,8,6,9};
    	  quickSort(nums);
    	  
    	  for(int item : nums){
    		  System.out.print(item+" ");
    	  }
      }
}
