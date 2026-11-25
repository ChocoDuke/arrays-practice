// 21.11.2026, saturday
import java.util.Scanner;
public class PracticeContinue_Arrays {
    public static void main(String[] args) {

        /* int[][] a = {
               {1, 2, 3},
               {4, 5, 6}
       };
       int[][] empty = new int[3][4];
        for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
               System.out.print(a[i][j] + " ");
           }
           System.out.println();
       }
        int sum = 0;
        for (int i = 0; i < a[i].length; i++) {
            for (int j=0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println(sum);



        int[][] a = {
            {10, 5, 3},
            {-12, 55, -7},
            {0, 15, 6}
        };
        int max = a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println(max); */

        //TASK 1
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Task 1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //TASK 2
        System.out.println("Task 2: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] *= 5;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //TASK 3
        System.out.println(a[1][2]);
        a[1][2] = 99;
        System.out.println(a[1][2]);
        System.out.println();

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }
        System.out.println("Task 3. Sum of all nine values: " + sum);

        //TASK 4
        System.out.print("Task 4: ");
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.println("Even: " + even + ". ");
        System.out.println(" Odd: " + odd + ". ");

        //TASK 5
        System.out.print("Task 5: ");
        int[][] b = {
                {6, 37, -9, 12},
                {0, -27, 51, -2},
                {88, 7, -28, 99}
        };
        int l = b[0][0];
        int s = b[0][0];
        int lIndex = 0;
        int sIndex = 0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j] > l) {
                    l = b[i][j];
                    lIndex = i;
                } else if (b[i][j] < s) {
                    s = b[i][j];
                    sIndex = i;
                }
            }
        }
        System.out.println("Largest: " + l + " at index " + lIndex);
        System.out.println("Smallest: " + s + " at index " + sIndex);
//TASK 6
        System.out.println("Task 6: ");
        Scanner scanner = new Scanner(System.in);
        int[][] empty = new int[2][3];

        for (int i = 0; i < empty.length; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            int input = scanner.nextInt();
        }
        //SESSION 2 | Rows and columns
        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
                System.out.println("Row " + i + ": " + rowSum);
            }
        }
//TASK 7
        System.out.print("Task 7: ");
        int[][] c = {
                {37, -9, 12},
                {-27, 51, -2},
                {8, 7, -21}
        };
        for (int i = 0; i < c.length; i++) {
            int colSum = 0;
            for (int j = 0; j < c[i].length; j++) {
                colSum += a[j][i];
            }
            System.out.println(colSum);
        }
        //TASK 8
        System.out.println("Enter threshold: ");
        int threshold = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] > threshold) {
                    count++;
                }
            }
        }
        System.out.println("Numbers of values that are grater than threshold " + count);

        //TASK 9
        System.out.println("Enter number to search: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] == target) {
                    System.out.println("Found at row " + i + ", colum " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Not found: ");
        }

        //TASK 10
int diagSum = 0;
        System.out.print("Diagonal elements: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i][i] + " ");
            diagSum += c[i][i];
        }
        System.out.println("\nSum: " + diagSum);

        //TASK 11
        System.out.println("Before:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if (c[i][j] < 0) {
                    c[i][j] = 0;
                }
            }
        }
        System.out.println("After:");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        //TASK 12
        int[][] grades = {
                {85, 90, 78, 92},
                {70, 88, 95, 80},
                {100, 84, 89, 91}
        };
        int classMax = grades[0][0];
        int totalSum = 0;
        int totalCount = 0;
        for (int i = 0; i < grades.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                int score = grades[i][j];
                studentSum += score;
                totalSum += score;
                totalCount++;
                if (score > classMax) {
                    classMax = score;
                }
            }
            double studentAvg = (double) studentSum / grades[i].length;
            System.out.println("Student " + i + " average: " + studentAvg);
        }
        double overallAvg = (double) totalSum / totalCount;
        System.out.println("Class maximum: " + classMax);
        System.out.println("Overall average: " + overallAvg);
    }
}
