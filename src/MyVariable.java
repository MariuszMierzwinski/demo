public class MyVariable {
    public static void main(String[] args) {
        char myChar;
        byte myByte;
        short mySchort;
        long myLong;
        double myDouble;
        String number="2";
        String rzeczownik = "samolot";
        String przymiotnika ="pasazerski";
        String spacja=" ";
        String opis= rzeczownik+spacja+przymiotnika;
        int maxInt=Integer.MAX_VALUE;

        String myString = "ala ma kota";


        System.out.printf("max %.4f\n", Float.MAX_VALUE);
        System.out.println(myString);
        System.out.println(opis);

        System.out.println(maxInt);
        maxInt=maxInt+1;
        System.out.println(maxInt);

        String mySuperText="Piotrek";
        mySuperText="Aam";
        System.out.println(mySuperText);

        final String My_Text="Moj tekst";
       // My_Text = "inny text";  nie mozna zmieniac stalej final!!!!
        printMyCodeFromMyMethod();
    }

    public static void printMyCodeFromMyMethod() {
        System.out.println("to jest kod z mojej metody myMetod");

    }
    public static void printMinAndMaxValueOfPrimitiveType() {
        System.out.println(" Min byte value= " + Byte.MIN_VALUE);
        System.out.println("Max byte value= "+ Byte.MAX_VALUE);

        System.out.println("Min short value= "+ Short.MIN_VALUE);
        System.out.println("Max short value= "+ Short.MAX_VALUE);

        System.out.println("Min intiger value= "+ Integer.MIN_VALUE);
        System.out.println("Max intiger value= "+ Integer.MAX_VALUE);

        System.out.println("Min long value= "+ Long.MIN_VALUE);
        System.out.println("Max long value= "+ Long.MAX_VALUE);

        System.out.println("Min float value= "+ Float.MIN_VALUE);
        System.out.println("Max float value= "+ Float.MAX_VALUE);

        System.out.println("Min double value= "+ Double.MIN_VALUE);
        System.out.println("Max double value= "+ Double.MAX_VALUE);


    }
}












