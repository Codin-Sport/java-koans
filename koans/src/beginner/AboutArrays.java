package beginner;

import com.sandwich.koan.Koan;

import java.util.Arrays;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutArrays {

    @Koan
    public void arraysAreMutable() {
        final boolean[] oneBoolean = new boolean[]{false};
        oneBoolean[0] = true;
        assertEquals(oneBoolean[0], __);
    }

    @Koan
    public void arraysAreIndexedAtZero() {
        int[] integers = new int[]{1, 2};
        assertEquals(integers[0], __);
        assertEquals(integers[1], __);
    }

    @Koan
    public void arrayIndexOutOfBounds() {
        int[] array = new int[]{1};
        @SuppressWarnings("unused")
        int meh = array[1]; // remember 0 based indexes, 1 is the 2nd element (which doesn't exist)
    }

    @Koan
    public void arrayLengthCanBeChecked() {
        assertEquals(new int[1].length, __);
    }

}
