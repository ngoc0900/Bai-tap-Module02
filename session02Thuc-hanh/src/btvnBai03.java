import java.util.Scanner;

public class btvnBai03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào một số nguyên a");
        int a = sc.nextInt();
        System.out.println("nhập vào một số nguyên b");
        int b = sc.nextInt();sc.nextLine();
        int cong,tru,nhan,chia = 0;
        System.out.println("Bạn muốn thực hiện phép tính nào trong các phép tính cộng, trừ, nhân, chia? ");
        String text = sc.nextLine();
        switch (text){
            case "cộng":
                cong = a + b;
                System.out.println("kết quả là: " + cong);
                break;
            case "tru":
                tru = a - b;
                System.out.println("kết quả là: " + tru);
                break;
            case "Nhân":
                nhan = a * b;
                System.out.println("kết quả là: " + nhan);
                break;
            case "chia":
                chia = a / b;
                System.out.println("kết quả là: " + chia);
                break;
            default:
                System.out.println("không có phép tính này");
        }

    }
}
