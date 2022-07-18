package WhileLoop;

public class WhileLoop_1den_100e_KadarCiftSayilar {
    public static void main(String[] args) {
        // 1'den 100' kadar olan çift sayıları ekrana yazdır

        int i = 1;

        while (i<=100){
            if (i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
