public class IncrementDecrement {
    public static void main(String[] args) {

        int myNumber=3;
        int mySecondNumber=20;

        myNumber++;
        System.out.println(myNumber);
        myNumber=myNumber+1;
        System.out.println(myNumber);

        mySecondNumber--;
        System.out.println(mySecondNumber);
        mySecondNumber=mySecondNumber-1;
        System.out.println(mySecondNumber);

        int myVariable = 100;
        System.out.println(myVariable++); //                  uwaga na tak inkrementacje !!!
        System.out.println(myVariable);

        int mySecondVariable=2000;
        System.out.println(++mySecondVariable);

        int myInteger= 5;
        int mySecondInteger=10;
        myInteger=mySecondInteger++; // najpierw przypisanie potem incrementacja !!!!
        //myinteger=10 mySecondInege
        System.out.println(myInteger);
        System.out.println(mySecondInteger);

        byte sto= 100;
        byte dwa=2;
        short stoDwa= (short) (sto+dwa);
        System.out.println(stoDwa);

    }
}
