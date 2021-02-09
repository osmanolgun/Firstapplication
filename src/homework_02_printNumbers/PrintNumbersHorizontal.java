package homework_02_printNumbers;

import java.util.Scanner;

public class PrintNumbersHorizontal {

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

        //Yukarıdan aşağıya doğru satır sayısı
        for (int i = 0; i < HEIGHT; i++) {
            //Satır sayısı * Kalınlık kadar artıyor
            for (int j = 0; j < thickness; j++) {
                //Aynı satırda girilen sayı içerisinden rakamları sırayla okuyor.
                for (int k = 0; k < printNumber.length() ; k++) {
                    int numeral = Character.getNumericValue(printNumber.charAt(k));
                    String numeralPattern ="";
                    //System.out.println("numeral = " + numeral);
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
                    //Patternden ilgili satırdaki ilk 3 karakter bilgisini alıyor.
                    for (int m = 0; m < WIDTH  ; m++) {
                        //Kalınlık katar aynı satırı tekrarlıyor
                         for (int n = 0; n < thickness ; n++) {
                              char digitInPattern = numeralPattern.charAt(m+ i*WIDTH );//Hangi satırda (i) olduğuna göre patternden okuma yapıyor.
                              if(digitInPattern=='1') System.out.print(character);
                              else System.out.print(" ");
                         }
                    }
                    // Her satırda rakamlar arasına boşluk koyuyor
                    for (int l = 0; l <thickness ; l++) {
                        System.out.print(" ");
                    }
                }
                // Her satırdan sonra alt satıra geçiyor
                System.out.println();
           }


        }




    }
}
