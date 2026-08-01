public class MostWatter11{
  public static void main(String[] args) {
    Solution s = new Solution();
    int nums[] = {3,5,2,7,9,2};
    int ans = s.maxArea(nums);
    System.out.println(ans);
  }
}

class Solution{
  public int maxArea(int[] height){
    int st = 0;
    int end = height.length-1; 
    int maxArea = 0 ; 

    while(st<end){
      int currentArea = (end-st)*Math.min(height[st], height[end]); 
      maxArea = Math.max(currentArea,maxArea); 
      if(height[st]<height[end]){
        st++;
      }
      else{
        end--;
      }
    }

    return maxArea;


  }
}
