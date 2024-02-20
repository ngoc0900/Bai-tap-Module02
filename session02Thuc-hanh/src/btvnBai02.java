import java.util.Scanner;

public class btvnBai02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm html ");
        int html = sc.nextInt();
        System.out.println("Nhập vào điểm css ");
        int css = sc.nextInt();
        System.out.println("Nhập vào điểm Javascrip");
        int js = sc.nextInt();
        int dtb = (html + css + js )/3;
        System.out.println("điểm trung bình là " + dtb);
        if (dtb >= 0 && dtb < 5){
            System.out.println("xếp loại yếu");
        } else if (dtb >= 5 && dtb < 7) {
            System.out.println("xếp loại Trung bình");
        } else if (dtb >= 7 && dtb < 8) {
            System.out.println("xếp loại khá");
        } else if (dtb >= 8 && dtb < 9) {
            System.out.println("xếp loại Giỏi");
        } else if (dtb >= 9 && dtb < 10) {
            System.out.println("xếp loại Xuất sắc");
        }
    }
}
