package org.branch.controlstatements;

/**
 * @author Gopalakrishnan
 * <p>
 * For is one of the loop statements provided by Java. For loop has three statements -> initialization, condition and
 * iteration. It is of the form
 * <br>
 * for(initialization; condition; iteration){<br>
 * Loop statements<br>
 * }
 */
public class ForLeaf {

    public static void main(String[] args) {

        // Simple for loop
        for (int i = 1; i < 6; i++) {
            System.out.println(" i: " + i);
        }

        // For loop statements can involve multiple variables and expressions.
        for (int i = 1, j = 10; i < 5 && j > 5; i++, j--) {
            System.out.println("i: " + i + ", j: " + j);
        }

        // For loop statements can be omitted. The semicolons are necessary even if they are omitted.
        int i = 0;
        for (; ; ) {
            if (i > 10) break;
            System.out.println("i: " + i++);
        }

        // For loop body is not necessary. This method can be used to do some calculation that can be fit in the loop
        // itself
        int sum = 0;
        int k = 1;
        for (; k <= 5; sum += k++) ;
        System.out.println("Sum of the first five natural numbers is "+sum);
    }
}
