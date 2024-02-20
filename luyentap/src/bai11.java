public class bai11 {
    public static void main(String[] args) {
    int a,b,c;
    for (int i = 100; i < 999 ; i++){
        a = i / 100;
        b = (i-a * 100)/10;
        c = i - a * 100 -b * 10;
        if (a + b + c == 15) {
            System.out.println(i);
        }
    }

    }
}
