public class CheckArraySorted {

    static boolean isSorted(int[] nums) {

        for (int i = 1; i < nums.length; i++){
            if (nums[i] < nums[i - 1]) return false; 
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 2, 3, 4, 5},
            {1, 2, 2, 3, 4},
            {1, 3, 2, 4, 5},
            {5, 4, 3, 2, 1},
            {1}
        };

        boolean[] expected = {
            true,
            true,
            false,
            false,
            true
        };

        for (int i = 0; i < testCases.length; i++) {
            boolean result = isSorted(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}