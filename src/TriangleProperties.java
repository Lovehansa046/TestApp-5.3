import java.util.Scanner;

public class TriangleProperties {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты вершины A (x1 y1):");
        System.out.print("x1 = ");
        double x1 = readInput(scanner);
        System.out.print("y1 = ");
        double y1 = readInput(scanner);

        System.out.println("Введите координаты вершины B (x2 y2):");
        System.out.print("x2 = ");
        double x2 = readInput(scanner);
        System.out.print("y2 = ");
        double y2 = readInput(scanner);

        System.out.println("Введите координаты вершины C (x3 y3):");
        System.out.print("x3 = ");
        double x3 = readInput(scanner);
        System.out.print("y3 = ");
        double y3 = readInput(scanner);

        double[] triangleParameters = App.calculateTriangleParameters(x1, y1, x2, y2, x3, y3);


        System.out.println("Периметр треугольника: " + triangleParameters[0]);
        System.out.println("Площадь треугольника: " + triangleParameters[1]);

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
    static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    static double calculatePerimeter(double d12, double d23, double d31) {
        return d12 + d23 + d31;
    }

    static double calculateArea(double semiPerimeter, double d12, double d23, double d31) {
        return Math.sqrt(semiPerimeter * (semiPerimeter - d12) * (semiPerimeter - d23) * (semiPerimeter - d31));
    }
}
