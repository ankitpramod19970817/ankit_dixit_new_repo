package org.example.leetcode;

public class TransposeMatrix {
   static int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
    public static int[][] transpose(int[][] ints){
        int row= arr.length;
        int column=arr[0].length;
        int[][]newtransposed=new int[row][column];
        for(int i=0;i<row;i++){
            for (int j=0;j<column;j++){
               newtransposed[j][i]=arr[i][j];
            }
        }
        return newtransposed;
    }
    public static void main(String[] args) {
        int[][] transposedMatrix = transpose(arr);

        // Print the original matrix
        System.out.println("Original Matrix:");
        System.out.println(arr);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        System.out.println(transposedMatrix);
    }
}
