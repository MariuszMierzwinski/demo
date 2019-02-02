import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Helo world Mariusz Mierzwinski");
        System.out.println("Identyfikator Adama wynosi" + 4);
        System.out.println("Identyfikatorr Adama wynosi" + "cztery");
        System.out.println("programista".toUpperCase());
        System.out.println(LocalDateTime.now());

        System.out.print("Hello world\n");
        System.out.print("Hello world");
        System.out.print("Zdzisaw wazy:");

        System.out.printf("Ola ma %d lat", 10);

        System.out.println(2 + 4);
        System.out.println("2" + "4");
        System.out.println(20 - 10);
        System.out.println(6 * 5);
        System.out.println(10 / 5);
        System.out.println("Dziele " + 30 + " przez " + 6 + " i otrzymalem " + 5);
        System.out.println(11 % 2 + " reszta z dzielenia 11/2 ");
        System.out.println((20 + 10 + 2 * 6) % 2);

        System.out.println(true);
        System.out.println(false);
        System.out.println(!true);
        System.out.println(!false);
        System.out.println("Negacja false to " + !false);
        System.out.println(2 > 3);
        System.out.println(2 < 3);
        System.out.println(2 == 3);
        System.out.println(3 == 3);
        System.out.println(2 != 3);
        System.out.println(3 != 3);
        System.out.println(3 != 2 + 1);
        System.out.println(2 > 3 && 3 == 3);
        System.out.println(2 < 3 && 3 == 3);
        System.out.println(10 > 2 || 5 == 4);
        System.out.println(10 < 2 || 5 == 4);

        System.out.println("cos" == "cos");
        System.out.println("cos".equals("cos"));

        System.out.println('a' + 'A');
        System.out.println('a');
        System.out.println('A' + 2);

        System.out.println("\t ala ma kota - przyklad uzycia tabulatora");
        System.out.println("          ala ma kota");
        /* komentarz*/
        // komentarxz
        //  TODO System.out.println("Motyl");
        // TODO fix me

       /* System.out.println();
        System.out.println();
        System.out.println();   -----    ctr + shift + /
        System.out.println();*/


    }
}