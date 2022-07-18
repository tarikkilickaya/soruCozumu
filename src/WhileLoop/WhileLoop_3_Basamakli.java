package WhileLoop;

public class WhileLoop_3_Basamakli {
    public static void main(String[] args) {
        // For loop ve while Loop kullanarak 3 basamakli sayilardan 15, 20 ve 90’na tam
        //bolunebilen sayilari yazdirin.

        System.out.print("For ile : ");
        for (int i = 100; i <= 999; i++) {
            if (i % 15 == 0 && i % 20 == 0 && i % 90 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("");
        int ucBasEnKucuk = 100;
        int ucBasEnBuyuk = 999;

        System.out.print("While ile : ");
        while (ucBasEnKucuk <= ucBasEnBuyuk){
            if (ucBasEnKucuk % 15 == 0 && ucBasEnKucuk % 20 == 0 && ucBasEnKucuk % 90 == 0) {
                System.out.print(ucBasEnKucuk + " ");
            }
            ucBasEnKucuk++;
        }
    }
}
