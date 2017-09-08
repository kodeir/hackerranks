package javadatastructures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class JavaSubArrayTest {

    int array[];
    int negativeArrayCount;

    @Parameterized.Parameters
    public static Object[][] arrays() {
        return new Object[][]{
                {new int[]{1}, 0},
                {new int[]{-1, 0}, 2},
                {new int[]{-1, 2, 0}, 1},
                {new int[]{-5, 1, 7, 0}, 2},
                {new int[]{2, 0, -3, 2, -5}, 10},
        };
    }

    public JavaSubArrayTest(int array[], int negativeArrayCount){
        this.array = array;
        this.negativeArrayCount = negativeArrayCount;
    }

    @Test
    public void countNegativeSubArrays() throws Exception {
        JavaSubArray javaSubArray = new JavaSubArray(array);
        assertEquals(negativeArrayCount, javaSubArray.countNegativeSubArrays());
    }

}