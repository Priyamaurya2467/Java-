import java.util.HashMap;

public class Max_consecutive_ones {
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(maxConsecutive(arr,k));

    }
    static int maxConsecutive(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0, maxLength = 0, count = 0;
        while (r < arr.length) {
            if(arr[r]==0){
                count++;
            }
            r++;
            if(count > k){
                l++;
            }
            maxLength = Math.max(maxLength, r - l+1);
        }
        return maxLength;



    }

}
