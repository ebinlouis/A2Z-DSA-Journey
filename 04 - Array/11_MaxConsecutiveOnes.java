class MaxConsecutiveOnes {

    static int maxConsecutiveOnes(int[] nums) {

        int maxOne = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1){
                count++;
                maxOne = Math.max(maxOne, count);
            }else{
                count = 0;
            }
        }

        return maxOne;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {1, 1, 0, 1, 1, 1},
            {1, 0, 1, 1, 0, 1},
            {1, 1, 1, 1, 1},
            {0, 0, 0, 0},
            {1},
            {0},
            {1, 1, 0, 0, 1, 1, 1, 1},
            {0, 1, 1, 1, 0, 1, 1},
            {1, 0, 1, 0, 1, 0, 1},
            {1, 1, 1, 0, 1, 1, 1, 1, 1}
        };

        int[] expected = {
            3,
            2,
            5,
            0,
            1,
            0,
            4,
            3,
            1,
            5
        };

        for (int i = 0; i < testCases.length; i++) {

            int result = maxConsecutiveOnes(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}