package org.branch.datatype;

/**
 * @author Gopalakrishnan
 *
 * Literals are constants of the primitive types in human-readable form
 */
public class LiteralsLeaf {

    public static void main(String[] args) {

        //Numeric type
        //Numeric values can be separated by underscores for better readability
        //Numeric values are by default int literals. For creating a long type literal
        //we append the character 'L' or 'l' to the end. Int literals can be assigned to types
        //such as short, byte, char as long as it is within the type's range
        int integerValue = 123_456;
        long longValue = 123_456L;
        short shortValue = 123;

        //Decimal types
        //Decimal values can be separated by underscores for better readability
        //Decimal values are by default double literals. For creating a float type literal
        //we append the character 'F' or 'f' to the end.
        double doubleValue = 123_345.8;
        float floatValue = 123_345.8F;
        //Decimal values can also be expressed in e form
        double expForm = 123e3;

        //Both numeric and decimal values can be expressed in other number system such as
        //octal and hexadecimal
        int hexValue = 0X123;
        int octalValue = 0123;
        int binaryValue = 0B1100;

        System.out.println(hexValue+ " " + octalValue + " " + binaryValue);
    }
}
