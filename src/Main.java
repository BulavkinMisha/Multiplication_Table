import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.println("First Number");
        int kill = a.nextInt();
        System.out.println("Second Number");
        int dead = a.nextInt();

        for (int i = kill; i < dead+1 ; i++){
            for (int k = 2; k < 10 ; k++){
                System.out.println(i + " * " + k + " = " + k * i);
            }
            System.out.print(" ");
        }
    }
}