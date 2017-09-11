package javadatastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class Java1DArrayPart2Test {
    @Test
    public void playGame() throws Exception {
        int q = 4;
        int array[][] = new int[][]{
                new int[]{5,3},
                new int[]{0,0,0,0,0},
                new int[]{6,5},
                new int[]{0,0,0,1,1,1},
                new int[]{6,3},
                new int[]{0,0,1,1,1,0},
                new int[]{3,1},
                new int[]{0,1,0}
        };
        String result[] = new String[]{
                "YES",
                "YES",
                "NO",
                "NO"
        };
        Java1DArrayPart2 java1DArrayPart2 = new Java1DArrayPart2(array, q);
        assertEquals(result,java1DArrayPart2.playGame());
    }

}