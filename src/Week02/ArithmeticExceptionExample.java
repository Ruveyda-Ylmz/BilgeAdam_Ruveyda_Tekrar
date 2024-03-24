package Week02;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        // hata çozumu

        try{
            int a=10, b=0;
            System.out.println("Result :" + a/b);

        } catch (ArithmeticException ae){
            System.out.println("ArithmeticException: cannot divide by 0");
        }
        System.out.println("Continuing execudeon..");
    }
}
