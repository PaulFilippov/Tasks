package leetCode.longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        String[] array = s.split("");
        Set<String> set = new HashSet<>();
        int longestSubStrSize = 0;
        int currSubstrSize = 0;
        for ( int i=0; i<s.length(); i++ ) {
            set.add(array[i]);
            currSubstrSize = 1;
            for (int j=i+1; j<s.length(); j++) {
                if ( set.contains(array[j]) ) {
                    break;
                } else {
                    set.add(array[j]);
                    currSubstrSize=currSubstrSize+1;
                }
            }
            if ( currSubstrSize > longestSubStrSize ){
                longestSubStrSize = currSubstrSize;
            }
            set.clear();
        }
        return longestSubStrSize;
    }
}