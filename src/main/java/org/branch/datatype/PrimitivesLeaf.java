package org.branch.datatype;

/**
 * @author Gopalakrishnan
 *
 * Primitve values are the basic types offered by Java
 */
public class PrimitivesLeaf {

    public static void main(String[] args) {

        //Numeric types

        //can't assign more than 127 -> 2^8 - 1
        byte a = 127;

        //can't assign more than 32767 -> 2^16 - 1
        short b = 32767;

        // -> 2^32 - 1
        int c = 2147483647;

        // -> 2^64 - 1, need to end with the L since the default numeric literal is an int
        long d = 9223372036854775807L;

        //Decimal values

        //Single precision number, need to end with F since the default decimal literal is a double
        float e = 4.3F;

        //Double precision number
        double f = 4.3;

        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);

        //Character type
        //Character literals are surrounded by single quotes
        char g = 'z';
        System.out.println("Char "+g);

        //character is a 16 bit unicode. Arithmetic ops can be performed on it like a number and assigned a number
        g--;
        System.out.println("Decremented char "+g);

        //Boolean value
        boolean h = true;
        System.out.println("Boolean "+h);


    }
}
