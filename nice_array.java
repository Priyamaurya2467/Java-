public class nice_array {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 1};
        int k = 3;
        System.out.println(nice(arr, k));
    }

    static int nice(int[] arr, int k) {
        int l = 0, r = 0, maxLen = 0, sum = 0;
        while (r < arr.length) {
            sum = sum + (arr[r] % 2);
            while (r < arr.length) {
                if (sum > k) {
                    sum = sum - arr[l] % 2;
                    l++;
                }


                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;
    }
}
