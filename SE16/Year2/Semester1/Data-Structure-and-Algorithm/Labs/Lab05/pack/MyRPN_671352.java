package pack;

// ComputeRPN.java
import java.util.StringTokenizer;
import java.util.regex.Pattern;

import pack.MyStack;

public class MyRPN {
    private static Pattern pattern = Pattern.compile("-?\\d+(\\.\\+)?");
    
    public static boolean isNumeric(String strNum) {
        if (strNum == null) return false;
        return pattern.matcher(strNum).matches();
    }

    public static double computeRPN(String rpn) {

        MyStack<Double> stack = new MyStack<Double>();
        StringTokenizer st = new StringTokenizer(rpn);

        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            if (isNumeric(t)) {
                stack.push(Double.parseDouble(t));
            } else {
                double b = stack.pop();
                double a = stack.pop();
                if (t.equals("+")) {
                    stack.push(a+b);
                } else if (t.equals("-")) {
                    stack.push(a-b);
                } else if (t.equals("*")) {
                    stack.push(a*b);
                } else if (t.equals("/")) {
                    stack.push(a/b);
                } else {
                    System.out.println("Error: Invalid Expression");
                }
            }
        }

        return stack.pop();
    }

}
