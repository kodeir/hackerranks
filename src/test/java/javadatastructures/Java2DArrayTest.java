package javadatastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class Java2DArrayTest {
    @Test
    public void findBiggestHourglass() throws Exception {
        int array[][] = {
                new int[]{1,1,1,0,0,0},
                new int[]{0,1,0,0,0,0},
                new int[]{1,1,1,0,0,0},
                new int[]{0,0,2,4,4,0},
                new int[]{0,0,0,2,0,0},
                new int[]{0,0,1,2,4,0}
        };
        int biggestSum = 19;
        Java2DArray java2DArray = new Java2DArray(array);
        assertEquals(biggestSum, java2DArray.findBiggestHourglass());
    }

}