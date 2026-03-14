  import java.util.HashSet; 
   class Solution {
    public  static boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer>  set =  new HashSet<>();

        for (int num : nums ){
            if(set.contains(num )){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main (String [] args ){
        int [] nums ={1,2,3,4,5,};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}