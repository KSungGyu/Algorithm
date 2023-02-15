import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum=0;

        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int kind = scanner.nextInt();

        for(int i=1; i<=kind; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            scanner.nextLine();
            sum += (A*B);
        }

        if(total==sum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}