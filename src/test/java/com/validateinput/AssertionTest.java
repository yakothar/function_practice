package function_practice.src.main.java.com.validateinput;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.validateinput.utils;

//import function_practice.src.main.java.com.validateinput.Validate_input;

class AssertionTest 
{

    @Test
    void testname_first()
    {
        // Assertions.assertTrue(Validate_input.name_first("Yamini"));
        // Assertions.assertFalse(Validate_input.name_first("Y"));

        Assertions.assertTrue(utils.name_first("Yamini"));
        Assertions.assertFalse(utils.name_first("Y"));
    } 
    
    @Test
    void testlast_first()
    {
        Assertions.assertTrue(utils.name_last("Kothari"));
        Assertions.assertFalse(utils.name_last("K"));
    }

    @Test
    void testzipC()
    {
        Assertions.assertTrue(utils.zipC("313001"));
        Assertions.assertFalse(utils.zipC("qwerty"));
    }

    @Test
    void testemployee()
    {
        Assertions.assertTrue(utils.employee("qw-1234"));
        Assertions.assertFalse(utils.employee("1234-qw"));
    }
}