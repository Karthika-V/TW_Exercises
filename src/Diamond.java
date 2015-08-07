import java.util.Scanner;

/**
 * Created by karthika on 07/08/15.
 */
public class Diamond {
    public static void main(String args[]){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        num = in.nextInt();

        //Isosceles
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.print("");

        }
    }

}
