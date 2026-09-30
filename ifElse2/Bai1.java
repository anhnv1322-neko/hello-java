package ifElse2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so thu nhat: ");
        int num1 = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int num2 = sc.nextInt();
        int diff = Math.abs(num1 - num2);
        if (num1 < 0 || num2 < 0) {
            System.out.println("Vui long nhap so lon hon 0");
        } else if (diff == num1) {
            System.out.println("Hieu bang gia tri " + num1);
        } else if (diff == num2) {
            System.out.println("Hieu bang gia tri " + num2);
        } else {
            System.out.println("Hieu khong bang bat ki gia tri nao dang nhap");
        }
    }
}
