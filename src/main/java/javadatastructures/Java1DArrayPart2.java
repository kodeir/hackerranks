package javadatastructures;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 */
class Java1DArrayPart2 {

    private int array[][];
    //number of queries
    private int q;

    Java1DArrayPart2(int array[][], int q){
        this.array = array;
        this.q = q;
    }

    String[] playGame(){

        int arrayI = 0;
        int arrayJ = 0;

        String result[] = new String[q];

        while (q-- > 0) {
            int n = array[arrayI][arrayJ];
            int leap = array[arrayI][arrayJ+1];

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = array[arrayI+1][arrayJ];
            }

            result[q] = ( (canWin(leap, game)) ? "YES" : "NO" );
            arrayI = arrayI+2;
        }

        List<String> list = Arrays.asList(result);
        Collections.reverse(list);
        return list.toArray(new String[q]);
    }

    private boolean canWin(int leap, int[] game) {

        return false;
    }
}
