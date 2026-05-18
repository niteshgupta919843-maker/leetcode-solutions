class Solution {
    public int removeDuplicates(int[] nums) {
      int i = 0;
      for(int j = 1; j < nums.length; j++){
        if(nums[i] != nums[j] ){
            i++;
        nums[i] = nums[j];
      }
       
    }
    return  i +1;  
}
public static  void main(String [] args){
    int [] nums = {1 , 1  , 2 ,3 , 3 };
    int k = new Solution().removeDuplicates(nums);

    for(int i  = 0; i < k; i++){
        System.out.print(nums[i] + " ");
    }
}
}