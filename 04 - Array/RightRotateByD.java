public class RightRotateByD {

    static void reverse(int[] nums, int start, int end){
            while (start < end){
              int temp = nums[start];
              nums[start] = nums[end];
              nums[end] = temp;

              start++;
              end--;
            }
      }

    static int[] rightRotateByD(int[] nums, int d) {

        int n = nums.length;
        d = d % n;

        int i = 0;

        reverse(nums, i, n - 1);
        reverse(nums, d, n - 1);
        reverse(nums, i, d - 1);

        return nums;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4},
            {5, 6}
        };

        int[] dValues = {
            2,
            3,
            1,
            1
        };

        int[][] expected = {
            {6, 7, 1, 2, 3, 4, 5},
            {3, 4, 5, 1, 2},
            {4, 1, 2, 3},
            {6, 5}
        };

        for (int i = 0; i < testCases.length; i++) {

            int[] result = rightRotateByD(testCases[i], dValues[i]);

            boolean pass = java.util.Arrays.equals(result, expected[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (pass ? "PASS" : "FAIL")
            );
        }
    }
}