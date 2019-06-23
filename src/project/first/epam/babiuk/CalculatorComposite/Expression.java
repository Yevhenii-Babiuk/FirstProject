package project.first.epam.babiuk.CalculatorComposite;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Expression {

    public boolean isOperator(char c) {
        switch (c) {
            case '-':
            case '+':
            case '*':
            case '/':
                return true;
        }
        return false;
    }

    public byte priority(char p) {
        switch (p) {
            case '*':
            case '/':
                return 2;
        }
        return 1;
    }

    public String rpn(String input) throws Exception {
        StringBuilder stack = new StringBuilder(), out = new StringBuilder();
        char charIn, charTemp;

        for (int i = 0; i < input.length(); i++) {
            charIn = input.charAt(i);
            if (isOperator(charIn)) {
                while (stack.length() > 0) {
                    charTemp = stack.substring(stack.length() - 1).charAt(0);
                    if (isOperator(charTemp) && (priority(charIn) <= priority(charTemp))) {
                        out.append(" ").append(charTemp).append(" ");
                        stack.setLength(stack.length() - 1);
                    } else {
                        out.append(" ");
                        break;
                    }
                }
                out.append(" ");
                stack.append(charIn);
            } else if (charIn == '(') {
                stack.append(charIn);
            } else if (charIn == ')') {
                charTemp = stack.substring(stack.length() - 1).charAt(0);
                while (charTemp != '(') {
                    if (stack.length() < 1) {
                        throw new Exception("Wrong input");
                    }
                    System.out.println(out);
                    out.append(" ").append(charTemp);
                    System.out.println(out);
                    stack.setLength(stack.length() - 1);
                    charTemp = stack.substring(stack.length() - 1).charAt(0);
                }
                stack.setLength(stack.length() - 1);
            } else {
                out.append(charIn);
            }
        }
        while (stack.length() > 0) {
            out.append(" ").append(stack.substring(stack.length() - 1));
            stack.setLength(stack.length() - 1);
        }
        return out.toString();
    }

    public double calculate(String s) throws Exception {
        Calculator a;
        Calculator b;
        String temp;
        Deque<Calculator> stackCalc = new ArrayDeque<>();
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()) {
            try {
                temp = tokenizer.nextToken().trim();
                if (temp.length() == 1 && isOperator(temp.charAt(0))) {
                    if (stackCalc.size() < 2) {
                        throw new Exception("Wrong amount of data in stack for operation: " + temp);
                    }
                    b = new Value(stackCalc.pop().calculate());
                    a = new Value(stackCalc.pop().calculate());
                    switch (temp.charAt(0)) {
                        case '+':
                            a = new Summing(a, b);
                            break;
                        case '-':
                            a = new Subtraction(a, b);
                            break;
                        case '/':
                            a = new Division(a, b);
                            break;
                        case '*':
                            a = new Multiplier(a, b);
                            break;
                        default:
                            throw new Exception("Wrong operation: " + temp);
                    }
                    stackCalc.push(a);
                } else {
                    a = new Value(Double.parseDouble(temp));
                    stackCalc.push(a);
                }
            } catch (Exception e) {
                throw new Exception("Wrong symbol in expression");
            }
        }

        if (stackCalc.size() > 1) {
            throw new Exception("Amount of operators doesn't match to amount of operands");
        }

        return stackCalc.pop().calculate();
    }
}
