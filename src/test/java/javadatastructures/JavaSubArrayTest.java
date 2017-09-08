package javadatastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaSubArrayTest {
    @Test
    public void countNegativeSubArrays() throws Exception {
        int array[] = new int[]{-5,1,7,0};
        // all subarrays are: -5 1 7 0 -4 8 7 3 8 3
        int negativeArrayCount = 2;
        JavaSubArray javaSubArray = new JavaSubArray(array);
        assertEquals(negativeArrayCount, javaSubArray.countNegativeSubArrays());
    }

}