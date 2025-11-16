/*
 * This class demonstrates different types of comments in Java:
 * single-line, multi-line, and documentation comments.
 */
public class Basics3 {
    // This is a single-line comment.
    // It explains the purpose of the main method.
    public static void main(String[] args) {
        System.out.println("Comment Examples");
        /*
         * This is a multi-line comment.
         * to provide more detailed explanations
         * or to comment out blocks of code temporarily.
         */
        int a = 10;
        int b=20;
        System.out.println("The number is: " + a);
        System.out.println(calculateSum(a,b));
    }
        /*
        * This is a documentation comment for a method.
        * It describes the purpose of the `calculateSum` method.
        * @param a The first integer for the sum.
        * @param b The second integer for the sum.
        * @return The sum of 'a' and 'b'.
        */
        public static int calculateSum (int x, int y){
            return x + y;
        }
}
