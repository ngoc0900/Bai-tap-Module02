import java.util.Scanner;

public class btvn2Bai1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if(10%i==0){
                sum += i;
            }
        }
        System.out.println("tong cac so chan do la :" + sum);
    }
}
