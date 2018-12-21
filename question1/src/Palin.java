import java.util.Scanner;
public class Palin {
    public static void main(String[] args) {

        StringBuilder str1;
        int len;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string:");
        StringBuilder str  = new StringBuilder(scan.nextLine());
        str.append( scan.nextLine());
        StringBuilder sb=new StringBuilder(str);
        str1=sb.reverse();
        System.out.println(str1);
        if(str.equals(str1))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
    }
}

