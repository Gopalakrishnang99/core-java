package org.branch.datatype;

/**
 * @author Gopalakrishnan
 * <p>
 * Implicit and explicit type conversions
 */
public class TypeConversionLeaf {

    public static void main(String[] args) {

        // Automatic type conversion can take place when the two types are compatible
        // and the conversion is a widening conversion, i.e, the destination type is larger
        // than the source type.
        // Long can be assigned to double without casting but the reverse is not possible
        // since it is not a widening conversion
        long longValue = 123L;
        double doubleValue = 123.5;

        // longValue = doubleValue; This is an error

        doubleValue = longValue; //This is allowed

        System.out.println(doubleValue);

        // Same for other types too.
        int intValue = 123;
        short shortValue = 125;
        // shortValue = intValue; This is an error
        intValue = shortValue;

        System.out.println(intValue);

        float floatValue = 123.5F;
        // floatValue = doubleValue;  This is an error
        doubleValue = floatValue;

        System.out.println(doubleValue);

        // Explicit type conversions
        // When implicit conversion does not work and a conversion is necessary, the value can be explicitly cast to
        // the required type. If it is a narrowing conversion, i.e, the destination type is not large enough to hold
        // the value, some information might be lost.

        byte byteValue = 127;
        byteValue = (byte) intValue; // Explicit conversion to byte, but no loss as 123 can be held by byte type

        System.out.println(byteValue);

        floatValue = 989.24F;
        intValue = (int) floatValue; // Explicit conversion to int, loss of information as digits after decimal point
        //is truncated

        System.out.println(intValue);

        char charValue = 'A';
        charValue = (char) intValue; // Explicit conversion

        System.out.println(charValue);

        // Type conversion in expressions
        // When an expression involves multiple types, then the types are all promoted to a common type and the operations
        // are performed. So, short, byte, char are promoted to int. Then if long is involved, int is promoted to long.
        // If float is involved long is promoted to float. The same for double

        byteValue = 10;
        // Here an explicit cast is needed as the expression (byteValue * byteVale) results in an int value as the
        // individual byteValue is promoted to int.
        byteValue = (byte) (byteValue * byteValue);
    }
}
