import java.util.HashMap;

public class fruits_into_basktes {
    public static void main(String[] args) {
        int[] arr = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        int k = 2;
        System.out.println(fruits(arr, k));
    }
    static int fruits(int[] arr, int k) {
        int l = 0 , r = 0 , maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r<arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            if (map.size() > k) {
                while (map.size() > k) {
                    map.put(arr[l], map.getOrDefault(arr[l], 0) - 1);
                    if (map.get(arr[l]) == 0) {
                        map.remove(arr[l]);
                    }
                    l++;

                    maxLen = Math.max(maxLen, r - l + 1);
                }
            }
            r++;
        }
        return maxLen;
    }

}
