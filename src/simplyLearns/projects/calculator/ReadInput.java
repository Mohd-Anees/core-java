package simplyLearns.projects.calculator;

import java.util.Scanner;

class ReadInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static String read() {
        System.out.print("Input expression (e.g., 4*3/2): ");
        String inputLine = scanner.nextLine().replaceAll("\\s+", "");
        return inputLine;
    }
}
