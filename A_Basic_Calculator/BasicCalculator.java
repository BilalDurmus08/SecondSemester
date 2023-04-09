package A_Basic_Calculator;


public abstract class BasicCalculator {

    // Returns the summation of number_1 and number_2 => number_1 + number_2
    public int summation(int number_1, int number_2) {
        int summationResult;
        summationResult = number_1 + number_2;
        return summationResult;
    }

    // Returns the result of subtracting the number 2 from the number 1 => number_1 - number_2
    public int subtraction(int number_1, int number_2) {
        int subtractionResult;
        subtractionResult = number_1 - number_2;
        return subtractionResult;
    }

    // Returns the multiplication of number_1 and number_2 => number_1 * number_2
    public int multiplication(int number_1, int number_2) {
        int multiplicationResult;
        multiplicationResult = number_1 * number_2;
        return multiplicationResult;
    }

    // Returns number_1 divided by number_2 => number_1/number_2
    public double division(int number_1, int number_2) {
        double divisionResult;
        divisionResult = number_1 / number_2;
        return divisionResult;
    }

    // abstract method
    public abstract int summation(int[] arr);

    // abstract method
    public abstract int pow(int number_1, int number_2);

    // abstract method
    public abstract int fibonacci(int index);

    // abstract method
    public abstract int factorial(int number);

    // abstract method
    public abstract int min(int[] arr);

    // abstract method
    public abstract int max(int[] arr);


}
