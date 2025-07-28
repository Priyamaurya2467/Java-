public class second_largest {
    public static void main(String[] args) {
        int[] arr = {5, 44, 63, 22, 10 };
        int ans = bubble_s(arr);
        System.out.println(ans);
    }

    static int bubble_s(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr[arr.length-2];
    }
}



