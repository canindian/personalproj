public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(5);
        checkNumber(0);
        checkNumber(-1);

    }
    public static void checkNumber (int number) {
        if (number > 0) {
            System.out.println("The number was positive.");
        } else if (number < 0) {
            System.out.println("The number was negative.");
        } else if (number == 0) {
            System.out.println("The number was zero.");
        }
    }
}
