import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();

        if (numRows <= 0) {
            return pascalsTriangle;
        }

        // Initialize 1st row with 1
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        pascalsTriangle.add(firstRow);

       // Triangle row by row
        for (int i = 1; i < numRows; i++) {
            List<Integer> previousRow = pascalsTriangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            // first element of each row is 1
            currentRow.add(1);

            // Calculating  the elements in the middle of the row
            for (int j = 1; j < i; j++) {
                int sum = previousRow.get(j - 1) + previousRow.get(j);
                currentRow.add(sum);
            }

            // last element of each row is 1
            currentRow.add(1);

            pascalsTriangle.add(currentRow);
        }

        return pascalsTriangle;
    }
}
