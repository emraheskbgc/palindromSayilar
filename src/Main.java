import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){

        int temp = number;
        int reversNumber=0;
        int lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber){
            return true;
        }else {
            return false;
        }

    }
    public static void main(String[] args) {

        System.out.println(isPalindrom(8008));
    }
}
