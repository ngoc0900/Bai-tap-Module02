import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen duong");

        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("tong cac so chan la " + sum);
    }
}