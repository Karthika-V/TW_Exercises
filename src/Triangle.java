import java.util.Scanner;

/**
 * Created by karthika on 07/08/15.
 */
public class Triangle {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the number");
        num = in.nextInt();
        singleAsterisk();
        verticalAsterisk(in,num);
        horizontalAsterisk(in,num);
        rightTriangleAsterisk(in,num);
    }

    private static void singleAsterisk() {
        System.out.println("*");
    }

    private static void verticalAsterisk(Scanner in, int num) {
        for (int i = 0; i < num; i++)
            System.out.print("*");
    }

    private static void horizontalAsterisk(Scanner in, int num) {
        System.out.println();
        for (int i = 0; i < num; i++)
            singleAsterisk();
    }

    private static void rightTriangleAsterisk(Scanner in, int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
