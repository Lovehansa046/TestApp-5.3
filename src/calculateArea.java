import java.util.Scanner;

public class calculateArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        System.out.print("Введите внешний радиус R1 (R1 должен быть больше R2): ");
        double R1 = readRadius(scanner);

        System.out.print("Введите внутренний радиус R2 (R2 должен быть меньше R1): ");
        double R2 = readRadius(scanner);



        double[] AreaParameters = App.calculateArea(R1, R2);


        System.out.println("Площадь круга с радиусом R1: " + AreaParameters[0]);
        System.out.println("Площадь круга с радиусом R2: " + AreaParameters[1]);
        System.out.println("Площадь кольца с внешним радиусом R1 и внутренним радиусом R2: " + AreaParameters[2]);

        scanner.close();
    }

    private static double readRadius(Scanner scanner) {
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

    static double calculateCircleArea(double radius) {
        double pi = 3.14;
        double Sx_previously = pi * Math.pow(radius, 2);
        double Sx = Math.round(Sx_previously*100.0)/100.0;
        return Sx;
    }

    static double calculateRingArea(double outerRadius, double innerRadius) {
        double S1 = calculateCircleArea(outerRadius);
        double S2 = calculateCircleArea(innerRadius);
        double S3_previously = S1-S2;
        double S3 = Math.round(S3_previously*100.0)/100.0;
        return S3;
    }
}