package functonalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function - takes one argument and produces one reult
        int increment = increment(0);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(1); //apply - used for passing arguments
        System.out.println(increment2);

        Integer multiplyBy10 = multiplyBy10Function.apply(increment2);
        System.out.println(multiplyBy10);

        //Combine two functions - // chaining function together
        Function<Integer, Integer> addByOneMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addByOneMultiplyBy10.apply(1));

        //BiFunction - takes two arguments and produces 1 result
        System.out.println(incrementAndMultiply(3, 100));

        //BiFunction
        System.out.println(incrementAndMultiplyBiFunction.apply(3, 100));
    }

    static int increment(Integer number) {
        return number + 1;
    }

    static int incrementAndMultiply(int num, int numToMultiply) {
        return (num + 1) * numToMultiply;
    }

    //Function<T,R> - accepts one argument and produces a result, T,R - Data types of input and output
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    //BiFunction

    static BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction =
            (numToIncrement, numToMultiply) -> (numToIncrement + 1) * numToMultiply;
}
