public class LargestElement {

    static int largestElement(int[] nums) {
        int n = nums.length;
        int largest = nums[0];
        for (int i = 0; i < n;i++){
            if (nums[i] > largest) largest = nums[i];
        }
        return largest;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {2, 5, 1, 3, 0},
            {8, 10, 5, 7, 9},
            {1},
            {-1, -5, -2}
        };

        int[] expected = {5, 10, 1, -1};

        for (int i = 0; i < testCases.length; i++) {
            int result = largestElement(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}