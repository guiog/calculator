import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);

    private static String getString(String prompt) {
        System.out.println(prompt);
        String x = inputScanner.nextLine();
        return x;
    }
    
    private static double getDouble(String prompt) {
        System.out.println(prompt);
        Double num = inputScanner.nextDouble();
        return num;
    }

    public static void main(String[] args) {
        double num1;
        double num2;
        String operation = "";
        Calculator calc = new Calculator();
        double calcAnswer;
        
        operation = getString("What would you like to do with the numbers? add, sub, mult, div");
        num1 = getDouble("Please enter the first number ");
        num2 = getDouble("Please enter the second number ");

        if (operation == "add") {
            System.out.println("I made it into add");
            calcAnswer = calc.add(num1, num2);
            System.out.println(calcAnswer);
        }
        if (operation == "sub") {
            calcAnswer = calc.subtract(num1, num2);
            System.out.println(calcAnswer);
        }
        if (operation == "mult") {
            calcAnswer = calc.multiply(num1, num2);
            System.out.println(calcAnswer);
        }
        if (operation == "div") {
            calcAnswer = calc.divide(num1, num2);
            System.out.println(calcAnswer);
        }

        System.out.println("Goodbye");
    }
}