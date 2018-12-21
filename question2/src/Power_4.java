import java.util.Scanner;

public class Power_4 {

    public static void main(String[] args) {
        System.out.println(Power_4(1));
    }

    private static boolean Power_4(int number){
        if(number<=0){
            return false;
        }

        while(number > 1){
            if(number % 4 != 0){
                return false;
            }
            number = number / 4;
        }
        return true;
    }

}
