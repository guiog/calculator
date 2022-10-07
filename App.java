import java.util.Scanner;

// Inputs from terminal to specify calculators behavior

public class App {
    static final Scanner inputScanner = new Scanner(System.in);

    // private static String getString(String prompt) {
    //     System.out.println(prompt);
    //     return;
    // }
    
    // private static double getDouble(String prompt) {
    //     System.out.println(prompt);
    //     return;
    // }

    

    public static void main(String[] args) {
        double num1 = 5;
        double num2 = 3;
        Calculator calc = new Calculator();
        calc.add(num1, num2);
    }
}