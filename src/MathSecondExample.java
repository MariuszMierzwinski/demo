import java.util.Scanner;

public class MathSecondExample {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.println("Wprowadz promien: ");
        double radius=io.nextDouble();
        System.out.println("Obwd wynosi: " + (2* radius * Math.PI));
        System.out.println("Pole wynosi:"+ (Math.PI*Math.pow(radius,2)));

    }
}
