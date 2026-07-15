class MoveZeroes {

    static int[] moveZeroes(int[] nums) {

        int j = -1;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                j = i;
                break;
            }
        }

        for (int i = j  + 1; i < nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 0, 2, 3, 0, 4, 0, 1},
            {0, 1, 0, 3, 12},
            {0, 0, 1},
            {4, 0, 5, 0, 6},
            {0, 7, 0, 8, 0}
        };

        int[][] expected = {
            {1, 2, 3, 4, 1, 0, 0, 0},
            {1, 3, 12, 0, 0},
            {1, 0, 0},
            {4, 5, 6, 0, 0},
            {7, 8, 0, 0, 0}
        };

        for (int i = 0; i < testCases.length; i++) {

            int[] result = moveZeroes(testCases[i]);

            boolean pass = java.util.Arrays.equals(result, expected[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (pass ? "PASS" : "FAIL")
            );
        }
    }
}