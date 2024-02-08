public class App {
    public static double[] calculateTriangleParameters(double x1, double y1, double x2, double y2, double x3, double y3) {
        double d12 = TriangleProperties.calculateDistance(x1, y1, x2, y2);
        double d23 = TriangleProperties.calculateDistance(x2, y2, x3, y3);
        double d31 = TriangleProperties.calculateDistance(x3, y3, x1, y1);

        double perimeter_previously = TriangleProperties.calculatePerimeter(d12, d23, d31);
        double perimeter = Math.round(perimeter_previously * 100.0) / 100.0;
        double semiPerimeter = perimeter / 2;

        double area_previously = TriangleProperties.calculateArea(semiPerimeter, d12, d23, d31);
        double area = Math.round(area_previously * 100.0) / 100.0;


        return new double[]{perimeter, area};
    }

    public static double[] calculateArea (double R1, double R2){
        if (R2 >= R1) {
            throw new IllegalArgumentException("Ошибка: R2 должен быть меньше R1.");
        }

        double S1 = calculateArea.calculateCircleArea(R1);
        double S2 = calculateArea.calculateCircleArea(R2);
        double S3 = calculateArea.calculateRingArea(R1, R2);

        return new double[]{S1, S2, S3};
    }

    public static double CalculateExpressionResult (double X, int N) {
        double expressionResult = CalculateExpression.calculateExpression(X, N);
        return expressionResult;
    }
}
