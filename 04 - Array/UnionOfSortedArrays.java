import java.util.ArrayList;

public class UnionOfSortedArrays {

    static ArrayList<Integer> union(int[] arr1, int[] arr2) {

        int i = 0;
        int j = 0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2){
            if (arr1[i] <= arr2[j]){
                if (union.isEmpty() || union.getLast() != arr1[i]){
                    union.addLast(arr1[i]);
                }
                i++;
            }else if (arr1[i] >= arr2[j]) {
                if (union.isEmpty() || union.getLast() != arr2[j]){
                    union.addLast(arr2[j]);
                }
                j++;
            }
        }

        while (i < n1){
            if (union.isEmpty() || union.getLast() != arr1[i]){
                union.addLast(arr1[i]);
            }
            i++;
        }
        while (j < n2){
            if (union.isEmpty() || union.getLast() != arr2[j]){
                union.addLast(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {

        int[][] arr1TestCases = {
            {1, 1, 2, 3, 4, 5},
            {1, 2, 3},
            {1, 1, 1, 1},
            {1, 3, 5},
            {1},
            {1, 2, 2, 2, 3},
            {1, 1, 2, 2},
            {1, 2, 3, 4, 5},
            {2, 4, 6, 8},
            {1, 3, 5, 7}
        };

        int[][] arr2TestCases = {
            {2, 3, 4, 4, 5, 6},
            {2, 4, 5},
            {1, 1, 1, 1},
            {2, 4, 6},
            {1},
            {2, 3, 4, 4, 5},
            {2, 2, 3, 3},
            {1, 2, 3, 4, 5},
            {1, 3, 5, 7},
            {2, 4, 6, 8}
        };

        String[] expected = {
            "[1, 2, 3, 4, 5, 6]",
            "[1, 2, 3, 4, 5]",
            "[1]",
            "[1, 2, 3, 4, 5, 6]",
            "[1]",
            "[1, 2, 3, 4, 5]",
            "[1, 2, 3]",
            "[1, 2, 3, 4, 5]",
            "[1, 2, 3, 4, 5, 6, 7, 8]",
            "[1, 2, 3, 4, 5, 6, 7, 8]"
        };

        for (int i = 0; i < arr1TestCases.length; i++) {

            ArrayList<Integer> result =
                union(arr1TestCases[i], arr2TestCases[i]);

            System.out.println(
                "Test Case " + (i + 1) +
                " | " +
                (result.toString().equals(expected[i]) ? "PASS" : "FAIL")
            );
        }
    }
}