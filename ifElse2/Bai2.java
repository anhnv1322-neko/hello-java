package ifElse2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so diem: ");
        int marks = sc.nextInt();

        if (marks > 75) {
            System.out.println("Grade A");
        } else if (marks > 60) {
            System.out.println("Grade B");
        } else if (marks > 45) {
            System.out.println("Grade C");
        } else if (marks > 35) {
            System.out.println("Grade D");
        } else if (marks > 0 && marks < 35) {
            System.out.println("Grade E");
        } else {
            System.out.println("Diem khong hop le");
        }
    }
}
