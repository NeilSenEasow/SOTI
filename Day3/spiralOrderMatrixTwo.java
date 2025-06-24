public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        
        // Initialize A x A matrix with zeros
        for (int i = 0; i < A; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < A; j++) {
                row.add(0);
            }
            matrix.add(row);
        }

        int top = 0, bottom = A - 1;
        int left = 0, right = A - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++) {
                matrix.get(top).set(i, num++);
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix.get(i).set(right, num++);
            }
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix.get(bottom).set(i, num++);
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix.get(i).set(left, num++);
                }
                left++;
            }
        }

        return matrix;
    }
}
