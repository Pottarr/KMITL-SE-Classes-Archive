# Stack Abstract Data Type (Stack ADT)

## What is ADT?

Answer: The structure of our interest has methods fro us to use.

## What is Stack?

Answer: A collection of data where you can `add/remove` a data `to/from` its `*top*`.

- This makes it `LIFO` (Last in first out).

## Stack ADT

- Required operations
    - `void push(int d)`
    - `int pop()`
- Convenient operation
    - `int top()`
- Utility operations
    - `boolean isFull()`
    - `boolean isEmpty()`
    - `String toString()`

```java
// Stack implementation for int
public class MyStack {
    public void push(int d) {           // <--- From here
        // your code here               
    }
    public int pop(int d) {
        // your code here
    }
    public int top(int d) {
        // your code here
    }
    public boolean isFull(int d) {
        // your code here
    }
    public boolean isEmpty(int d) {
        // your code here
    }                                   // <--- to here mut be O(1)
    public String toString(int d) {
        // your code here
    }
}
```

### Stack (Array Implementation)

```java
// Stack implementation for int made with Array
public class MyStackA {
    int MAX_SIZE = 100;
    int stack[] = new int[MAX_SIZE];
    int top = 0;

    public void push(int d) {
        stack[top++] = d;
    }

    public int pop() {
        return stack[--top];
    }

    public int top() {
        return stack[top - 1]; // Make sure stack is not empty
    }

    public boolean isFull() {
        return top == MAX_SIZE;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}
```

If we wrap our ArrayList to be our stack then it can expand.

### Stack (Linked List Implementation)

```java
public class MyStackL { 
    
}
```

## Reverse Polish Notation (RPN)

There are 3 types of Notations

- Infix -> The only tyoe of notation which need  parentheses
- Prefix -> As fast as Postfix but just not that popular
- Postfix -> Mainly used in public

Example:

- Infix: $((8 - 5) * (4 + 2) / 3))$
- Prefix: $* - 8\ 5\ / + 4\ 2\ 3$
- Prefix: $8\ 5 - 4\ 2 + 3 / -$

### Infix to Postfix Conversion

Step-by-Step Conversion

$A + B * C$

- Fully parenthesize the expression (Add parentheses to show presedence)  
$(A + (B * C))$
    > [!NOTE]
    > You can see that each operator i enclosed in the parentheses.

- Postfix Rule (Operators to the Right): Move the operator to the right  
of its operand pair, and remove parentheses.
    - $(B * C) \rightarrow B\ C\ *$
    - $(A + (B\ C\ *)) \rightarrow A\ B\ C\ *\ +$
- Final Answer: $A\ B\ C\ *\ +$

#### Implementation: Testing String Tokenizer

```java
// ComputeRPN.java
import java.util.Scanner;
import java.util.StringTokenizer;

public class ComputeRPN {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner in new Scanner(System.in);
        String rpn = in.nextLine();
        StringTokenizer st = new StringTokenizer(rpn);

        while (st.hasMoreToken()) {
            String t = st.nextToken();
            System.out.println(t);
        }
        in.close();
    }
}
```

#### Implementation: Testing is Numeric

```java
// ComputeRPN.java
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class ComputeRPN {

    private static Pattern pattern = Pattern.compile("-?]]d+(\\.\\d+)?");

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner in = new Scanner(System.in);
        String rpn = in.nextLine();
        StringTokenizer st = new StringTokenizer(rpn);

        while (st.hasMoreToken()) {
            String t = st.nextToken();
            System.out.println(t + " is a number -> " + isNumeric(t));
        }
    in.close();
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return Pattern.matcher(strNum).matches();
    }
}
```

#### Implementation: Infix to Postfix Expression

```java
// InfixToPosfixExp.java
import util.java.Stack;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InfixToPosfixExp {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner in = new Scanner(System.in);
        String rpn = in.nextLine();
        StringTokenizer st = new StringTokenizer(rpn);

        while (st.hasMoreToken()) {
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
                    println("Error: Invalid Expression");
                    return;
                }
            }
        }
        System.out.println("Result: " + stack.pop());
    }
}
```

> [!IMPORTANT]
> Always pop the right operand first
