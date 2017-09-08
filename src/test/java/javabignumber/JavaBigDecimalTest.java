package javabignumber;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaBigDecimalTest {
    @Test
    public void doReverseSort() throws Exception {
        String initialArray[] = new String[]{
                "-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34",
                "000.000",
        };
        String expectedArray[] = new String[]{
                "90",
                "56.6",
                "50",
                "02.34",
                "0.12",
                ".12",
                "0",
                "000.000",
                "-100",
        };
        JavaBigDecimal javaBigDecimal = new JavaBigDecimal(initialArray);
        assertArrayEquals(expectedArray, javaBigDecimal.doReverseSort());
    }

}