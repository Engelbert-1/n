public class Main {
    public static void convertToBinary(double realNumber) {
        if (realNumber >= 1 || realNumber <= 0) {
            System.out.println("Error: Số thực phải nhỏ hơn 1.");
            return;
        }

        MyQueue binaryQueue = new MyQueue();

        while (realNumber > 0) {
            realNumber *= 2;

            if (realNumber >= 1) {
                binaryQueue.enqueue(1);
                realNumber -= 1;
            }
            
            else {
                binaryQueue.enqueue(0);
            }
          
            if (binaryQueue.isEmpty() || binaryQueue.dequeue() == 1) {
                System.out.println("Error: Biểu diễn nhị phân vượt quá 32 bit");
                return;
            }
        }

        System.out.print("Biểu diễn nhị phân: 0.");
        while (!binaryQueue.isEmpty()) {
            System.out.print((int)binaryQueue.dequeue());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        double realNumber = 0.625; 
        System.out.println("Số thực: " + realNumber);
        convertToBinary(realNumber);
    }
}