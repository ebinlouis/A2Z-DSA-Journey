class SingleNumber {

    static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {2, 2, 1},
            {4, 1, 2, 1, 2},
            {1},
            {7, 3, 5, 4, 5, 3, 4},
            {9, 8, 8},
            {6, 1, 6},
            {10, 20, 10},
            {99, 99, 100},
            {5, 2, 2},
            {11, 12, 12, 11, 13}
        };

        int[] expected = {
            1,
            4,
            1,
            7,
            9,
            1,
            20,
            100,
            5,
            13
        };

        for (int i = 0; i < testCases.length; i++) {

            int result = singleNumber(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}