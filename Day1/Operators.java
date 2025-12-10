public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        System.out.println("Arithmetic Operators");
        int x = 12;
        int y = 2;

        System.out.println(x + y); 
        System.out.println(x - y); 
        System.out.println(x * y); 
        System.out.println(x / y); 
        System.out.println(x % y); 

        int z = 6;
        ++z;
        System.out.println(z); 
        --z;
        System.out.println(z); 
        System.out.println("-------------------------------------------------------");
        //Assignment operators 
         System.out.println("Assignment operators ");
    
         int num = 5; 
        System.out.println("num = 5   -> " + num);

        num += 3; // Same as: num = num + 3
        System.out.println("num += 3  -> " + num); 
        num = 5; 
        num -= 3; // Same as: num = num - 3
        System.out.println("num -= 3  -> " + num); 
        num = 5; 
        num *= 3; // Same as: num = num * 3
        System.out.println("num *= 3  -> " + num); 
        num = 5; 
        num /= 3; // Same as: num = num / 3
        System.out.println("num /= 3  -> " + num); 
        num = 5; 
        num %= 3; // Same as: num = num % 3
        System.out.println("num %= 3  -> " + num); 
        num = 5;  // Binary 101
        num &= 3; // Binary 011 
        System.out.println("num &= 3  -> " + num); 
        num = 5;  // Binary 101
        num |= 3; // Binary 011 
        System.out.println("num |= 3  -> " + num); 
        num = 5;  // Binary 101
        num ^= 3; // Binary 011 
        System.out.println("num ^= 3  -> " + num); 
        num = 5; 
        num >>= 3; // Shift binary 101 right by 3 places -> 0
        System.out.println("num >>= 3 -> " + num); 
        num = 5; 
        num <<= 3; // Shift binary 101 left by 3 places -> 101000 (40)
        System.out.println("num <<= 3 -> " + num);
         System.out.println("-------------------------------------------------------");
        //Comparison Operators
         System.out.println("Comparison Operators");
         int x1 = 7;
        int y1 = 2;
        System.out.println(x1 == y1);
        System.out.println(x1 != y1);
        System.out.println(x1 > y1);
        System.out.println(x1 < y1);
        System.out.println(x1 >= y1);
        System.out.println(x1 <= y1);
         System.out.println("-------------------------------------------------------");
         //Logical Operators
         System.out.println("Logical Operators");
         int x2 = 6;
        System.out.println(x2 > 3 && x2 < 10);
        System.out.println(x2 > 3 || x2 < 10);
        System.out.println(!(x2 > 3 && x2 < 10));
         System.out.println("-------------------------------------------------------");
         



    }
}
