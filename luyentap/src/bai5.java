import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot so nguyen");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("khong la so nguyen to");

        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(num + " la so nguyen to");
            } else {
                System.out.println(num + " khong la so nguyen to");
            }
        }
    }
}
