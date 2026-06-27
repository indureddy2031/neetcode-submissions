class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] left_arr = new int[n];
        int[] right_arr = new int[n];

        int[] output_arr = new int[n];

        left_arr[0] = 1;
        right_arr[n-1] = 1;

        for(int i=1; i<n; i++) {
            left_arr[i] = left_arr[i-1] * nums[i-1];
        }

        for(int j=n-1; j>=1; j--) {
            right_arr[j-1] = right_arr[j] * nums[j]; 
        }

        for(int k=0; k<n; k++) {
            output_arr[k] = left_arr[k] * right_arr[k];
        }
        return output_arr;

    }
}  
