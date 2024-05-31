package ch01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MaxValueTest {
    @Test
    void max(){
        int result = MaxValue.max(3,4,5);
        assertEquals(5,result);
        assertEquals(9,MaxValue.max(6,8,9));
        assertEquals(6,MaxValue.max(6,6,6));
        assertEquals(8,MaxValue.max(8,7,8));
    }
}
