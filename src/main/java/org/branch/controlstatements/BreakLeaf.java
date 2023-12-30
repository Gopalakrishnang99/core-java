package org.branch.controlstatements;

/**
 * @author Gopalakrishnan
 * <p>
 * The break statement can be used to break out of loop statements and the switch statements. Break with label can be
 * used like a 'goto' statement to transfer control to outer loops and such.
 */
public class BreakLeaf {

    public static void main(String[] args) {

        // Simple break;
        for (int i = 0; i < 45; i++) {
            System.out.println("i: " + i);
            if (i == 5)
                break;
        }

        // Labelled break

        one:
        for (int i = 0; i < 5; i++) {
            two:
            for (int j = 0; j < 5; j++) {
                three:
                for (int k = 0; k < 5; k++) {
                    System.out.println("i: " + i + " ,j: " + j + " ,k: " + k);
                    if (k == 4)
                        break one; // Here I'm breaking out of the 'one' block so the loop will end
                }
            }
        }

        // The placement of label is important as can be seen from the below code

        for (int i = 0; i < 5; i++)
            one:{
                for (int j = 0; j < 5; j++)
                    two:{
                        for (int k = 0; k < 5; k++)
                            three:{
                                System.out.println("i: " + i + " ,j: " + j + " ,k: " + k);
                                if (k == 1)
                                    break one; // Here since the label if for the loop body, the current iterations is
                                               // broke and the next one begins for that loop.
                            }
                    }
            }

    }
}
