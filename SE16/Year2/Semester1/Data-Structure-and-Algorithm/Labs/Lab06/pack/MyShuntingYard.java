package Lab06.pack;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import Lab05.pack.MyStack;
import Lab06.pack.MyQueueL_671352;

public class MyShuntingYard {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\+)?");

    public static boolean isNumeric(String strNum) {
        if (strNum == null) return false;
        return pattern.matcher(strNum).matches();
    }

    private static int order(String c) {
        return switch (c) {
            case "+", "-" -> 1;
            case "*", "/" -> 2;
            default -> 0;
        };
    }

    public static String infixToPostfix(String infixString) {
        MyStack<String> stack = new MyStack<>();
        MyQueueL_671352<String> queue = new MyQueueL_671352<>();
        StringTokenizer st = new StringTokenizer(infixString);
        String result = new String();

        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            if (isNumeric(t) == true) {
                queue.enqueue(t);
            } else if (t.equals("(")) {
                stack.push(t);
            } else if (t.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("("))
                    queue.enqueue(stack.pop());
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && order(stack.peek()) >= order(t))
                    queue.enqueue(stack.pop());
                stack.push(t);

            }
        }
        while (!stack.isEmpty())
            queue.enqueue(stack.pop());

        for (String s : queue) {
            result += " ";
            result += s;
        }

        System.out.println(result);

        return result;
    }
}
