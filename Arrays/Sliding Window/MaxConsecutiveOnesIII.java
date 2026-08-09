import java.util.* ; 

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {1,1,1,0,0,0,1,1,1,1,0}; 
        int max_count = s.longestOnes(nums,2);
        System.out.println(max_count);
    }
}

class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length; 
        int zero_count = 0 ; 
        int maxLength = 0 ; 
        int left = 0 ; 
        int right = 0 ;

        while(right<n){
            if(nums[right] == 0){
                zero_count++; 
            }   
            while(zero_count > k ){
                if(nums[left] == 0) zero_count --; 
                left++ ;
            }

            
            maxLength = Math.max(maxLength,right-left+1);

            right++;
        }
        return maxLength;
    }

}
