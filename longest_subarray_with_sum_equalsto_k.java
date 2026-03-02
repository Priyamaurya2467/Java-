public class longest_subarray_with_sum_equalsto_k {
    public static void main(String[] args) {
        int[] arr = {12, 2, 2, 4, 5, 3, 6};
        int k = 6;
        System.out.println(sum(arr, k));
    }

    static int sum(int[] arr, int k) {
        int l = 0, r = 0, sum = 0, maxLength = 0;
        while (r < arr.length) {
            sum = sum + arr[r];
            while (sum > k) {
                if (sum > k) {
                    sum = sum - arr[l];
                    l++;
                    if (sum == k) {
                        maxLength = Math.max(maxLength, r - l + 1);
                    }
                }
            }
            r++;
        }
        return maxLength;
    }
}
