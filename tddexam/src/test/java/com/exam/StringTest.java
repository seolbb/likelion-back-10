package com.exam;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void subString(){
        String str = "abcdef";
        assertEquals("cd",str.substring(2,4));
    }
}
