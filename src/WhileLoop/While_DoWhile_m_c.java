package WhileLoop;

public class While_DoWhile_m_c {
    public static void main(String[] args) {
        // ’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri yazdirin

        char harf = 'm';

        do {
            System.out.print(harf + " ");
            harf--;
        } while (harf >= 'c');
    }
}
