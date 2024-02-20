import java.util.Scanner;

public class btvnBai06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chi so cu");
        int csc = sc.nextInt();
        System.out.println("nhap vao chi so moi");
        int csm = sc.nextInt();
        int kwh = csm - csc;
        System.out.println("da tieu thu " + kwh + " kwh");
        if (kwh >= 0 && kwh < 50) {
            System.out.println("gia dien la 10.000d");
        } else if (kwh >= 50 && kwh < 100) {
            System.out.println("gia dien la 15.000d");
        } else if (kwh >= 100 && kwh < 150) {
            System.out.println("gia dien la 20.000d");
        } else if (kwh >= 150 && kwh <200) {
            System.out.println("gia dien la 25.000d");
        } else if (kwh >= 200) {
            System.out.println("gia dien la 30.000d");
        }
    }
}
