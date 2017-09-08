package javadatastructures;

/**
 * https://www.hackerrank.com/challenges/java-2d-array/problem
 * In this problem you have to print the largest sum among all the hourglasses in the array.
 */
class Java2DArray {

    private int array[][];

    Java2DArray(int array[][]){
        this.array = array;
    }

    int findBiggestHourglass(){
        int biggestSum = Integer.MIN_VALUE;

        for (int i=0; i<array.length-2; i++){
            for (int j=0; j<array[i].length-2;j++){
                int hourglass = array[i][j] + array[i][j+1] + array[i][j+2]
                                            + array[i+1][j+1]
                            + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
                if (hourglass > biggestSum){
                    biggestSum = hourglass;
                }
            }
        }

        return biggestSum;
    }
}
