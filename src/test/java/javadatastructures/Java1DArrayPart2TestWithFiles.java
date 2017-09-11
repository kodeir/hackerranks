package javadatastructures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Java1DArrayPart2TestWithFiles {
    private int array[][];
    private int q;
    private String result[];

    private String input;
    private String output;

    public Java1DArrayPart2TestWithFiles(String input, String output){
        this.input = "testfiles/"+input;
        this.output = "testfiles/"+output;
    }

    @Parameterized.Parameters
    public static Object[][] arrays() {
        return new Object[][]{
                {"input00.txt", "output00.txt"},
                {"input01.txt", "output01.txt"},
                {"input02.txt", "output02.txt"},
                {"input03.txt", "output03.txt"},
                {"input04.txt", "output04.txt"},
                {"input05.txt", "output05.txt"},
                {"input06.txt", "output06.txt"},
                {"input07.txt", "output07.txt"},
                {"input08.txt", "output08.txt"},
                {"input09.txt", "output09.txt"},
        };
    }

    @Test
    public void testGameWithFile() throws Exception {
        FileReader fileReader = new FileReader(input);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        q = Integer.parseInt(bufferedReader.readLine());
        array = new int[q*2][];
        for (int i = 0; i < q*2; i++) {
            String items[] = bufferedReader.readLine().split(" ");
            array[i] = new int[items.length];
            for (int j = 0; j< items.length; j++){
                array[i][j]=Integer.parseInt(items[j]);
            }
        }

        fileReader = new FileReader(output);
        bufferedReader = new BufferedReader(fileReader);

        result = new String[q];
        for (int i = 0; i < q; i++) {
            result[i] = bufferedReader.readLine();
        }

        Java1DArrayPart2 java1DArrayPart2 = new Java1DArrayPart2(array, q);
        assertEquals(result,java1DArrayPart2.playGame());
    }

}
