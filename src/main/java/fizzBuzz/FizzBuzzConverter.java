package fizzBuzz;

public class FizzBuzzConverter {

    public  String converter(int i) {
        if (i%3==0) return "Fizz";
        else if (i%5==0) return "Buzz";
        else
   return String.valueOf(i); }
}
