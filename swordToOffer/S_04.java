public class S_04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int row = matrix.length;
        int column = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int i = 0;
        int j = matrix[0].length-1;
        while (i < matrix.length && j >= 0) {
            if (target > matrix[i][j]) {
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},};
        S_04 s =new S_04();
        System.out.println(s.findNumberIn2DArray(matrix,5));
        System.out.println(s.findNumberIn2DArray(matrix,20));

        System.out.println(s.findNumberIn2DArray2(matrix,5));
        System.out.println(s.findNumberIn2DArray2(matrix,20));
    }
}
