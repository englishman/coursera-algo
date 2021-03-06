package homeworks.week2;

import homeworks.Questionable;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.assertEquals;

public class QuestionQuickSortTest {
    private int[] array;

    @Before
    public void setUp() throws IOException {
        InputStream is = homeworks.week2.Question.class.getResourceAsStream("QuickSort.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        array = new int[10000];
        int count = 0;
        while (true) {
            String strLine = br.readLine();
            if (strLine == null)
                break;
            array[count] = Integer.parseInt(strLine);
            count++;
        };
        assertEquals(10000, count);

        br.close();
        is.close();
    }

    @Test
    public void testQuestion1() {
        Questionable<Long> q = new Question1(array);
        assertEquals(162085, (long)q.getAnswer());
    }

    @Test
    public void testQuestion2() {
        Questionable<Long> q = new Question2(array);
        assertEquals(164123, (long)q.getAnswer());
    }

    @Test
    public void testQuestion3() {
        Questionable<Long> q = new Question3(array);
        assertEquals(138382, (long)q.getAnswer());
    }
}
