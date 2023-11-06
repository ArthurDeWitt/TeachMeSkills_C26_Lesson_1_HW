import java.util.Scanner;
public class Homework1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your username?");
        String username = sc.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}
