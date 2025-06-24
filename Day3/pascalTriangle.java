public class Solution {
    public int[][] solve(int A) {
    // Step 1: Initialize a List of List to hold Pascal's Triangle
    List<List<Integer>> res = new ArrayList<>();

    // Step 2: Loop through each row index from 0 to A-1
    for (int i = 0; i < A; i++) {
        List<Integer> row = new ArrayList<>();  // Create a new row

        // Step 3: Build the current row
        for (int j = 0; j <= i; j++) {
            if (j == 0 || j == i) {
                row.add(1); // First and last elements are always 1
            } else {
                // Sum of the two elements above it
                int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                row.add(val);
            }
        }

        // Step 4: Add the built row to the result
        res.add(row);
    }

    // Step 5: Convert List<List<Integer>> to int[][]
    int[][] resultArray = new int[A][];
    for (int i = 0; i < A; i++) {
        List<Integer> rowList = res.get(i);
        resultArray[i] = rowList.stream().mapToInt(Integer::intValue).toArray();
    }

    return resultArray;
}

}
