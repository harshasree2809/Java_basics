public class Datatypes {
    
    public static void main(String[] args) {
      
       
        // Range: -128 to 127
        byte by = 100; // byte: Very small whole numbers
        System.out.println("byte value: " + by);

       
        // Range: -32,768 to 32,767
        short sh = 30000; // short: Small whole numbers
        System.out.println("short value: " + sh);

       
        // Range: -2,147,483,648 to 2,147,483,647
        int num = 500000; // int: Standard whole numbers 
        System.out.println("int value: " + num);

       
        // Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long lo = 9000000000L; // long: Very large whole numbers (needs 'L' at the end)
        System.out.println("long value: " + lo);

        // float: Decimal numbers with less precision (needs 'f' at the end)
        // Range: Approx ±3.4e38 (6-7 decimal digits of precision)
        float fl = 5.75f;
        System.out.println("float value: " + fl);

       
        // Range: Approx ±1.7e308 (15 decimal digits of precision)
        double doVal = 19.99342;  // double: Decimal numbers with high precision (default for decimals)
        System.out.println("double value: " + doVal);

        
        // Range: 0 to 65,535 (Unicode values)
        char ch = 'A';// char: Single character (letters/symbols)
        System.out.println("char value: " + ch);

        
        // Range: true or false (1 bit of information)
        boolean bo = true;// boolean: True or False only
        System.out.println("boolean value: " + bo);

        String str = "I love Moon";// tring: Sequence of characters (Non-primitive)
        System.out.println("String value: " + str);

       
        // Range: Fixed size once created (Indices: 0 to length-1)
        int[] arr  = {10, 20, 30}; // Array: Collection of same-type variables
        System.out.println("Array value at index 0: " + arr[0]);
    }
}