package utils;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static utils.ListFactory.*;

class ListFactoryTest {
    @Test
    public void ListFactoryShouldReturnExceptionWhenInputIs0(){
        assertThrows(IllegalArgumentException.class, () -> convert(0));
    }

    @Test
    public void ListFactoryShouldReturnExceptionWhenInputIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> convert(-1));
    }
    @Test
    public void ListFactoryShouldReturnListFromOneToNumber(){
        Assertions.assertEquals(convert(4), List.of(1,2, 3, 4));
    }
}