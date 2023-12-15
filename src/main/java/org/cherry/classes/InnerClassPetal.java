package org.cherry.classes;

/**
 * @author ggopalakrishnan
 * <p>
 * An inner class object is always associated with an instance of its enclosing class.
 */
public class InnerClassPetal {

    public static void main(String[] args) {

        // Creating an outer class instance and calling its method. The method implementation might
        // use an instance of inner class. The inner class will be provided with this object's reference
        // implicitly
        OuterClass phrase = new OuterClass(
                "The quick brown fox jumps over the lazy dog"
        );
        phrase.countVowels();

        // Here the outer class instance is created and the created instance is used to create an instance
        // of the inner class. The outer class instance reference is passed explicitly to the instance
        // of the inner class.
        OuterClass phrase2 = new OuterClass("Hello world!");
        OuterClass.InnerClass inner2 = phrase2.new InnerClass();
        System.out.println("Using inner class method directly to count vowel 'a' - " + inner2.countCharacter('a'));
    }
}

final class OuterClass {

    private final String phrase;

    public OuterClass(String phrase) {
        this.phrase = phrase;
    }

    public void countVowels() {
        InnerClass inner = new InnerClass(); //Implicitly passed the current outer class reference(this)
        System.out.println("Vowel 'a' - " + inner.countCharacter('a'));
        System.out.println("Vowel 'e' - " + inner.countCharacter('e'));
        System.out.println("Vowel 'i' - " + inner.countCharacter('i'));
        System.out.println("Vowel 'o' - " + inner.countCharacter('o'));
        System.out.println("Vowel 'u' - " + inner.countCharacter('u'));
    }

    class InnerClass {

        public static int staticField = 1;

        public static void staticMethod() {
            System.out.println("Static method");
        }

        public int countCharacter(char c) {
            // Members of the enclosing class object can be accessed by using the enclosing class name
            // For e.g. String outerClassVariable = OuterClass.this.phrase;
            int count = 0;
            for (char i : phrase.toCharArray())
                if (i == c)
                    count++;
            return count;
        }
    }
}
