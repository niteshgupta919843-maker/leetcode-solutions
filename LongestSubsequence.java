import java.util.HashMap;

public class LongestSubsequence {

    public static int longestSubsequence(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int maxLength = 0;

        for (int num : arr) {
            if (map.containsKey(num - 1)) {
                map.put(num, map.get(num - 1) + 1);
            } else {
                map.put(num, 1);
            }

            maxLength = Math.max(maxLength, map.get(num));
        }

        return maxLength;
    }
    
    

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};
        System.out.println(longestSubsequence(arr)); 
    }
}