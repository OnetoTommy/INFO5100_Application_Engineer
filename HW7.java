package edu.neu.mgen;

public class HW7 {

    /*
     * You have two matrices A[][] = {{2,3,4},{3,4,5}} and B[][] = {{1,2},{3,4},{5,6}}
     * First check if the matrices can be multiplied A*B.
     * f yes, then use loops to calculate the product of these two matrices A*B
     * Output the result.
     * Comments:
     * Learn first how to multiply matrices
     * Use loops to go through the matrices.
     * Your algorithm should be able to handle matrices of any size.
     */

     public static void main(String[] args) {
        
        int[][] A = {{2,3,4},{3,4,5}};
        int[][] B = {{1,2},{3,4},{5,6}};

        int rowA = A.length;
        int columnA = A[0].length;
        int rowB = B.length;
        int columnB = B[0].length;

        if (columnA == rowB){
            System.out.println("The matrices can be multiplied A*B");

            // Create new matrices for A * B
            int[][] multiMatrices = new int[rowA][columnB];
            for (int i = 0; i < rowA; i++){
                for(int j = 0; j < columnB; j++){
                    for (int _ = 0; _ < columnA; _++){
                        multiMatrices[i][j] += A[i][_] * B[_][j];
                    }
                }
            }

            System.out.println("Multipled Matrices: ");
            for(int i = 0; i < rowA; i++){
                for(int j = 0; j < columnB; j++){
                    System.out.println("Row" + i + " & " + "Column" + j + " = " + multiMatrices[i][j]);
                }
            }
        }else{
            System.out.println("The matrices can not be multiplied A*B");
        }


     }
    
}
