package org.branch.controlstatements;

/**
 * @author Gopalakrishnan
 * <p>
 * Switch is one of the control statements available in Java. It chooses one of the multiple paths to be executed based
 * on the expression evaluated.
 */
public class SwitchLeaf {

    public static void main(String[] args) {

        String a = "Hello";

        // The given expression is evaluated which is the variable 'a' here. Then the expression value is matched
        // against the constants in each case until one of them matches. The matched case body is executed. If no case
        // is matched then the default branch will be executed. No two cases must match i.e, no duplicate cases must
        // exist. The default branch is optional.
        switch (a) {
            case "Hello":
                System.out.println("This is the matched case");
                break;
            //case "Hello":   --> Duplicate case, won't compile
            //    System.out.println("Duplicate case");
            case "World":
                System.out.println("This will ne be matched");
                break;
            default:
                System.out.println("This will be executed when no case is matched");
        }

        // Each case should end with the 'break' statement or else the control flow through the next case until it
        // encounters a 'break' statement or the end of switch is reached. This can be used to write common statements.

        char b = 'A';

        switch (b){
            case 'A':
            case 'Z':
            case 'a':
            case 'z':
                System.out.println("Character is either the start or end of the alphabets");
                break; // Without this break it would execute the next case which is the default case here.
            default:
                System.out.println("Default branch");
        }

    }
}
