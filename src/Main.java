import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int num, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz. (Bir 'tek' sayı girerseniz program sonlandırılacaktır.)");
        num = scanner.nextInt();

        // The loop continues as long as the number entered is even.
        while (num % 2 == 0)
        {
            // If the entered number is divisible by 4, it is added to the total
            if (num % 4 == 0)
                sum += num;
            System.out.println("Bir sayı giriniz. (Bir 'tek' sayı girerseniz program sonlandırılacaktır.)");
            num = scanner.nextInt();
        }
        System.out.println("Toplam: " + sum);
    }
}