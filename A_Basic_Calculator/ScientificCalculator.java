package A_Basic_Calculator;



public class ScientificCalculator extends BasicCalculator {

    // Returns the sum of the elements in a given array
    @Override
    public int summation(int[] arr) {
        int summationResult = 0;
        for (int i = 0; i < arr.length; i++) {
            summationResult = summationResult + arr[i];
        }
        return summationResult;
    }

    // Returns the result of number_1^number_2
    // Be carreful!!! Don't use Math.pow() methods
    @Override
    public int pow(int number_1, int number_2) {
        int Result = 1;
        for (int i = 0; i < number_2; i++) {
            Result = Result * number_1;
        }
        return Result;
    }

    // Returns the element in the fibonacci series according to the given index.
    // Fibonacci series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    // For example:
    //  If the index is entered as 6, the function returns the value 5.
    //  If the index is entered as 9, the function returns 21.
    //  If index is entered as 1, the function returns 0.
    @Override
    public int fibonacci(int index) {


        if (index == 1){
           return 0;
        } else if (index == 2) {
            return 1;
        } else {
            return fibonacci(index - 1) + fibonacci(index - 2);
        }


    }

    // Calculates and returns the factorial value based on the given number.
    // For example:
    //  if the number is 5, the result is 5! = 5*4*3*2*1 = 120
    @Override
    public int factorial(int number) {
        int result = 1;
        if (number == 0)
            return 1;
        else {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        }

    }

    // Find the minimum element of the given array
    @Override
    public int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min; // don't forget to delete this line
    }

    // Find the maximum element of the given array
    @Override
    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

}

