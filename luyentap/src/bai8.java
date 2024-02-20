import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen duong bat ");
        int num = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= num; i++){
            n *= i;
        }
        System.out.println("giai thua cua so nguyen duong do la; " + n);
    }
}
