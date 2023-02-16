import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int d = a*(b%10);
        int e = a*((b/10)%10);
        int f = a*(b/100);

        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println((d+(e*10)+(f*100)));
    }
}