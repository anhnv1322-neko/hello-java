package for1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num1: ");
        int num1 = sc.nextInt();
        System.out.print("num2: ");
        int num2 = sc.nextInt();
        int sum = 0;
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac so le o giua " + num1 + " va " + num2 + " la: " + sum);
    }
}
