package javadatastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */

class JavaSubArray {

    private int array[];
    private int n;

    JavaSubArray(int array[]){
        this.array = array;
        n = array.length;
    }

    int countNegativeSubArrays(){
        int flag = 0;
        int negativeSubArraysCount = 0;

        while (n > 0){
            for (int i=0; i<n;i++){
                int subArraySum = array[i];
                if (flag >0) {
                    for (int j = 0; j < flag; j++){
                        subArraySum = subArraySum + array[j+i+1];
                    }
                }
                if (subArraySum < 0){
                    negativeSubArraysCount++;
                }
            }
            flag++;
            n--;
        }

        return negativeSubArraysCount;
    }
}
