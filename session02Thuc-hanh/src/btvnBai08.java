import java.util.Scanner;

public class btvnBai08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap ngay thang nam");
        int ng = sc.nextInt();
        int th = sc.nextInt();
        int n = sc.nextInt();
        switch (th){
            case 1,3,5,7,8,10,12:
                if (ng>0 && ng <=30) {
                    System.out.println("ngay thang nam hop le");
                } else {
                    System.out.println("ngay thang nam khong hop le");
                }
                break;
            case 4,6,9,11:
                if (ng>0 && ng<=30){
                    System.out.println("ngay thang nam hop le");
                } else {
                    System.out.println("ngay thang nam khong hop le");
                }
                break;
            case 2:
                if (ng>0 && ng <=28 || ng<=29) {
                    System.out.println("ngay thang nam hop le");
                } else {
                    System.out.println("ngay thang nam khong hop le");
                }
                break;
            default:
                System.out.println("ngay thang nam khong hop le");
        }
    }
}
