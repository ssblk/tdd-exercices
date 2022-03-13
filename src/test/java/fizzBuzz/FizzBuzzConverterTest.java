package fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzConverterTest {
@Test
    public void fizzbuzzconvertershouldReturn1WhenInputIs1(){
    FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
    String result= fizzbuzzconverter.converter(1);
    Assertions.assertEquals("1",result);}

    @Test
    public void fizzbuzzconvertershouldReturn2WhenInputIs2(){
        FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
        String result= fizzbuzzconverter.converter(2);
        Assertions.assertEquals("2",result);}

    @Test
    public void fizzbuzzconvertershouldReturnFizzWhenInputIs3(){
        FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
        String result= fizzbuzzconverter.converter(3);
        Assertions.assertEquals("Fizz",result);}

    @Test
    public void fizzbuzzconvertershouldReturnBuzzWhenInputIs5(){
        FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
        String result= fizzbuzzconverter.converter(5);
        Assertions.assertEquals("Buzz",result);}

    @Test
    public void fizzbuzzconvertershouldReturnFizzWhenInputIsMultipleOf3(){
        FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
        String result= fizzbuzzconverter.converter(6);
        Assertions.assertEquals("Fizz",result);}

    @Test
    public void fizzbuzzconvertershouldReturnBuzzWhenInputIsMultipleOf5(){
        FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
        String result= fizzbuzzconverter.converter(10);
        Assertions.assertEquals("Buzz",result);}
}