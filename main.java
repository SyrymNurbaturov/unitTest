import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class main {
    public static void main(String[] args) {
        oneElement();
        positiveTest();
        negativeTest();
        emptyArray();
    }
    public static int[] sort(int[] data) {

        int dataLength = data.length;
        int swap;
        boolean sorted;

        for (int i = 0; i < dataLength; i++) {

            sorted = true;

            for (int a = 1; a < (dataLength - i); a++) {

                if (data[a - 1] > data[a]) {
                    swap = data[a - 1];
                    data[a - 1] = data[a];
                    data[a] = swap;
                    sorted = false;
                }

            }

            // если отсортировано - выходим, пропуская ненужный цикл.
            if (sorted) break;
        }

        return data;
    }

    @Test
    static void positiveTest(){
        int[] expectation = {1, 2, 4, 5, 11, 23};
        int[] observed = {1, 4, 23, 11 ,5, 2};
        sort(observed);
        assertArrayEquals(expectation, observed);
    }

    @Test
    static void emptyArray(){
        int[] expectation = {};
        int[] observed = {};
        sort(observed);
        assertArrayEquals(expectation, observed);
    }

    @Test
    static void negativeTest(){
        int[] expectation = {-23, -11, -5, -4, -2, -1};
        int[] observed = { -1, -4, -23, -11 ,-5, -2};
        sort(observed);
        assertArrayEquals(expectation, observed);
    }

    @Test
    static void mixedTest(){
        int[] expectation = {-111,-2, 0, 11, 23};
        int[] observed = {11, -2, 0, 23, -111};
        sort(observed);
        assertArrayEquals(expectation, observed);
    }
    @Test
    static void oneElement(){
        int[] expectation = {-111};
        int[] observed = {-111};


        sort(observed);
        assertArrayEquals(expectation, observed);
    }

}
