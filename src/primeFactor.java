import java.util.Scanner;

/**
 * Created by karthika on 22/08/15.
 */
public class primeFactor {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        generate(n);

    }

    private static void generate(int n) {
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
                n=n/i;
                i--;
            }

        }
    }
}
