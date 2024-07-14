package com.validateinput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import function_practice.src.main.java.com.validateinput.validate_input;

class AssertionTest 
{

    @Test
    void testname_first()
    {
        Assertions.assertTrue(validate_input.name_first("Yamini"));
        Assertions.assertFalse(validate_input.name_first("Y"));
    }

   
}

