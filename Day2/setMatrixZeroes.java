import java.util.ArrayList;
import java.util.HashSet;

public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
        int rows = matrix.size();
        int cols = matrix.get(0).size();

        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();

        // Step 1: Find all rows and columns that contain 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix.get(i).get(j) == 0) {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        // Step 2: Set entire row to 0 if row index is in zeroRows
        for (int i : zeroRows) {
            for (int j = 0; j < cols; j++) {
                matrix.get(i).set(j, 0);
            }
        }

        // Step 3: Set entire column to 0 if column index is in zeroCols
        for (int j : zeroCols) {
            for (int i = 0; i < rows; i++) {
                matrix.get(i).set(j, 0);
            }
        }
    }
}
