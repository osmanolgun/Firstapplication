package homework_02_printNumbers;

import java.util.Scanner;

public class PrintNumbersVertical {

    public static void main(String[] args) {

        /*
        Her digitin 3 pixel genişliği ve 5 pixel yüksekliği olduğunu varsaydım.
        10'luk sayı sistemindeki 10 rakamın ekranda görülecek pixelleri 1, boş olacak yerler 0 olacak şekilde pattern aşağıda tanımlandı.
        Kalınlık 1 seçilse bile en az 15 pixel çizdirilmesi gerekiyor. Kalınlığa göre rakamın genişliği ve yüksekliği orantılı olarak döngü içerisinde artırıldı.
         */
        final int WIDTH = 3, HEIGHT = 5;

        final String ZERO = "111101101101111";
        final String ONE  = "001001001001001";
        final String TWO  = "111001111100111";
        final String THREE= "111001111001111";
        final String FOUR = "101101111001001";
        final String FIVE = "111100111001111";
        final String SIX  = "111100111101111";
        final String SEVEN= "111101001001001";
        final String EIGHT= "111101111101111";
        final String NINE = "111101111001111";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        String printNumber= scanner.next();
        System.out.print("Enter a character : ");
        String character= scanner.next();
        System.out.print("Enter thickness : ");
        int thickness= scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= printNumber.length(); i++) { //rakamlar döngüsü

            int numeral = Character.getNumericValue(printNumber.charAt(i-1));
            String numeralPattern ="";
            // İlgili rakama karşılık gelen String patern bulunuyor.
            switch (numeral){
                case 0 : numeralPattern = ZERO;break;
                case 1 : numeralPattern = ONE;break;
                case 2 : numeralPattern = TWO;break;
                case 3 : numeralPattern = THREE;break;
                case 4 : numeralPattern = FOUR;break;
                case 5 : numeralPattern = FIVE;break;
                case 6 : numeralPattern = SIX;break;
                case 7 : numeralPattern = SEVEN;break;
                case 8 : numeralPattern = EIGHT;break;
                case 9 : numeralPattern = NINE;break;
            }
            for (int j = 0; j < HEIGHT; j++) {
                for (int k = 0; k <thickness ; k++) {
                    for (int l = 0; l <WIDTH ; l++) {
                        for (int m = 0; m <thickness ; m++) {
                            char digitInPattern = numeralPattern.charAt(l + (j*WIDTH));
                            if(digitInPattern=='1') System.out.print(character);
                            else System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
            // Rakamlar arasında boşluk bırakıyoruz.
            if(i<printNumber.length()) {
                for (int j = 0; j < thickness ; j++) {
                    System.out.println();
                }
            }
        }
    }
}
