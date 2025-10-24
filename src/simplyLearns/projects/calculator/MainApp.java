package simplyLearns.projects.calculator;

import java.util.*;
import java.util.regex.*;

public class MainApp {
    public static void main(String[] args) {
        // Read expression from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an expression (e.g. 5+3*2-4): ");
        String inputExp = sc.nextLine().replaceAll("\\s+", ""); // remove spaces

        // Split numbers and operators
        String[] numberArr = inputExp.split("[-+*/]");
        String[] operArr = inputExp.replaceAll("[0-9.]+", "").split("");

        Queue<String> numbers = new LinkedList<>(Arrays.asList(numberArr));
        Queue<String> operations = new LinkedList<>();

        // Filter out empty operators
        for (String op : operArr) {
            if (!op.isEmpty()) operations.add(op);
        }

        double res = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty() && !operations.isEmpty()) {
            String opr = operations.poll();
            double num = Double.parseDouble(numbers.poll());

            Operate operate;

            switch (opr) {
                case "+": operate = new Add(); break;
                case "-": operate = new Subtract(); break;
                case "*": operate = new Multiply(); break;
                case "/": operate = new Divide(); break;
                default:
                    System.out.println("Unknown operator: " + opr);
                    continue;
            }

            res = operate.getResult(res, num);
        }

        System.out.println("Result: " + res);
        sc.close();
    }
}
