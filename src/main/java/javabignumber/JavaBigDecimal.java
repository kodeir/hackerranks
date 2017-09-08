package javabignumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class JavaBigDecimal {

    private String strings[];

    public JavaBigDecimal(String args[]){
        this.strings = args;
    }

    public String[] doReverseSort(){
        System.out.println("Non-sorted string array: " + Arrays.toString(strings));
        Arrays.sort(strings, new Comparator<String>(){
            public int compare(String s1, String s2){
                if (s1 != null && s2 != null) {
                    BigDecimal a, b;
                    a = new BigDecimal(s1);
                    b = new BigDecimal(s2);
                    return -a.compareTo(b);
                } else return 0;
            }
        });
        System.out.println("Sorted (reversed order) string array: " + Arrays.toString(strings));
        return strings;
    }
}
