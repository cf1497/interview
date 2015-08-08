package leetcode;

public class Sort {
	
	public static void main(String[] args){
		int[] nums = {2,1,5,3,7,8,6,9};
		for(int item : nums){
			System.out.print(item+" ");
		}
		System.out.println();
		selectionSort(nums);
		for(int item : nums){
			System.out.print(item+" ");

		}
		
	}
	
	public static void selectionSort(int[] nums){
		
		for(int i =0; i<nums.length; i++){
			int min_index = i;
			for(int j=i+1; j<nums.length; j++){
				if(nums[min_index]>nums[j]){
					min_index = j;
				}
			}
			swap(nums, i, min_index);
		}
		
	}
	
	public static void swap(int[] nums, int a, int b){
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
	}

}
