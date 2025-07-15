import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Manual (Explicit) Typecasting – Narrowing
        double num1 = 50.49;
        int num2 = (int) num1;  // fractional part lost
        System.out.println("Original double: " + num1);
        System.out.println("After narrowing to int: " + num2);

        // Declaring various types
        byte a = 10;
        short b = 10;
        int c = 10;
        long d = 10;
        float e = 10.0f;
        double f = 10.0;

        System.out.println("\n=== Manual Typecasting (Narrowing) ===");
        int fromByte = (int) a;
        byte toByte = (byte) c;
        short toShort = (short) d;
        int toInt = (int) f;

        System.out.println("byte to int: " + fromByte);
        System.out.println("int to byte: " + toByte);
        System.out.println("long to short: " + toShort);
        System.out.println("double to int: " + toInt);

        System.out.println("\n=== Automatic Typecasting (Widening) ===");
        int num = 100;
        long longNum = num;            // int → long
        float floatNum = num;          // int → float
        double doubleNum = floatNum;   // float → double

        System.out.println("int to long: " + longNum);
        System.out.println("int to float: " + floatNum);
        System.out.println("float to double: " + doubleNum);

        System.out.println("\n=== Char and Int Conversion ===");
        char ch = 'A';
        int ascii = ch;                // char → int
        char newChar = (char) (ascii + 1);  // int → char

        System.out.println("char to int (ASCII): " + ascii);
        System.out.println("int to char: " + newChar); // B

        System.out.println("\n=== Overflow in Narrowing ===");
        int largeInt = 130;
        byte overflowByte = (byte) largeInt;
        System.out.println("int 130 to byte: " + overflowByte); // -126 due to overflow

        sc.close();
    }
}
