public class optinalChallenges_Arrays {
    public static void main(String[] args) {
        //Task A
        int[][] matrixA = {
                {1, 2, 3, 4},
                {10, 20, 30, 40},
                {5, 6, 7, 8}
        };
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = 0;
        for (int i = 0; i < matrixA.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < matrixA[i].length; j++) {
                currentRowSum += matrixA[i][j];
            }
            if (currentRowSum > maxRowSum) {
                maxRowSum = currentRowSum;
                maxRowIndex = i;
            }
        }
        System.out.println("Row with largest sum: " + maxRowIndex + " (sum = " + maxRowSum + ")");

//Task B
        int[][] matrixB = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transposed = new int[3][2];
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                transposed[j][i] = matrixB[i][j];
            }
        }
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }

//Task C
        int[][] m1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] m2 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        int[][] sumMatrix = new int[2][3];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                sumMatrix[i][j] = m1[i][j] + m2[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
