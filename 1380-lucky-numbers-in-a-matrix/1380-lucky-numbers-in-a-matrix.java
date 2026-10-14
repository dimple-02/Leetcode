class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[] rowMin = new int[rows];
        Arrays.fill(rowMin, Integer.MAX_VALUE);
        int[] colMax = new int[cols];
        
        for (int row_ind = 0; row_ind < rows; ++row_ind) {
            for (int col_ind = 0; col_ind < cols; ++col_ind) {
                int el = matrix[row_ind][col_ind];
                rowMin[row_ind] = Math.min(rowMin[row_ind], el);
                colMax[col_ind] = Math.max(colMax[col_ind], el);
            }
        }
        
        for (int row_ind = 0; row_ind < rows; ++row_ind) {
            for (int col_ind = 0; col_ind < cols; ++col_ind) {
                int el = matrix[row_ind][col_ind];
                if (el == rowMin[row_ind] && el == colMax[col_ind]) {
                    return Collections.singletonList(el);
                }
            }
        }
        
        return Collections.emptyList();
    }
}