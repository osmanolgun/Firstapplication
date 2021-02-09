package homework_02_printNumbers;

public class PrintDigitMuhammetHoca {

    public static void main(String[] args) {




       printDigit(4);




    }

    private static void printDigit(int i) {

        if(i==1) {
            printOne();
        }
        else if(i==2) {
            printTwo();
        }
        else if(i==3) {
            printThree();
        }
        else if(i==4) {
            printFour();
        }
        else if(i==5) {
            printFive();
        }
        else if(i==6) {
            printSix();
        }
        else if(i==7) {
            printSeven();
        }
        else if(i==8) {
            printEight();
        }
        else if(i==9) {
            printNine();
        }

    }

    public static void printZero()
    {
        //0 icin
        int a=4,size =1;
        char ch='*';

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }


        System.out.println("\n");
    }

    private static void printOne() {

        int a=4,size =1;
        char ch='*';
        for(int k=0;k<size*a;k++)
        {

            for(int j=0;j<a*size/2-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("1");

    }
    private static void printTwo()
    {
        int a=4,size =1;
        char ch='*';

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<a*size-size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {

            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        System.out.println("\n");

    }
    public static void printThree()
    {
        int a=4,size =1;
        char ch='*';
        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<a*size-size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<a*size-size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        System.out.println("\n");
    }


    private static void printFour() {
        int a=4,size =1;
        char ch='*';
        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<a*size-size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        System.out.println("\n");

    }
    private static void printFive() {

        int a=4,size =1;
        char ch='*';
        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {

            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<a*size-size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        System.out.println("\n");


    }

    public static void printSix()
    {
        int a=4,size =1;
        char ch='*';

        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }


        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println("\n");
    }
    public static void printSeven()
    {
        int a=4,size =1;
        char ch='*';
        System.out.println("\n");

        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size*a;k++)
        {

            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printEight()
    {
        int a=4,size =1;
        char ch='*';
        System.out.println("\n");

        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }


        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        for(int k=0;k<size*a/2;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int k=0;k<size;k++)
        {
            for (int i = 0; i < a * size; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }

        System.out.println("\n");
    }
    public static void printNine()
    {
        int a=4,size =1;
        char ch='*';
        for(int k=0;k<size;k++)
        {
            int i=0;
            while(i<a*size)
            {
                System.out.print(ch);
                i=i+1;
            }
            System.out.println();
        }

        for(int k=0;k<size*a;k++)
        {
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            for(int j=0;j<a*size-2*size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        for(int k=0;k<size*a/2+1;k++)
        {
            for(int j=0;j<a*size-size;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<size;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();


    }


}