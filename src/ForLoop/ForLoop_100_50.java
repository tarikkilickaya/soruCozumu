package ForLoop;

public class ForLoop_100_50 {
    public static void main(String[] args) {

        // 100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda yazdirin

        int input = 100;
        for (int i = 100; i >= 50; i--) {
            if (i > 50) {
                System.out.print(i + ",");
            } else {
                System.out.print(i);
            }
        }
    }
}
