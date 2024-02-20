import java.util.Scanner;

public class btvnBai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap vao nam");
        int year = sc.nextInt();

        if (year%4 == 0){
            System.out.println( year +" la nam nhuan co 366 ngay");
        } else {
            System.out.println( year +" khong phai nam nhuan thi co 365 ngay");
        }
        System.out.println("moi ban nhap thang");
        int month = sc.nextInt();
        switch (month){
            case 1,3,5,7,8,10,12 :
                System.out.println(" la thang co 31 ngay");
                break;
            case 4,6,9,11:
                System.out.println("la thang co 30 ngay");
                break;
            case 2:
                System.out.println("co 28 hoac 29 ngay");
                break;
            default:
                System.out.println("khong co thang nay");
        }

    }
}
