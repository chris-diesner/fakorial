import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        System.out.println("Welche Zahl möchtest du faktorisieren?:");
        input = scanner.nextInt();
        System.out.println("Das Ergebnis von " + input + "! = " + getFactorial(input));
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
