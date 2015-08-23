import java.util.Scanner;

/**
 * Created by karthika on 07/08/15.
 */
public class Diamond {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        singleIsosceles(num);
        diamondTriangle(num);
        diamondTriangleName(num);
    }

    private static void diamondTriangle(int num) {
        singleIsosceles(num);
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int m = num; m > i; m--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    private static void diamondTriangleName(int num) {
        singleIsosceles(num+1);
        System.out.println("  N*A*M*E");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int m = num; m > i; m--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    private static void singleIsosceles(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < i; m++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


