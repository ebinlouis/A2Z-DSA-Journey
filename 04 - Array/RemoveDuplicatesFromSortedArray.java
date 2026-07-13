public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++){
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            };
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 1, 2},
            {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
            {1, 2, 3, 4},
            {1, 1, 1, 1},
            {1}
        };

        int[] expected = {
            2,
            5,
            4,
            1,
            1
        };

        for (int i = 0; i < testCases.length; i++) {
            int result = removeDuplicates(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}