package ForLoop;

public class ForLoop_Ornekler {
    public static void main(String[] args) {

        // 1. soru
        // 1'den 100' kadar olan tam sayıları toplayın.

        int toplam = 0;
        for (int i = 1; i <= 100; i++) {
            toplam += i;
        }
        System.out.println("1'den 100'e kadar olan sayıların toplamı : " + toplam);

        System.out.println("");


        // 2. soru:
        // Verilen iki sayının ilkinden başlayıp ikincisine kadar
        // üçer üçer yazdırın. (İkinci sayı şartları sağlamıyorsa yazdırılmayabilir.)

        int bas = 20;
        int bitis = 61;

        for (int i = bas; i <= bitis ; i+= 3) {
            System.out.print(i+ " ");
        }

        System.out.println("\n");


        // 3. soru:
        // Verilen sayıdan bağlayarak geriye 1'e doğru
        // 3 ile bölünebilen sayıları yazdırın.

        int baslangic = 13;

        for (int i = baslangic; i >=1 ; i--) {
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }






    }
}
