package WhileLoop;

public class WhileLoop_3_13 {
    public static void main(String[] args) {

        // While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int bas = 3;
        int bitis = 13;

        while (bas <= bitis) {
            if (bas % 2 !=0) {
                System.out.println(bas);
            }
            bas++;
        }
    }
}