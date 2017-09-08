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
        int flag = -1;

        while (nCopy > 0){
            System.out.print(nCopy + "; ");
            for (int i=0; i<nCopy;i++){
                System.out.print("i = " + i + "; ");
                subArrs[count] = array[i];
                System.out.print("array[i] = " + array[i] + "; ");
                System.out.print("flag = " + flag + "; ");
                if (flag >=0) {
                    for (int j = 0; j < flag+1; j++){
                        System.out.print("j = " + j + "; ");
                        subArrs[count] = subArrs[count] + array[j+1];
                        System.out.print("array[j+1] = " + array[j+1] + "; ");
                    }
                }
                count++;
            }
            flag++;
            nCopy--;
            System.out.println();
        }

        System.out.println(Arrays.toString(subArrs));

        return 0;
    }
}
