//Calculating the Fibonacci Sequence
//        The Fibonacci sequence is a series of numbers where each number is the sum of the previous two numbers. Write a recursive method to generate the first 15 numbers of the Fibonacci sequence. Note that the Fibonacci value for 0 is 0, and the Fibonacci value for 1 is 1.
//
//        The Fibonacci sequence goes 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, and so on.
//
//        So, you can use the following as a guide:
//
//        fibonacci(4) =
//        fibonacci(3) + fibonacci(2) =
//        {fibonacci(2) + fibonacci(1)} + {fibonacci(1) + fibonacci(0)} =
//        {fibonacci(1) + fibonacci(0) + fibonacci(1) + fibonacci(0)} + {fibonacci(1) + fibonacci(0)} =
//        1 + 0 + 1 + 0 + 1 + 0 = 3
//        We'll use a recursive method to calculate the Fibonacci value for a given input, and then create a loop to display the sequence. To do so, perform the following steps:
//
//        Create the fibonacci method.
//        Check if the value passed to the fibonacci method is 0, if yes then return 0.
//        Also, check if the value passed to the fibonacci method is 1, if yes then return 1.
//        Else, add the fibonacci values of the previous two numbers.
//        In the main method, create a for loop that initializes from 0 to 15 and call the fibbonaci method.
//        When you run your program, you should see an output like the following:
//
//        0
//        1
//        1
//        2
//        3
//        5
//        8
//        13
//        21
//        34
//        55
//        89
//        144
//        233
//        377



public class Fibonacci {
    public static int fibonacci (int number ) {
        if (number == 0) {
            return number;
        } else if
          (number == 1) {
            return 1;
        } else {
           return (fibonacci(number - 1) + fibonacci(number -2));
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 17; i++) {
            System.out.println( fibonacci(i));
        }
    }
}
