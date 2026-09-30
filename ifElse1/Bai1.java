package ifElse1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Grade: ");
        String grade = sc.next();
        System.out.println("Salary: ");
        double salary = sc.nextDouble();
        int allowance;
        if (salary <= 0) {
            System.out.println("Invalid, please try again");
            sc.close();
        } else if (salary > 0) {
            if (grade.equalsIgnoreCase("A")) {
                // System.out.println("Total salary:" + (salary + 300));
                allowance = 300;
            } else if (grade.equalsIgnoreCase("B")) {
                // System.out.println("Total salary: " + (salary + 250));
                allowance = 250;
            } else {
                // System.out.println("Total salary: " + (salary + 100));
                allowance = 100;
            }
            salary += allowance;
            System.out.println("Total salary: " + salary);
            sc.close();
        }
    }
}
