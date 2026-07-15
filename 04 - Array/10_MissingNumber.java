class MissingNumber {

    static int missingNumber(int[] nums) {
        int xor1 = 0;
        int xor2 = 0;
        int n = nums.length + 1;
        for (int i = 0; i < nums.length; i++){
            xor1 ^= nums[i];
            xor2 ^= (i + 1);

        }
        xor2 = xor2 ^ n;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 2, 4, 5},
            {1, 3},
            {2, 3, 4, 5},
            {1, 2, 3, 4},
            {1},
            {2},
            {1, 2, 3, 5, 6, 7, 8},
            {1, 2, 4},
            {1, 3, 4, 5},
            {2, 3, 4, 5, 6}
        };

        int[] expected = {
            3,
            2,
            1,
            5,
            2,
            1,
            4,
            3,
            2,
            1
        };

        for (int i = 0; i < testCases.length; i++) {

            int result = missingNumber(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}