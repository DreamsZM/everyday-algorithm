package com.zy.algorithm.chapter8;

public class Solution1 {

    public static void spiralOrderPrint(int[][] matrix){
        if (matrix == null){
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int tR = 0, tC=0;
        int dR = rows-1, dC = cols-1;
        while (tR<= dR && tC <= dC){
            printEdge(matrix, tR++, tC++, dR--, dC--);
        }
    }

    private static void printEdge(int[][] matrix, int tR, int tC, int dR, int dC ){
        if (matrix == null){
            return;
        }

        if (tR == dR){
            while (tC <= dC){
                System.out.print(matrix[tR][tC++] + " ");
            }
            System.out.println();
        } else if (tC == dC){
            while (tR <= dR){
                System.out.print(matrix[tR++][tC] + " ");
            }
            System.out.println();
        } else {
            int i = tC;
            while (i <= dC){
                System.out.print(matrix[tR][i++] + " ");
            }
            tR++;
            System.out.println();

            int j = tR;
            while (j<=dR){
                System.out.print(matrix[j++][dC] + " ");
            }
            dC--;
            System.out.println();

            int m = dC;
            while (m>=tC){
                System.out.print(matrix[dR][m--] + " ");
            }
            dR--;
            System.out.println();

            int n = dR;
            while (n>= tR){
                System.out.print(matrix[n--][tC] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[4][1];
        int num =0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                matrix[i][j]=num++;
            }
        }
        spiralOrderPrint(matrix);
    }
}
