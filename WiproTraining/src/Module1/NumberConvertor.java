package Module1;

public class NumberConvertor {
//Vivek Agrahari
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java NumberConvertor <number>");
            return;
        }
        
        int number = Integer.parseInt(args[0]);

        System.out.println("Given Number: " + number);
        System.out.println("Binary equivalent: " + Integer.toBinaryString(number));
        System.out.println("Octal equivalent: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal equivalent: " + Integer.toHexString(number).toUpperCase());
    }
}

