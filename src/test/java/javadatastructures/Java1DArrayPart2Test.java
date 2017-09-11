package javadatastructures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class Java1DArrayPart2Test {

    int array[][];
    int q;
    String result[];

    @Parameterized.Parameters
    public static Object[][] arrays() {
        return new Object[][]{
                {new int[][]{
                        new int[]{5,3},
                        new int[]{0,0,0,0,0},
                        new int[]{6,5},
                        new int[]{0,0,0,1,1,1},
                        new int[]{6,3},
                        new int[]{0,0,1,1,1,0},
                        new int[]{3,1},
                        new int[]{0,1,0}}
                        , 4
                        , new String[]{
                "YES",
                "YES",
                "NO",
                "NO"
        }},
                {new int[][]{
                        new int[]{6,2},
                        new int[]{0,1,0,1,0,1},
                        new int[]{10,6},
                        new int[]{0,0,1,1,0,0,1,1,0,0},
                        new int[]{10,3},
                        new int[]{0,0,1,1,0,0,1,1,0,0}}
                        , 3
                        , new String[]{
                        "YES",
                        "NO",
                        "YES"
                }},
                {new int[][]{
                        new int[]{9,4},
                        new int[]{0,1,1,0,0,1,1,0,1}}
                        , 1
                        , new String[]{
                        "YES"
                }},
                {new int[][]{
                        new int[]{66,3},
                        new int[]{0,0,1,0,0,1,0,0,0,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,1,1,1,0,1,1,0}}
                        , 1
                        , new String[]{
                        "YES"
                }},
        };
    }//66 3
//0 0 1 0 0 1 0 0 0 0 1 1 1 0 1 1 1 0 0 1 1 0 0 0 0 1 0 1 0 1 0 0 1 0 0 0 1 0 0 0 0 0 1 1 0 0 0 0 0 1 1 0 1 0 0 1 1 0 1 1 1 1 0 1 1 0

    public Java1DArrayPart2Test(int array[][], int q, String[] result){
        this.array = array;
        this.q = q;
        this.result = result;
    }

    @Test
    public void playGame() throws Exception {
        Java1DArrayPart2 java1DArrayPart2 = new Java1DArrayPart2(array, q);
        assertEquals(result,java1DArrayPart2.playGame());
    }

}