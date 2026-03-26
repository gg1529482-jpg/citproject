import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
        // int age = 65;
        if (age >= 18) {
            if (age >=65) {
                System.out.println("Eligible to vote and avil government fund");
            }else
                System.out.println("We are eligible to vote not eligible to avil government");

        } else
            System.out.println("We are not eligible to vote and not eligible to avil government");

    }
    
}
