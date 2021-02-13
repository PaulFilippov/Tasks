package leetCode.longestPalindromicSubstr;

class Solution {
    public String longestPalindrome(String s) {
        String maxPalindrom = "";
        String currMaxPalindrom = "";
        String up = s.toUpperCase();
        String down = s.toLowerCase();
        if (!s.equals(down) & !s.equals(up)) {
            System.out.println("cjc");
        }
        if (s.length() == 0) {
            return "";
        }
        if (s.length() == 1) {
            return s;
        }
        if (s.length() > 1000) {
            System.out.println("много букаф");
        }
        maxPalindrom = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    currMaxPalindrom = s.substring(i, j) + s.charAt(j);
                    boolean isPal = isPalindrome(currMaxPalindrom);
                    if (isPal == true & maxPalindrom.length() < currMaxPalindrom.length()) {
                        maxPalindrom = currMaxPalindrom;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return maxPalindrom;
    }

    public boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }
}