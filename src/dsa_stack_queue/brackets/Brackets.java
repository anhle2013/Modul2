package dsa_stack_queue.brackets;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        boolean trueExpression;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression to check brackets:");
        String expression = scanner.nextLine();

        trueExpression = isTrueExpression(expression);
        if (trueExpression)
            System.out.println("Brackets in the expression are TRUE");
        else System.out.println("Brackets in the expression are FALSE");
    }

    public static boolean isTrueExpression(String expression) {
        char[] characters = expression.toCharArray();
        char[] leftBrackets = {'(','[','{'};
        char[] rightBrackets = {')',']','}'};
        Stack<Character> lefts = new Stack<>();
        Stack<Character> brackets = new Stack<>();
        for (char character: characters) {
            for (char leftBracket: leftBrackets)
                if (character == leftBracket) {
                    lefts.push(character);
                    brackets.push(character);
                }
            for (char rightBracket: rightBrackets)
                if (character == rightBracket) {
                    if (brackets.isEmpty() || character != lefts.pop())
                        return false;
                    brackets.pop();
                }
        }
        return brackets.isEmpty();
//        char leftBracket = '(';
//        char rightBracket = ')';
//
//        Stack<Character> stack = new Stack<>();
//        for (char character: characters) {
//            if (character == leftBracket)
//                stack.push(leftBracket);
//            if (character == rightBracket) {
//                if (stack.isEmpty())
//                    return false;
//                else stack.pop();
//            }
//        }
//        return stack.isEmpty();
    }
}
