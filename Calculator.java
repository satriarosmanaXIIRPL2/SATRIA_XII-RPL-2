import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Kalkulator");
        System.out.print("Masukkan angka pertama: ");
        num1 = scanner.nextDouble();

        System.out.print("Pilih operasi (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Hasil: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Hasil: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Hasil: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Hasil: " + result);
                } else {
                    System.out.println("Tidak dapat melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }
    }
}
