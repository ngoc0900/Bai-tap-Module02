import java.util.Scanner;

public class btvnBai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " là số chẵn");
        } else {
            System.out.println(num + " là số lẻ");
        }
    }
}
