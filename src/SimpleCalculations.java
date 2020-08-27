public class SimpleCalculations {
    public static void main(String[] args) {
        /*Exercise 1.2 - Simple Calculations
        Declare two numeric variables with arbitary values. Calculate their sum, difference, product and quotient and print the calculation with the result on the console with System.out.println/System.out.printf.
        Perform all calculations with whole numbers and fractional numbers.
        Bonus: Try to limit the decimal places of your calculations with the fractional numbers.*/

        int x, y;
        double a, b;

        x = 123;
        y = 321;
        a = 1.23;
        b = 3.21;

        System.out.printf("%d + %d = %d", x, y, (x + y));
        System.out.println();
        System.out.printf("%d - %d = %d", x, y, (x - y));
        System.out.println();
        System.out.printf("%d * %d = %d", x, y, (x * y));
        System.out.println();
        System.out.printf("%d / %d = %d", x, y, (x / y));

        System.out.println();
        System.out.println();
        System.out.printf("%.2f + %.2f = %.2f", a, b, (a + b));
        System.out.println();
        System.out.printf("%.2f - %.2f = %.2f", a, b, (a - b));
        System.out.println();
        System.out.printf("%.2f * %.2f = %.2f", a, b, (a * b));
        System.out.println();
        System.out.printf("%.2f / %.2f = %.2f", a, b, (a / b));
    }
}