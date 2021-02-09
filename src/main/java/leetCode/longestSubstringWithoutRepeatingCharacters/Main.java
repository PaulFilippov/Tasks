package leetCode.longestSubstringWithoutRepeatingCharacters;

public class Main {
    public static void main(String[] args) {
        Solution solObj = new Solution();
        int lengthStr = solObj.lengthOfLongestSubstring("abcabcbb");
        System.out.println(lengthStr);
        lengthStr = solObj.lengthOfLongestSubstring("bbbbbb");
        System.out.println(lengthStr);
        lengthStr = solObj.lengthOfLongestSubstring("pwwkew");
        System.out.println(lengthStr);
        lengthStr = solObj.lengthOfLongestSubstring("");
        System.out.println(lengthStr);
    }
}
