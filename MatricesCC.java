public class MatricesCC {

    public static void search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key found at " + i + "," + j);
                }
            }
        }
    }

    public static void Spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom
            for (int j = endCol - 1; j >= startCol + 1; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static int DiagonalSum1(int matrix[][]) {
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static int DiagonalSum2(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static boolean StairSearch(int matrix[][], int key) {        //O(n+m)
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col > 0) {
            if (matrix[row][col] == key) {
                System.err.print("Key found at " + "(" + row + "," + col + ")");
                return true;
            }

            else if (key < matrix[row][col]) {
                col--;
            }

            else {
                row++;
            }
        }
        System.out.print("Key not found!")
        return false;
    }

    public static void main(String[] args) {
        /*
         * int matrix1[][] = new int[3][3];
         * int n = matrix1.length, m = matrix1[0].length;
         * 
         * // input
         * Scanner sc = new Scanner(System.in);
         * for (int i = 0; i < m; i++) {
         * for (int j = 0; j < n; j++) {
         * matrix1[i][j] = sc.nextInt();
         * }
         * }
         * 
         * System.out.print("Enter key:");
         * int key = sc.nextInt();
         * 
         * // output
         * for (int i = 0; i < m; i++) {
         * for (int j = 0; j < n; j++) {
         * System.out.print(matrix1[i][j] + " ");
         * }
         * System.out.println();
         * }
         * search(matrix1, key);
         */
        int matrix2[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // Spiral(matrix2);
        // System.out.print(DiagonalSum2(matrix2));
        StairSearch(matrix2, 11);
    }
}
