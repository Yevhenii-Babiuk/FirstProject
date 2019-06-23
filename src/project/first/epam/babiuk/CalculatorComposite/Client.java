package project.first.epam.babiuk.CalculatorComposite;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {

    private static Expression expression;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression to calculate:  ");

        expression = new Expression();
        String input = scanner.nextLine();
        input = expression.rpn(input);
        System.out.println(expression.calculate(input));

    }
}
