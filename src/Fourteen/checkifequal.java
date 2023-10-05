package Fourteen;
import java.util.Scanner;
public class checkifequal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        String regex = "^abcdefghijklmnopqrstuv18340$";
        if (inp.matches(regex)){
            System.out.println("Match");
        }
        else{
            System.out.println("No match");
        }
    }
}
