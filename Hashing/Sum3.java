import java.util.* ; 

public class Sum3{
  public static void main(String[] args) {
    OptimalSolution s = new OptimalSolution();
    int nums [] = {-1,0,1,2,-1,-4};
    List<List<Integer>> ans = s.threeSum(nums);
  System.out.println(ans);
  }
}

/*class Solution{
  public List<List<Integer>> threeSum(int[] sums){
    List<List<Integer>> ans = new ArrayList<>();
    HashSet<List<Integer>> unique = new HashSet<>();
      for(int i=0; i<sums.length-1; i++){
          HashSet<Integer> set = new HashSet<>(); 

      for(int j=i+1; j<sums.length;j++){
        int ak = 0 - (sums[i] + sums[j]); 
        if(set.contains(ak)){
         List<Integer> mylist = new ArrayList<>();
         mylist.add(sums[i]); mylist.add(sums[j]); mylist.add(ak);
          Collections.sort(mylist);
          if (unique.add(mylist)) {
              ans.add(mylist);
          }
        }
        set.add(sums[j]); 
      }
    }
    return ans; 
  }
 

}
*/

class OptimalSolution{
  public List<List<Integer>> threeSum(int[] sums){
    List<List<Integer>> ans = new ArrayList<>(); 
    Arrays.sort(sums); 
    for(int i=0; i<sums.length; i++){
      int low = i+1; int high = sums.length-1; 
      while(low<high){
        if(-(sums[low]+sums[high]) == sums[i]){
          ans.add(List.of(sums[i],sums[high], sums[low]));
          continue;
        }
        
        else if(-(sums[low]+sums[high]) > sums[i]){
          low++;
        }
        else{
          high--;
        }


      }
    }

    return ans;

  }
}

