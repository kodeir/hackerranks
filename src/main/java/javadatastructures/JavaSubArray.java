package javadatastructures;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */

class JavaSubArray {

    int array[];
    int n;

    JavaSubArray(int array[]){
        this.array = array;
        n = array.length;
    }

    int countNegativeSubArrays(){
        int subArrsCount = 0;
        int nCopy = n;

        while (nCopy > 0){
            subArrsCount = subArrsCount + nCopy;
            nCopy--;
        }

        int subArrs[] = new int[subArrsCount];
        nCopy = n;
        int count = 0;
        int flag = 0;

        while (nCopy > 0){
            for (int i=0; i<nCopy;i++){
                subArrs[count] = array[i];
                if (flag >0) {
                    for (int j = 0; j < flag; j++){
                        subArrs[count] = subArrs[count] + array[j+i+1];
                    }
                }
                count++;
            }
            flag++;
            nCopy--;
        }

        int negativeSubArraysCount = 0;
        for (int i = 0; i < subArrsCount; i++){
            if (subArrs[i] < 0){
                negativeSubArraysCount++;
            }
        }

        return negativeSubArraysCount;
    }
}
