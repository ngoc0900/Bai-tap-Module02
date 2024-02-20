import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong bat ki");
        int num = sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        for (int i = 2; i <= num; i++){
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        System.out.println(fn);
    }
}
