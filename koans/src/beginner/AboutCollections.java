package beginner;

import com.sandwich.koan.Koan;

import java.util.*;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;


public class AboutCollections {

    @Koan
    public void usingAnArrayList() {
        // List = interface
        // The generic syntax and special generic cases will be handled in
        // AboutGenerics. We just use <String> collections here to keep it
        // simple.
        List<String> list = new ArrayList<String>();
        // ArrayList: simple List implementation
        list.add("Chicken");
        list.add("Dog");
        list.add("Chicken");
        assertEquals(list.get(0), __);
        assertEquals(list.get(1), __);
        assertEquals(list.get(2), __);
    }

    @Koan
    public void usingBackedArrayList() {
        String[] array = {"a", "b", "c"};
        List<String> list = Arrays.asList(array);
        list.set(0, "x");
        assertEquals(array[0], __);
        array[0] = "a";
        assertEquals(list.get(0), __);
        // Just think of it as quantum state teleportation...
    }

}
