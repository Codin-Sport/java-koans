package beginner;

import com.sandwich.koan.Koan;

import static com.sandwich.koan.constant.KoanConstants.__;
import static com.sandwich.util.Assert.assertEquals;

public class AboutPrimitives {

    @Koan
    public void wholeNumbersAreOfTypeInt() {
        assertEquals(getType(1), __); // hint: int.class
    }

    @Koan
    public void primitivesOfTypeIntHaveAnObjectTypeInteger() {
        Object number = 1;
        assertEquals(getType(number), __); // hint: new Integer().getClass()

        // Primitives can be automatically changed into their object type via a process called auto-boxing
        // We will explore this in more detail in extra.AboutAutoboxing
    }

    @Koan
    public void integersHaveAFairlyLargeRange() {
        assertEquals(Integer.MIN_VALUE, __);
        assertEquals(Integer.MAX_VALUE, __);
    }

    @Koan
    public void integerSize() {
        assertEquals(Integer.SIZE, __);  // This is the amount of bits used to store an int
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeLong() {
        assertEquals(getType(1L), __);
    }

    @Koan
    public void longSize() {
        assertEquals(Long.SIZE, __);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeShort() {
        assertEquals(getType((short) 1), __); // The '(short)' is called an explicit cast - to type 'short'
    }

    @Koan
    public void shortSize() {
        assertEquals(Short.SIZE, __);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeByte() {
        assertEquals(getType((byte) 1), __);
    }

    @Koan
    public void primitivesOfTypeByteHaveAnObjectTypeByte() {
        Object number = (byte) 1;
        assertEquals(getType(number), __);
    }

    @Koan
    public void byteSize() {
        assertEquals(Byte.SIZE, __);
    }

    @Koan
    public void wholeNumbersCanAlsoBeOfTypeChar() {
        assertEquals(getType((char) 1), __);
    }

    @Koan
    public void charSize() {
        assertEquals(Character.SIZE, __);
    }

    @Koan
    public void decimalNumbersAreOfTypeDouble() {
        assertEquals(getType(1.0), __);
    }

    @Koan
    public void doubleSize() {
        assertEquals(Double.SIZE, __);
    }

    @Koan
    public void decimalNumbersCanAlsoBeOfTypeFloat() {
        assertEquals(getType(1f), __);
    }

    @Koan
    public void floatSize() {
        assertEquals(Float.SIZE, __);
    }

    private Class<?> getType(int value) {
        return int.class;
    }

    private Class<?> getType(long value) {
        return long.class;
    }

    private Class<?> getType(float value) {
        return float.class;
    }

    private Class<?> getType(double value) {
        return double.class;
    }

    private Class<?> getType(byte value) {
        return byte.class;
    }

    private Class<?> getType(char value) {
        return char.class;
    }

    private Class<?> getType(short value) {
        return short.class;
    }

    private Class<?> getType(Object value) {
        return value.getClass();
    }

}
