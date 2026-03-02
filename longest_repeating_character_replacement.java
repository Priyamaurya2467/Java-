public class longest_repeating_character_replacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(character(s , k));
    }
    static int character(String s, int k) {
        int l = 0 , r = 0 , maxLen = 0;
        int[] freq = new int[26];
        for (r = 0 ; r < s.length(); r++) {
            freq[s.charAt(r) - 'A']++;

            maxLen = Math.max(maxLen, r - l + 1);

            while ((r-l+1)-maxLen > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);

        }
        return maxLen;
    }
}
