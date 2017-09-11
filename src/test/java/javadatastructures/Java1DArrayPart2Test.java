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
                        new int[]{66,3},
                        new int[]{0,0,1,0,0,1,0,0,0,0,1,1,1,0,1,1,1,0,0,1,1,0,0,0,0,1,0,1,0,1,0,0,1,0,0,0,1,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,0,0,1,1,0,1,1,1,1,0,1,1,0}}
                        , 1
                        , new String[]{
                        "NO"
                }},
        };
    }

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