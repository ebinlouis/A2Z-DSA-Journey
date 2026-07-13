public class SecondLargestElement {

    static int secondLargestElement(int[] nums) {
        int largest = nums[0];
        int secondLargest = -1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] < largest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {

        int[][] testCases = {
            {2, 5, 1, 3, 0},
            {8, 10, 5, 7, 9},
            {1, 2},
            {8, 8, 7, 6, 5}
        };

        int[] expected = {3, 9, 1, 7};

        for (int i = 0; i < testCases.length; i++) {
            int result = secondLargestElement(testCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " + (result == expected[i] ? "PASS" : "FAIL")
            );
        }
    }
}