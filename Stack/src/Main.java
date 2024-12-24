public class Main {
    // Method to convert decimal to binary using a stack
    public static void convertToBinary(int decimalNumber) {
        MyStack stack = new MyStack();

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        System.out.print("Binary representation: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int decimalNumber = 25; // Example decimal number
        System.out.println("Decimal number: " + decimalNumber);
        convertToBinary(decimalNumber);
    }
}