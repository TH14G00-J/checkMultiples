import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int x = sc.nextInt(), y = sc.nextInt();

        if (x % y == 0 || y % x == 0) {
            System.out.println("They are multiples");
        }else {
            System.out.println("They are not multiples");
        }

        sc.close();
    }
}