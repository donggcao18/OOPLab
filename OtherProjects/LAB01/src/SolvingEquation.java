import java.util.Scanner;

public class SolvingEquation {
    public static void solveLinearEquation(double a, double b) {
        double solution = -b / a;
        System.out.println("x: " + solution);

    }

    public static void solveLinearSystem(double a1, double b1, double c1, double a2, double b2, double c2) {
        double determinant = a1 * b2 - b1 * a2;

        if (determinant == 0) {
            System.out.println("No unique solution");
        } else {
            double x = (c1 * b2 - b1 * c2) / determinant;
            double y = (a1 * c2 - c1 * a2) / determinant;
            System.out.println("x: : " + x);
            System.out.println("y: " + y);
        }
    }

    public static void solveQuadraticEquation(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real solutions: x1 = " + root1 + ", x2 = " + root2);
        } else if (delta == 0) {
            double root = -b / (2 * a);
            System.out.println("One real solution: x = " + root);
        } else {
            System.out.println("No real solutions.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First-degree equation with one variable
        System.out.println("linear equation");
        System.out.print("Enter A: ");
        double a = scanner.nextDouble();
        System.out.print("Enter B: ");
        double b = scanner.nextDouble();
        solveLinearEquation(a, b);

        // System of first-degree equations
        System.out.println("\nSystem of linear equations");
        System.out.print("Enter A1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter B1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter C1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter A2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter B2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Enter C2: ");
        double c2 = scanner.nextDouble();
        solveLinearSystem(a1, b1, c1, a2, b2, c2);

        System.out.println("\n Quadratic equation ");
        System.out.print("Enter A: ");
        double qa = scanner.nextDouble();
        System.out.print("Enter B: ");
        double qb = scanner.nextDouble();
        System.out.print("Enter C: ");
        double qc = scanner.nextDouble();
        solveQuadraticEquation(qa, qb, qc);
    }
}
