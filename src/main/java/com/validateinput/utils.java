package com.validateinput;

public class utils 
{
    /** 
    * Function name_first takes String value as argument and returns a boolean value thereby
    * checking if the String value is Empty or its length is <=2 or >2
    */
    public static boolean name_first(String fir_name)
    {
        if(fir_name.isEmpty())  // checking string if the entered value is empty and returning boolean
        {
            System.out.println("The first name must be filled in.");
            return false;
        }
        
        else if(fir_name.length()<2)    // checking string if the entered value has minimum 2 characters
        {
            System.out.println(fir_name + " is not a valid first name. It is too short.");
            return false;
        }
        else
        {
            return true;
        }
        //return false;
    }

     /** 
    * Function name_last takes String value as argument and returns a boolean value thereby
    * checking if the String value is Empty or its length is <=2 or >2
    */
    
    public static boolean name_last(String la_name)
    {
        if(la_name.isEmpty())   //Checking is string value is Empty
        {
            System.out.println("The last name must be filled in.");
            return false;
        }
        else if(la_name.length()<2) // Checking if string length has minimum 2 characters
        {
            System.out.println(la_name + " is not a valid last name. It is too short.");
            return false;
        }
        else
        {
            return true;
        }
    }

    /** 
     * Function zipC takes String value as argument and returns boolean value thereby checking if
     * the String is numeric value or not
     */

    public static boolean zipC(String zipcod) 
    {
        int ziplen = zipcod.length();
        for(int i=0; i<ziplen; i++)
        //for(Character ctemp:zipcod)
        {
            // Character class is used to check if string is Digit
            if(!Character.isDigit(zipcod.charAt(i)))    
            {
                System.out.println("The ZIP code must be a numeric value.");
                return false;   // once the return gets executed, rest of the code wont be checked 
            }
        }
        return true;
    }
    /** 
     * Function employee takes String value as argument and returns boolean value thereby checks
     * if the string has hyphen and then splita the string using that hyphen. The first part of split
     * should be letters and length=2 and the last part should be numbers and length=4
     */

    public static boolean employee(String empId) 
    {
        String hyphen = "-";
        int emplen = empId.length();    // String length
        // System.out.println(emplen);
        if(emplen != 7) // Check if string length is 7 characters or not
        {
            System.out.println(empId + " is not a valid ID.");
            return false;
        }    
                // Check if the string has hyphen or not
        else if (!empId.contains("-"))   // Check if string has hyphen or not
        {
            System.out.println(empId + " is not a valid ID.");
            return false;
        }        
        for (int i = 0; i <= 1; i++) // Check if first 2 characters of string has letter or not
        {
            if (!Character.isLetter(empId.charAt(i))) 
            {
                System.out.println(empId + " is not a valid ID.");
                return false;
            }
        }
        if (empId.charAt(2) != '-') 
        {
            System.out.println(empId + " is not a valid ID.");
            return false;
        }
        for (int i = 3; i <= 6; i++) //
        {
            if (!Character.isDigit(empId.charAt(i))) // Check if last 4 characters of string has digit or not
            {
                System.out.println(empId + " is not a valid ID.");
                return false;
            }
        }
        return true;
    }
}
