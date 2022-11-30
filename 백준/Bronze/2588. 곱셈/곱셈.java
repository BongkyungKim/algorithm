import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A, B;
        A = scanner.nextLine();
        B = scanner.nextLine();

        System.out.println(Integer.parseInt(A)*Integer.parseInt(String.valueOf(B.charAt(2))));
        System.out.println(Integer.parseInt(A)*Integer.parseInt(String.valueOf(B.charAt(1))));
        System.out.println(Integer.parseInt(A)*Integer.parseInt(String.valueOf(B.charAt(0))));
        System.out.println(Integer.parseInt(A)*Integer.parseInt(B));

    }
}
