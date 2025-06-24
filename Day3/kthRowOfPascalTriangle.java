public class Solution {
    public int[] getRow(int A) {
        List<Integer> row = new ArrayList<>();
        row.add(1);  

        for (int i = 1; i <= A; i++) {
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); 
        }

        int[] result = new int[row.size()];
        for (int i = 0; i < row.size(); i++) {
            result[i] = row.get(i);
        }

        return result;
    }
}
