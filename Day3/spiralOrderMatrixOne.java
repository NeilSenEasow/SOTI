public class Solution {
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int top = 0;
        int bottom = A.size() - 1;
        int left = 0;
        int right = A.get(0).size() - 1;

        while (top <= bottom && left <= right) {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++) {
                result.add(A.get(top).get(i));
            }
            top++;

            // Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(A.get(i).get(right));
            }
            right--;

            // Traverse from Right to Left (check if row remains)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(A.get(bottom).get(i));
                }
                bottom--;
            }

            // Traverse from Bottom to Top (check if column remains)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(A.get(i).get(left));
                }
                left++;
            }
        }

        return result;
    }
}
