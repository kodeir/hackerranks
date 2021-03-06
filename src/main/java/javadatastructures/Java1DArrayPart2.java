package javadatastructures;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 */
class Java1DArrayPart2 {

    private int array[][];
    //number of queries
    private int q;

    private int reversePoint;

    Java1DArrayPart2(int array[][], int q){
        this.array = array;
        this.q = q;
    }

    String[] playGame(){
        System.out.println("---- NEW GAME ----");
        int arrayI = 0;
        int arrayJ = 0;
        String result[] = new String[q];

        while (q-- > 0) {
            int n = array[arrayI][arrayJ];
            System.out.print("n = " + n);
            int leap = array[arrayI][arrayJ+1];
            System.out.print("; leap = " + leap);

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = array[arrayI+1][i];
            }
            System.out.print("; games is: " + Arrays.toString(game));

            result[q] = ( (canWin(leap, game)) ? "YES" : "NO" );
            System.out.print("; result = " + result[q]);
            arrayI = arrayI+2;
            System.out.println();
        }

        List<String> list = Arrays.asList(result);
        Collections.reverse(list);
        return list.toArray(new String[result.length]);
    }

    private boolean canWin(int leap, int[] game) {
        reversePoint = -1;
        System.out.println();
        int i = 0;
        System.out.print("i = " + i);
        int n = game.length;
        System.out.print("; n = " + n);
        return (checkWinCondition(i, leap, n)) || keepPlaying(i, game, leap, n);
    }

    private boolean checkWinCondition(int i, int leap, int n){
        System.out.println();
        System.out.print("i = " + i);
        System.out.print("; leap = " + leap);
        System.out.print("; n = " + n);
        System.out.print("; i == n-1 = " + (i == n-1));
        System.out.print("; (i+leap)>n = " + ((i+leap)>=n));
        return (i == n-1) || ((i+leap)>=n);
    }

    private boolean keepPlaying(int i, int game[], int leap, int n){
        if (game[i+1] == 0){
            i++;
            return (checkWinCondition(i, leap, n)) || keepPlaying(i, game, leap, n);
        } else if (leap != 0 && game[i+leap] == 0){
            i = i + leap;
            return (checkWinCondition(i, leap, n)) || keepPlaying(i, game, leap, n);
        } else {
            if (reversePoint<0) {
                reversePoint = i;
                return reversePlay(i, game, leap, n);
            } else {
                return false;
            }
        }
    }

    private boolean reversePlay(int i, int game[], int leap, int n){
        System.out.println();
        System.out.println("-reverse-");
        System.out.print("i = " + i);
        if (i>0 && game[i-1] == 0){
            i--;
            System.out.print("; i-- = " + i);
            if (game[i+leap] == 0) {
                i = i + leap;
                System.out.print("; i+leap = " + i);
                return (checkWinCondition(i, leap, n)) || keepPlaying(i, game, leap, n);
            } else {
                return reversePlay(i, game, leap, n);
            }
        } else {
            return false;
        }
    }


}
