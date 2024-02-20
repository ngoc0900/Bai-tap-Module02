import java.util.Scanner;

public class btvnBai04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soNguyen;
        System.out.println("nhap vao so nguyen");
        soNguyen = scanner.nextInt();
        if (soNguyen%3==0 && soNguyen%5==0){
            System.out.println("so  chia het cho 3 va 5");
        } else  {
            System.out.println("khong chia het cho 3 va 5");
        }
    }
}
