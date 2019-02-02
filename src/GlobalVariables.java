public class GlobalVariables {
    static int myInteger =19;

    public static void main(String[] args) {
        int myInteger =5;

        System.out.println("to wywouje sie w main");
        myMethod();
    }
    public static void myMethod(){

        int myInteger=10;

        System.out.println("To wywoluje sie z mojej metody");
        System.out.println(myInteger);
    }
}
