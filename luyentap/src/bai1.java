import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int sum = 0;

        System.out.println("Nguoi dung nhap vao mot so nguyen duong");
        n = scanner.nextInt();
        for (int i = 1; i <= n ; i++){
            sum += i;
        }
        System.out.println("tong cac so tu 1 den " + n + " la " + sum );

    }
}
