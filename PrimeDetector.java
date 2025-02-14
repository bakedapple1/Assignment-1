import java.util.Scanner;


public class PrimeDetector {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.print("Enter a positive number: ");
        input = scanner.nextInt();

        while (true) {
            if (input > 0);
                isPrime(input);
                break;
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {
        
        int input =  num;

        if (input <= 3) {
            System.out.println("Your number was a prime");
            return true;

        } else if (input % 2 == 0) {
            System.out.println("Your number was divisible by 2");
            return false;
        }

        for (int i=3; i<=input/2 ; i+=2) {

            if (input%i == 0) {
                System.out.println("Your number was divisible by " + i);
                return false;
            }
        }

        System.out.println("Your number was a prime");
        return true;
    }
}
