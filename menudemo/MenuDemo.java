package menudemo;

import java.util.Scanner;

public class MenuDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Student managerment");
            System.out.println("-------------------------");
            System.out.println("1. show student list");
            System.out.println("2. add new student");
            System.out.println("3. update student information");
            System.out.println("4. delete student by rollnumber");
            System.out.println("5. search student by keyword");
            System.out.println("6. exit program");
            System.out.println("-------------------------");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("display student list!");
                    break;
                case 2:
                    System.out.println("add student infomation!");
                    break;
                case 3:
                    System.out.println("update student infomation!");
                    break;
                case 4:
                    System.out.println("delete student");
                    break;
                case 5:
                    System.out.println("search student");
                    break;
                case 6:
                    System.out.println("see u later");
                    break;
                default:
                    System.out.println("invalid choice. Please enter number from 0 to 5");
                    break;
            }
            if (choice == 0) {
                break;
            }
            System.out.println("press enter to continue");
            scanner.nextLine();
        }
    }
}
