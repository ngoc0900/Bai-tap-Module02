import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cd,cr,cc,bk,dienTich,chuVi = 0;
        final double pi = 3.14;
        System.out.println("moi ban nhap chieu dai");
        cd = sc.nextInt();
        System.out.println("moi ban nhap chieu rong");
        cr = sc.nextInt();
        System.out.println("moi ban nhap do dai canh ");
        cc = sc.nextInt();
        System.out.println("moi ban nhap ban kinh");
        bk = sc.nextInt();sc.nextLine();
        System.out.println("mời bạn nhập hình học tôi sẽ tính cho bạn diện tích và chu vi của nó");
        String text;
        text = sc.nextLine();
        switch (text){
            case "hcn":
                dienTich = cd * cr ;
                chuVi = (cd + cr) * 2 ;
                System.out.printf("diện tích hcn là %d chu vi là %d ", dienTich,chuVi);
                break;
            case "hv":
                dienTich = cd * cr ;
                chuVi = 4 * cd;
                System.out.printf("diện tích hv là %d chu vi là %d ", dienTich,chuVi);
                break;
            case "tam giac":
                dienTich = cd * cr ;
                chuVi = 4 * cd;
                System.out.printf("diện tích hv là %d chu vi là %d ", dienTich,chuVi);
                break;
            case "hinh tron":
                dienTich = cd * cr ;
                chuVi = 4 * cd;
                System.out.printf("diện tích hv là %d chu vi là %d ", dienTich,chuVi);
                break;

        }
    }
}
