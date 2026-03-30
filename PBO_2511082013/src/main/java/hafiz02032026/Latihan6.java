package hafiz02032026;

public class Latihan6 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 23;
        int number3 = 5;
        
        int max = (number1>number2)? number1 :(number2>number3)? number2 : number3;
        System.out.println(max);
    }
}