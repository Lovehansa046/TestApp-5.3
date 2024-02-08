import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Введите Вещественное число X: ");
        double X = readInput(scanner);

        System.out.print("Введите целое число N: ");
        int N = readIntInput(scanner);

        System.out.println("X: " + X);
        System.out.println("N: " + N);

        double ExpressionParameters = App.CalculateExpressionResult(X, N);

        System.out.println("Значение выражения: " + ExpressionParameters);

        scanner.close();
    }

    private static double readInput(Scanner scanner) {
        while (true) {
            String input = scanner.next();
            try {
                // Заменяем запятые на точки перед парсингом
                return Double.parseDouble(input.replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите число с разделителем '.' или ','.");
            }
        }
    }

    private static int readIntInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите целое число.");
                scanner.next(); // Очищаем буфер после ошибочного ввода
            }
        }
    }

    public static double calculateExpression(double X, int N) {
        double result = 0;
        for (int i = 0; i <= N; i++) {
            result += Math.pow(-1, i) * Math.pow(X, 2 * i + 1) / (2 * i + 1);
        }
        result = Math.round(result * 1000.0) / 1000.0;
        return result;
    }
}