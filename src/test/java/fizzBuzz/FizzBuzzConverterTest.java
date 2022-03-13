package fizzBuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzConverterTest {
@Test
    public void fizzbuzzconvertershouldReturn1WhenInputIs1(){
    FizzBuzzConverter fizzbuzzconverter = new FizzBuzzConverter() ;
    String result= fizzbuzzconverter.converter(1);
    Assertions.assertEquals("1",result);}
}