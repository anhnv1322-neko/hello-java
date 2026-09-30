package ifElse1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        char alphabet = sc.next().charAt(0);
        switch (alphabet) {
            case 'A', 'a':
                System.out.println("Ada");
                break;
            case 'B', 'b':
                System.out.println("Basic");
            case 'C', 'c':
                System.out.println("Cobol");
            case 'D', 'd':
                System.out.println("dBase III");
            case 'f', 'F':
                System.out.println("Fortran");
            case 'p', 'P':
                System.out.println("Pasal");
            case 'V', 'v':
                System.out.println("Visual C++");
            default:
                break;
        }
        sc.close();
    }
}