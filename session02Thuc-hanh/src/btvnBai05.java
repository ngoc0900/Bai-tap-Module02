import java.util.Scanner;

public class btvnBai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao canh thu nhat cua tam giac");
        int a = sc.nextInt();
        System.out.println("nhap vao canh thu hai cua tam giac");
        int b = sc.nextInt();
        System.out.println("nhap vao canh thu ba cua tam giac");
        int c = sc.nextInt();
        if (a <= 0 || b <= 0 || c <= 0){
            System.out.println("ba cạnh phải > 0");
        }
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println(" là 3 cạnh của tam giác");
        }
        if (a == b && b == c ) {
            System.out.println("là tam giác đều");
        } else if (a == b || b == c || c == a) {
            System.out.println(" là tam giác cân");
        } else if (a * a + b * b == c * c || a * c + c * c == b * b || b * b + c * c == a * c) {
            System.out.println(" là tam giác vuông");
        } else {
            System.out.println("tam giác thường");
        }
    }
}
