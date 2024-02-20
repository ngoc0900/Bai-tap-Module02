import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {

        while (true){
            Scanner sc = new Scanner(System.in);
            int a,b,tong,hieu,tich,thuong = 0;
            System.out.println("moi ban nhap so a");
            a = sc.nextInt();
            System.out.println("moi ban nhap so b");
            b = sc.nextInt();sc.nextLine();
            System.out.println("Moi nguoi dung nhap tinh nang");
            String text;
            text = sc.nextLine();
            switch (text){
                case "tong":
                    tong = a+ b;
                    System.out.println("tong 2 so la　" + tong);
                    break;
                case "hieu":
                    hieu = a- b;
                    System.out.println("hieu 2 so la　" + hieu);
                    break;
                case "tich":
                    tich = a* b;
                    System.out.println("tich 2 so la　" + tich);
                    break;
                case "thuong":
                    thuong = a/ b;
                    System.out.println("thuong 2 so la　" + thuong);
                    break;
                default:
                    System.out.println("thoat");
            }

        }



    }
}
