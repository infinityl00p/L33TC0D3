/*
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.

You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.

The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.

If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
*/

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int numRows = nums.length;
        int numColumns = nums[0].length;
        int totalLength = numRows * numColumns;
        if (totalLength%c != 0 || r*c > totalLength) {
            return nums;
        }

        int newArray[] = new int[totalLength];
        
        for(int i = 0; i < numRows; i++) {
            int[] row = nums[i];
            for(int j = 0; j < numColumns; j++) {
                int number = nums[i][j];
                newArray[i*row.length+j] = number;
            }
        }

        int[][] newNums = new int[r][c];
        int index = 0;
        
        for(int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                newNums[i][j] = newArray[index];
                index++;
            }
        }
        
        return newNums;
    }
}
