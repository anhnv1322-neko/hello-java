package for1;

public class Bai1 {
    public static void main(String[] args) {
        for (int i = 100; i >= 5; i -= 5) {
            if (i == 5) {
                System.out.println(i);
            } else {
                System.out.print(i + ", ");
            }
        }
    }
}
