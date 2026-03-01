import java.util.HashMap;

public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(longestNonRepeatingSubstring(s));
    }

    public static int longestNonRepeatingSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // increase frequency
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // if frequency > 1, shrink from left
            while (freq.get(ch) > 1) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                left++;
            }

            // update max length
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}


