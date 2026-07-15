import java.util.ArrayList;

public class IntersectionOfSortedArrays {

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        ArrayList<Integer> intersection = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        while (i < n1 && j < n2){
            if (arr1[i] < arr2[j])i++;
            else if (arr1[i] > arr2[j])j++;
            else {
                intersection.addLast(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }

    public static void main(String[] args) {

        int[][] arr1TestCases = {
            {1, 2, 2, 3, 3, 4, 5, 6},
            {1, 2, 3, 4, 5},
            {1, 1, 1, 1},
            {1, 3, 5, 7},
            {1},
            {1, 2, 2, 2, 3},
            {1, 2, 3, 4},
            {1, 2, 3},
            {2, 4, 6, 8},
            {1, 3, 5, 7}
        };

        int[][] arr2TestCases = {
            {2, 3, 3, 5, 6, 6, 7},
            {6, 7, 8},
            {1, 1, 1},
            {2, 4, 6, 8},
            {1},
            {2, 2, 3, 4},
            {1, 2, 3, 4},
            {4, 5, 6},
            {1, 3, 5, 7},
            {1, 3, 5, 7}
        };

        String[] expected = {
            "[2, 3, 3, 5, 6]",
            "[]",
            "[1, 1, 1]",
            "[]",
            "[1]",
            "[2, 2, 3]",
            "[1, 2, 3, 4]",
            "[]",
            "[]",
            "[1, 3, 5, 7]"
        };

        for (int i = 0; i < arr1TestCases.length; i++) {

            ArrayList<Integer> result =
                intersection(arr1TestCases[i], arr2TestCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " +
                (result.toString().equals(expected[i]) ? "PASS" : "FAIL")
            );
        }
    }
}