
import java.util.*;

public class LC49_GroupAnagrams  {
    public static void main(String[] args) {
        
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Solution obj = new Solution();
        List<List<String>> result = obj.groupAnagrams(strs);

        System.out.println(result);
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}