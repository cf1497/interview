package leetcode;

public class MergeSort {
	
	public static void merge(int[] nums, int low, int mid, int high){
		int[] helper = new int[nums.length];
		for(int i=low; i<=high; i++){
			helper[i] = nums[i];
		}
		
		int i = low, j = mid+1;
		for(int k=low; k<=high; k++){
			if(i>mid){
				nums[k] = helper[j];
				j++;
			}
			else if(j>high){
				nums[k] = helper[i];
				i++;
			}
			else if(helper[i]>helper[j]){
				nums[k] = helper[j];
				j++;
			}else{
				nums[k] = helper[i];
				i++;
			}
		}
		
	}
	
	public static void sort(int[] nums, int low , int high){
		if(low>=high){
			return;
		}
		
		int mid = (low+high)/2;
		sort(nums, low, mid);
		sort(nums, mid+1, high);
		merge(nums, low, mid, high);
		
	}
	
	public static void mergeSort(int[] nums){
		sort(nums, 0 ,nums.length-1);
	}
	
	public static void main(String[] args){
		int[] nums = {2,1,5,3,7,8,6,9};
		for(int items:nums){
			System.out.print(items+" ");
		}
		System.out.println();
		
		mergeSort(nums);
		for(int items:nums){
			System.out.print(items+" ");
		}

		
	}

}
