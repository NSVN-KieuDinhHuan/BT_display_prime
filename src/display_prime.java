import java.util.Scanner;

public class display_prime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào một số lượng số nguyên tố muốn in ra");
        int input= scanner.nextInt();
        int count=0;
        int number=0;
        while (count<input) {
            boolean isPrime = true;
            if (number < 2) {
                isPrime = false;
            } else if (number == 2) {
                isPrime = true;
            } else {
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
                System.out.println(number);
            }
            number++;
        }
    }
}
